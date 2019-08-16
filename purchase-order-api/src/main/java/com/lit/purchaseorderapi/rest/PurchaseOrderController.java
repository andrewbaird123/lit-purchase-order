package com.lit.purchaseorderapi.rest;

import com.lit.purchaseorderapi.model.PurchaseOrder.Standard.StandardPurchaseOrder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/purchase-orders")
@RestController
public class PurchaseOrderController {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(PurchaseOrderController.class);

    @PostMapping("/standard")
    public ResponseEntity<StandardPurchaseOrder> createStandardPurchaseOrder(@RequestBody final StandardPurchaseOrder purchaseOrder) {
        log.info("Standard Purchase Order: {}", purchaseOrder);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
