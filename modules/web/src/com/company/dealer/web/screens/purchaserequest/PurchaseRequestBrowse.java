package com.company.dealer.web.screens.purchaserequest;

import com.haulmont.cuba.gui.screen.*;
import com.company.dealer.entity.PurchaseRequest;

@UiController("dealer_PurchaseRequest.browse")
@UiDescriptor("purchase-request-browse.xml")
@LookupComponent("purchaseRequestsTable")
@LoadDataBeforeShow
public class PurchaseRequestBrowse extends StandardLookup<PurchaseRequest> {
}