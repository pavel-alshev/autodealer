package com.company.dealer.web.screens.vehicleequipment;

import com.haulmont.cuba.gui.screen.*;
import com.company.dealer.entity.VehicleEquipment;

@UiController("dealer_VehicleEquipment.edit")
@UiDescriptor("vehicle-equipment-edit.xml")
@EditedEntityContainer("vehicleEquipmentDc")
@LoadDataBeforeShow
public class VehicleEquipmentEdit extends StandardEditor<VehicleEquipment> {
}