package com.company.dealer.service;

import com.company.dealer.entity.Vehicle;
import com.company.dealer.entity.VehicleModel;
import com.haulmont.cuba.core.global.DataManager;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service(CountUnpaidVehiclesService.NAME)
public class CountUnpaidVehiclesServiceBean implements CountUnpaidVehiclesService {

    @Inject
    private DataManager dataManager;

    @Override
    public List<VehicleModel> countUnpaidVehicleModels() {
        return dataManager.load(VehicleModel.class)
                .query("select distinct v.vehicleModel from dealer_Vehicle v " +
                        "LEFT JOIN dealer_PurchaseRequest r ON r.vehicle = v WHERE r is null or r.isPaid=false")
                .list();
    }
}