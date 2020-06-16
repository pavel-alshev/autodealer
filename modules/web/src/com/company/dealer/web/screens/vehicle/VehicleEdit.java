package com.company.dealer.web.screens.vehicle;

import com.company.dealer.entity.Manufacturer;
import com.company.dealer.entity.VehicleEquipment;
import com.haulmont.cuba.gui.components.LookupPickerField;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.components.ValidationException;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.company.dealer.entity.Vehicle;

import javax.inject.Inject;
import java.math.BigDecimal;

@UiController("dealer_Vehicle.edit")
@UiDescriptor("vehicle-edit.xml")
@EditedEntityContainer("vehicleDc")
@LoadDataBeforeShow
public class VehicleEdit extends StandardEditor<Vehicle> {

    @Inject
    private TextField<BigDecimal> priceField;
    @Inject
    private CollectionLoader<Manufacturer> manufacturersLc;
    @Inject
    private LookupPickerField<VehicleEquipment> equipmentField;


    @Subscribe
    protected void onInit(InitEvent event) {
        manufacturersLc.load();
        priceField.addValidator(v -> {
            VehicleEquipment vehicleEquipment = equipmentField.getValue();
            if (vehicleEquipment != null && vehicleEquipment.getPrice().compareTo(v) > 0) {
                throw new ValidationException("must be greater than " + vehicleEquipment.getPrice());
            }
        });
    }

}