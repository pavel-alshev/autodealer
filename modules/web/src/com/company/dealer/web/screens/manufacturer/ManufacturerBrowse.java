package com.company.dealer.web.screens.manufacturer;

import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.company.dealer.entity.Manufacturer;

import javax.inject.Inject;

@UiController("dealer_Manufacturer.browse")
@UiDescriptor("manufacturer-browse.xml")
@LookupComponent("manufacturersTable")
@LoadDataBeforeShow
public class ManufacturerBrowse extends StandardLookup<Manufacturer> {

    @Inject
    private DataManager dataManager;

    @Subscribe(id = "manufacturersDl", target = Target.DATA_LOADER)
    public void onManufacturersDlPostLoad(CollectionLoader.PostLoadEvent<Manufacturer> event) {
        for (Manufacturer m : event.getLoadedEntities()) {
            m.setModelCount(countModels(m));
        }

    }

    private Long countModels(Manufacturer manufacturer) {
        return dataManager.loadValue("select count(e) from dealer_VehicleModel e " +
                "where e.manufacturer = :manufacturer", Long.class)
                .parameter("manufacturer", manufacturer)
                .one();
    }



}

