import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { StandardPurchaseOrder } from '../models/standard-purchase-order';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class PurchaseOrderService {

  constructor(private http: HttpClient) { }

  create(purchaseOrder: any): Observable<any> {
    return this.http.post<any>(`${environment.apiBaseUrl}/purchase-orders/standard`, purchaseOrder);
  }

}
