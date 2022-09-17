package com.example.rental.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Customer")
@Table
public class Customer {
    @Id
    private Long customerId;

    private String customerName;
    private Long customerWalletMoney;

    public Customer(){

    }

    public Customer(Long customerId, String customerName, Long customerWalletMoney) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerWalletMoney = customerWalletMoney;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Long getCustomerWalletMoney() {
        return customerWalletMoney;
    }

    public void setCustomerWalletMoney(Long customerWalletMoney) {
        this.customerWalletMoney = customerWalletMoney;
    }
}
