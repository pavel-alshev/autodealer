package com.company.dealer.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@NamePattern("%s|name")
@Table(name = "DEALER_VEHICLE_EQUIPMENT")
@Entity(name = "dealer_VehicleEquipment")
public class VehicleEquipment extends StandardEntity {
    private static final long serialVersionUID = 7752186304263742464L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @NotNull
    @Column(name = "TYPE_", nullable = false)
    protected Integer type;

    @Column(name = "NOTE")
    protected String note;

    @NotNull
    @Column(name = "PRICE", nullable = false)
    protected BigDecimal price;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "VEHICLE_MODEL_ID")
    protected VehicleModel vehicleModel;

    public VehicleModel getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(VehicleModel vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public VehicleType getType() {
        return type == null ? null : VehicleType.fromId(type);
    }

    public void setType(VehicleType type) {
        this.type = type == null ? null : type.getId();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}