import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PurchaseOrdersHomeComponent } from './purchase-orders-home.component';

describe('PurchaseOrdersHomeComponent', () => {
  let component: PurchaseOrdersHomeComponent;
  let fixture: ComponentFixture<PurchaseOrdersHomeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PurchaseOrdersHomeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PurchaseOrdersHomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
