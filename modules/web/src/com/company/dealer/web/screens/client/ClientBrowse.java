package com.company.dealer.web.screens.client;

import com.company.dealer.entity.Legal;
import com.company.dealer.entity.Person;
import com.company.dealer.service.CountRequestsService;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.ScreenBuilders;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.company.dealer.entity.Client;

import javax.inject.Inject;

@UiController("dealer_Client.browse")
@UiDescriptor("client-browse.xml")
@LookupComponent("clientsTable")
@LoadDataBeforeShow
public class ClientBrowse extends StandardLookup<Client> {

    @Inject
    protected ScreenBuilders screenBuilders;

    @Inject
    private GroupTable<Client> clientsTable;

    @Inject
    protected Metadata metadata;

    @Subscribe("createBtn.createLegal")
    public void onCreateBtnCreateLegal(Action.ActionPerformedEvent event) {
        Legal legal = metadata.create(Legal.class);
        showCreateEditorForClient(legal);
    }

    @Subscribe("createBtn.createPerson")
    public void onCreateBtnCreatePerson(Action.ActionPerformedEvent event) {
        Person person = metadata.create(Person.class);
        showCreateEditorForClient(person);
    }

    @Inject
    private CountRequestsService countRequestsService;

    @Subscribe(id = "clientsDl", target = Target.DATA_LOADER)
    public void onClientsDlPostLoad(CollectionLoader.PostLoadEvent<Client> event) {

        for (Client client : event.getLoadedEntities()) {
            client.setRequestsNum(countRequestsService.countRequests(client));
        }
    }

    private void showCreateEditorForClient(Client client) {
        screenBuilders.editor(clientsTable)
                .editEntity(client)
                .build()
                .show();
    }
}