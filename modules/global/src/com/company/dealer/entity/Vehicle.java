package com.company.dealer.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@NamePattern("%s|name")
@Table(name = "DEALER_VEHICLE")
@Entity(name = "dealer_Vehicle")
public class Vehicle extends StandardEntity {
    private static final long serialVersionUID = -6176762410572436567L;

    @Lookup(type = LookupType.DROPDOWN, actions = {})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MANUFACTURER_ID")
    protected Manufacturer manufacturer;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MODEL_ID")
    protected VehicleModel model;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "EQUIPMENT_ID")
    protected VehicleEquipment equipment;

    @NotNull
    @Column(name = "YEAROFISSUE", nullable = false)
    protected Date yearofissue = new Date();

    @NotNull
    @Column(name = "PRICE", nullable = false)
    protected BigDecimal price;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    public String getName() {
        return name;
    }


    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getYearofissue() {
        return yearofissue;
    }

    public void setYearofissue(Date yearofissue) {
        this.yearofissue = yearofissue;
    }

    public VehicleEquipment getEquipment() {
        return equipment;
    }

    public void setEquipment(VehicleEquipment equipment) {
        this.equipment = equipment;
    }

    public VehicleModel getModel() {
        return model;
    }

    public void setModel(VehicleModel model) {
        this.model = model;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PreUpdate
    @PrePersist
    private void setDaName() {
        this.name = manufacturer.getName()+ " " + model.getName() + " " + equipment.getName();
    }
}