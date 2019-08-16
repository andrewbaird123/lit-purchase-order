import { PurchaseOrder } from './purchase-order';
import { Contact } from './contact';
import { PurchaseOrderItem } from './purchase-order-item';
import { Payment } from './payment';
import { UnitDetail } from './unit-detail';

export class StandardPurchaseOrder implements PurchaseOrder {
    poNumber: string;

    contact: Contact;
    currency: string;
    items: PurchaseOrderItem[];
    payment: Payment;
    unitDetail: UnitDetail;

    public constructor(init?: Partial<StandardPurchaseOrder>) {
        Object.assign(this, init);
    }
}
