package com.example.rental.controller;


import com.example.rental.models.Bus;
import com.example.rental.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
public class BusController {


    private final BusService busService;

    @Autowired
    public BusController(BusService busService){
        this.busService=busService;
    }

    @GetMapping
    public Iterable<Bus> getBus(){
        return busService.getBuses();
    }

    @GetMapping("{busId}")
    public Optional<Bus> getABus(@PathVariable Long busId){
        return busService.getBusById(busId);
    }

    @PostMapping
    public void addBus(@RequestBody Bus bus){
        busService.addNewBus(bus);
    }

    @DeleteMapping
    public void deleteBus(@RequestParam Long id){
        busService.deleteBus(id);
    }
}
