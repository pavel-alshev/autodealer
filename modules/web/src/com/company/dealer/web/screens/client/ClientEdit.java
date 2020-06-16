package com.company.dealer.web.screens.client;

import com.haulmont.cuba.gui.screen.*;
import com.company.dealer.entity.Client;

@UiController("dealer_Client.edit")
@UiDescriptor("client-edit.xml")
@EditedEntityContainer("clientDc")
@LoadDataBeforeShow
public class ClientEdit extends StandardEditor<Client> {
}