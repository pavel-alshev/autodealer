package com.company.dealer.web.screens.vehicleequipment;

import com.haulmont.cuba.gui.screen.*;
import com.company.dealer.entity.VehicleEquipment;

@UiController("dealer_VehicleEquipment.browse")
@UiDescriptor("vehicle-equipment-browse.xml")
@LookupComponent("vehicleEquipmentsTable")
@LoadDataBeforeShow
public class VehicleEquipmentBrowse extends StandardLookup<VehicleEquipment> {
}