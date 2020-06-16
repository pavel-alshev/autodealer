package com.paul.sales.web.screens.customer;

import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.paul.sales.entity.Customer;
import com.paul.sales.entity.Order;

import javax.inject.Inject;

@UiController("sales_Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
public class CustomerEdit extends StandardEditor<Customer> {
    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        ordersDl.setParameter("customer", getEditedEntity());
        getScreenData().loadAll();
    }
    @Inject
    private CollectionLoader<Order> ordersDl;
}