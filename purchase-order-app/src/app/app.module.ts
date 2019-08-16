import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { PurchaseOrdersComponent } from './purchase-orders/purchase-orders/purchase-orders.component';
import { PurchaseOrdersHomeComponent } from './purchase-orders/purchase-orders-home/purchase-orders-home.component';
import { StandardComponent } from './purchase-orders/standard/standard.component';
import { TravelComponent } from './purchase-orders/travel/travel.component';
import { TrainingComponent } from './purchase-orders/training/training.component';
import { InfrastructureComponent } from './purchase-orders/infrastructure/infrastructure.component';
import { ContractorComponent } from './purchase-orders/contractor/contractor.component';
import { ButtonModule } from 'primeng/button';
import { InputTextModule } from 'primeng/inputtext';
import { DropdownModule } from 'primeng/dropdown';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomeComponent,
    HeaderComponent,
    PurchaseOrdersComponent,
    PurchaseOrdersHomeComponent,
    StandardComponent,
    TravelComponent,
    TrainingComponent,
    InfrastructureComponent,
    ContractorComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    ButtonModule,
    InputTextModule,
    DropdownModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
