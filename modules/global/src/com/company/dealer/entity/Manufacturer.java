package com.company.dealer.entity;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@NamePattern("%s|name")
@Table(name = "DEALER_MANUFACTURER")
@Entity(name = "dealer_Manufacturer")
public class Manufacturer extends StandardEntity {
    private static final long serialVersionUID = 5030418561032913260L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true)
    protected String name;

    @Transient
    @MetaProperty(mandatory = true)
    @NotNull
    protected Long modelCount;

    @OneToMany(mappedBy = "manufacturer")
    protected List<VehicleModel> model;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "COUNTRY_ID")
    protected Country country;

    @NotNull
    @Column(name = "CODE", nullable = false, unique = true)
    protected String code;

    public Long getModelCount() {
        return modelCount;
    }

    public void setModelCount(Long modelCount) {
        this.modelCount = modelCount;
    }


    public List<VehicleModel> getModel() {
        return model;
    }

    public void setModel(List<VehicleModel> model) {
        this.model = model;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}