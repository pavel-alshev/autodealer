package com.paul.sales.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import com.paul.sales.entity.Order;

@UiController("sales_Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
@LoadDataBeforeShow
public class OrderEdit extends StandardEditor<Order> {
}