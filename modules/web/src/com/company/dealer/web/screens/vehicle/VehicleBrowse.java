package com.company.dealer.web.screens.vehicle;

import com.haulmont.cuba.gui.screen.*;
import com.company.dealer.entity.Vehicle;

@UiController("dealer_Vehicle.browse")
@UiDescriptor("vehicle-browse.xml")
@LookupComponent("vehiclesTable")
@LoadDataBeforeShow
public class VehicleBrowse extends StandardLookup<Vehicle> {
}