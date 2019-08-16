import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { PurchaseOrdersComponent } from './purchase-orders/purchase-orders/purchase-orders.component';
import { PurchaseOrdersHomeComponent } from './purchase-orders/purchase-orders-home/purchase-orders-home.component';
import { StandardComponent } from './purchase-orders/standard/standard.component';
import { TravelComponent } from './purchase-orders/travel/travel.component';
import { TrainingComponent } from './purchase-orders/training/training.component';
import { InfrastructureComponent } from './purchase-orders/infrastructure/infrastructure.component';
import { ContractorComponent } from './purchase-orders/contractor/contractor.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'login', component: LoginComponent },
  {
    path: 'purchase-orders', component: PurchaseOrdersHomeComponent, children: [
      { path: '', component: PurchaseOrdersComponent },
      { path: 'standard', component: StandardComponent },
      { path: 'travel', component: TravelComponent },
      { path: 'training', component: TrainingComponent },
      { path: 'infrastructure', component: InfrastructureComponent },
      { path: 'contractor', component: ContractorComponent }
    ]
  },
  { path: '**', redirectTo: '' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
