package com.company.dealer.web.screens.purchaserequest;

import com.haulmont.cuba.gui.screen.*;
import com.company.dealer.entity.PurchaseRequest;

@UiController("dealer_PurchaseRequest.edit")
@UiDescriptor("purchase-request-edit.xml")
@EditedEntityContainer("purchaseRequestDc")
@LoadDataBeforeShow
public class PurchaseRequestEdit extends StandardEditor<PurchaseRequest> {
}