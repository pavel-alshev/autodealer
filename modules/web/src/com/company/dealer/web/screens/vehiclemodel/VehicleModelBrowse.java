package com.company.dealer.web.screens.vehiclemodel;

import com.haulmont.cuba.gui.screen.*;
import com.company.dealer.entity.VehicleModel;

@UiController("dealer_VehicleModel.browse")
@UiDescriptor("vehicle-model-browse.xml")
@LookupComponent("vehicleModelsTable")
@LoadDataBeforeShow
public class VehicleModelBrowse extends StandardLookup<VehicleModel> {
}