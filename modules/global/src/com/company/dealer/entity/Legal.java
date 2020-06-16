package com.company.dealer.entity;

import com.haulmont.chile.core.annotations.NamePattern;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|clientId")
@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "ID")
@Table(name = "DEALER_LEGAL")
@Entity(name = "dealer_Legal")
public class Legal extends Client {
    private static final long serialVersionUID = 3356011252170223209L;

    @NotNull
    @Column(name = "INN", nullable = false)
    protected String inn;

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }
}