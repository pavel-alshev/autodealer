package com.company.dealer.web.screens.manufacturer;

import com.company.dealer.service.DefaultCountryService;
import com.haulmont.cuba.core.global.EntityStates;
import com.haulmont.cuba.gui.screen.*;
import com.company.dealer.entity.Manufacturer;
import org.apache.http.util.EntityUtils;

import javax.inject.Inject;

@UiController("dealer_Manufacturer.edit")
@UiDescriptor("manufacturer-edit.xml")
@EditedEntityContainer("manufacturerDc")
@LoadDataBeforeShow
public class ManufacturerEdit extends StandardEditor<Manufacturer> {

    @Inject
    private DefaultCountryService defaultCountryService;

//    @Subscribe
//    public void onBeforeShow(BeforeShowEvent event) {
//        getEditedEntity().setCountry(defaultCountryService.putDefaultCountry(entityUtils.getAuthUser()));
//    }

    @Subscribe
    public void onInitEntity(InitEntityEvent<Manufacturer> event) {

        event.getEntity().setCountry(defaultCountryService.putDefaultCountry());

    }



}