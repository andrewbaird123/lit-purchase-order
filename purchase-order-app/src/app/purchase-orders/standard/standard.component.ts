import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, FormArray, Validators } from '@angular/forms';
import { PurchaseOrderService } from 'src/app/services/purchase-order.service';
import { Person } from 'src/app/models/person';
import { PersonService } from 'src/app/services/person.service';

@Component({
  selector: 'app-standard',
  templateUrl: './standard.component.html',
  styleUrls: ['./standard.component.scss']
})
export class StandardComponent implements OnInit {

  purchaseOrderForm: FormGroup;
  persons: Person[];
  currencies = [
    {value: 'GBP'},
    {value: 'USD'},
    {value: 'EUR'}
  ];

  constructor(
    private fb: FormBuilder,
    private purchaseOrderService: PurchaseOrderService,
    private personService: PersonService) { }

  ngOnInit() {
    this.buildForm();

    this.personService.getAll().subscribe(data => {
      this.persons = data;
    });
  }

  get items(): FormArray {
    return this.purchaseOrderForm.get('items') as FormArray;
  }

  addItem() {
    this.items.push(this.buildItem());
  }

  removeItem(index: number): void {
    this.items.removeAt(index);
  }

  create() {
    const po = this.purchaseOrderForm.value;
    this.purchaseOrderService.create(po).subscribe(data => {
      console.log(data);
    });
  }

  private buildForm() {
    this.purchaseOrderForm = this.fb.group({
      poNumber: ['', [Validators.required]],
      currency: ['', [Validators.required]],
      contact: this.fb.group({
        contactName: ['', [Validators.required]],
        companyName: ['', [Validators.required]],
        address: [],
        email: [],
        telephoneNo: [],
        faxNo: [],
        mobileNo: [],
        website: []
      }),
      payment: this.fb.group({
        method: [],
        creditCardName: []
      }),
      items: this.fb.array([this.buildItem()]),
      unitDetail: this.fb.group({
        unitName: [],
        sdl: []
      })
      // approval: this.fb.group({
      //   requistionedBy: [],
      //   requistionedDate: [],
      //   authorisedBy: [],
      //   authorisedDate: [],
      //   countersignedBy: [],
      //   countersignedDate: []
      // })
    });
  }

  private buildItem(): FormGroup {
    return this.fb.group({
      quantity: ['', [Validators.required, Validators.min(1)]],
      description: ['', [Validators.required]],
      unitCost: ['', [Validators.required]]
    });
  }

  calculateItemTotal(item: FormGroup): number {
    const itemValue = item.value;
    return itemValue.quantity * itemValue.unitCost;
  }
}
