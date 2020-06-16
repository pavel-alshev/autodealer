package com.company.dealer.service;

import com.company.dealer.entity.VehicleModel;

import java.util.List;

public interface CountUnpaidVehiclesService {
    String NAME = "dealer_CountUnpaidVehiclesService";

    List<VehicleModel> countUnpaidVehicleModels();
}