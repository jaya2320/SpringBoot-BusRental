package com.example.rental.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity(name="Bus")
@Table
public class Bus {
    @Id
    private long busId;

    private String busName;
    private String busPrice;
    private String source;
    private String destination;


    public Bus(Integer busId, String busName, String busPrice, String source, String destination) {
        this.busId = busId;
        this.busName = busName;
        this.busPrice = busPrice;
        this.source = source;
        this.destination = destination;

    }

    public Bus() {
    }

    public Long getBusId() {
        return busId;
    }

    public void setBusId(Integer busId) {
        this.busId = busId;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public String getBusPrice() {
        return busPrice;
    }

    public void setBusPrice(String busPrice) {
        this.busPrice = busPrice;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }


}
