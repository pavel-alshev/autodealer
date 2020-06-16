package com.paul.sales.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import com.paul.sales.entity.Customer;

@UiController("sales_Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
@LoadDataBeforeShow
public class CustomerBrowse extends StandardLookup<Customer> {
}