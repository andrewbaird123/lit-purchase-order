import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Router } from '@angular/router';
import { finalize } from 'rxjs/operators';
import { environment } from 'src/environments/environment';
import { User } from '../models/user';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private USER = 'user';
  private _authenticated = false;
  private NAME = 'name';

  constructor(private http: HttpClient, private router: Router) { }

  authenticate(credentials, callback) {
    const headers = new HttpHeaders(credentials ? {
      authorization: 'Basic ' + btoa(credentials.username + ':' + credentials.password)
    } : {});

    this.http.get(`${environment.apiBaseUrl}/user`, { headers: headers }).subscribe(response => {
      if (response[this.NAME]) {
        this._authenticated = true;
        const user: User = {
          name: response[this.NAME]
        };
        this.setUser(user);
      } else {
        this._authenticated = false;
      }
      return callback && callback();
    });
  }

  logout() {
    this.http.post(`${environment.apiBaseUrl}/logout`, {}).pipe(finalize(() => {
      this._authenticated = false;
      this.router.navigateByUrl('/login');
    })).subscribe();
  }

  setUser(user: User) {
    localStorage.setItem(this.USER, JSON.stringify(user));
  }

  getUser(): User {
    const userStr = localStorage.getItem(this.USER);
    const user: User = JSON.parse(userStr);
    return user;
  }

  get authenticated(): boolean {
    return this._authenticated;
  }

}
