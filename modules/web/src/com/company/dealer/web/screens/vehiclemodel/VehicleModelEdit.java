package com.company.dealer.web.screens.vehiclemodel;

import com.haulmont.cuba.gui.screen.*;
import com.company.dealer.entity.VehicleModel;

@UiController("dealer_VehicleModel.edit")
@UiDescriptor("vehicle-model-edit.xml")
@EditedEntityContainer("vehicleModelDc")
@LoadDataBeforeShow
public class VehicleModelEdit extends StandardEditor<VehicleModel> {
}