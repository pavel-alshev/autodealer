package com.company.dealer.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;


@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "DTYPE", discriminatorType = DiscriminatorType.STRING)
@Table(name = "DEALER_CLIENT")
@Entity(name = "dealer_Client")
public class Client extends StandardEntity {
    private static final long serialVersionUID = -1375430077757150252L;

    @NotNull
    @Column(name = "CLIENT_ID", nullable = false, unique = true)
    protected String clientId;


    @Column(name = "ADRESS")
    protected String adress;

    @OneToMany(mappedBy = "client")
    protected List<PurchaseRequest> purchaseRequest;

    @Column(name = "REQUESTS_NUM")
    protected Long requestsNum;

    @Column(name = "PHONE", length = 7)
    @Pattern(message = "field must contain 7 digits", regexp = "^[0-9]{7}$")
    protected String phone;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setRequestsNum(Long requestsNum) {
        this.requestsNum = requestsNum;
    }

    public Long getRequestsNum() {
        return requestsNum;
    }

    public List<PurchaseRequest> getPurchaseRequest() {
        return purchaseRequest;
    }

    public void setPurchaseRequest(List<PurchaseRequest> purchaseRequest) {
        this.purchaseRequest = purchaseRequest;
    }

    public String getPhoneNum() {
        return phone;
    }

    public void setPhoneNum(String phone) {
        this.phone = phone;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
}