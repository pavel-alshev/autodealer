package com.company.dealer.service;

import com.company.dealer.entity.Client;

public interface CountRequestsService {
    String NAME = "dealer_CountRequestsService";

    Long countRequests(Client client);
}