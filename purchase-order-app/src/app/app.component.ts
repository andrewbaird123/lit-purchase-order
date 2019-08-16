import { Component } from '@angular/core';
import { AuthService } from './services/auth.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'purchase-order-app';

  constructor(private auth: AuthService) { }

  isAuthenticated(): boolean {
    return this.auth.authenticated;
  }

}
