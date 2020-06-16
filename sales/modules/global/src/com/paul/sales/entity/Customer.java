package com.paul.sales.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "SALES_CUSTOMER")
@Entity(name = "sales_Customer")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = -1817622314471817751L;

    @NotNull
    @Column(name = "NAME", nullable = false, length = 100)
    protected String name;

    @Email(message = "Email address is not valid")
    @NotNull
    @Column(name = "EMAIL", nullable = false, length = 100)
    protected String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}