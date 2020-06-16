package com.company.dealer.service;

import com.company.dealer.entity.Client;
import com.haulmont.cuba.core.global.DataManager;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service(CountRequestsService.NAME)
public class CountRequestsServiceBean implements CountRequestsService {

    @Inject
    private DataManager dataManager;

    @Override
    public Long countRequests(Client client) {
        return dataManager.loadValue("select count(e) from dealer_PurchaseRequest e " +
                "where e.client = :client", Long.class)
                .parameter("client", client)
                .one();
    }
}