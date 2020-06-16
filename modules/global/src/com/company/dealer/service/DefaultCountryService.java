package com.company.dealer.service;

import com.company.dealer.entity.Country;
import com.company.dealer.entity.ExtUser;
import com.haulmont.cuba.security.entity.User;

public interface DefaultCountryService {
    String NAME = "dealer_DefaultCountryService";

    Country putDefaultCountry();
}