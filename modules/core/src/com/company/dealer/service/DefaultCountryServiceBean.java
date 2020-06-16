package com.company.dealer.service;

import com.company.dealer.config.CountryConfig;
import com.company.dealer.entity.Country;
import com.company.dealer.entity.ExtUser;
import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.UserSessionSource;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service(DefaultCountryService.NAME)
public class DefaultCountryServiceBean implements DefaultCountryService {


    @Inject
    private DataManager dataManager;
    @Inject
    private CountryConfig countryConfig;

    @Override
    public Country putDefaultCountry() {
        Country country = getExtUser().getCountry();
        if (country == null) {
            country = getCountryByName(countryConfig.getCountry());
        }
        return country;
    }

    // returns current User
    private ExtUser getExtUser() {
        return  (ExtUser) AppBeans.get(UserSessionSource.class).getUserSession().getUser();
    }

    // returns country by app.properties property
    private Country getCountryByName(String name) {
        return dataManager.load(Country.class)
                .query("select c from dealer_Country c where c.name = :name")
                .parameter("name", name)
                .one();
    }

}