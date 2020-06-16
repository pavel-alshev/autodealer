package com.company.dealer.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum VehicleType implements EnumClass<Integer> {

    CROSSOVER(10),
    SEDAN(20),
    UNIVERSAL(30);

    private Integer id;

    VehicleType(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static VehicleType fromId(Integer id) {
        for (VehicleType at : VehicleType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}