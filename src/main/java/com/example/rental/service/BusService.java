package com.example.rental.service;

import com.example.rental.models.Bus;
import com.example.rental.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BusService {

    private final BusRepository busRepository;

    @Autowired
    public BusService(BusRepository busRepository){
        this.busRepository=busRepository;
    }

    public Iterable<Bus> getBuses() {
        return busRepository.findAll();
    }

    public void addNewBus(Bus bus) {
        busRepository.save(bus);

    }

    public void deleteBus(Long id) {
        try{
            if (busRepository.findById(id)!=null);
                Bus bus=busRepository.getById(id);
                busRepository.delete(bus);
        }
        catch(Exception e){
            System.out.println("OOPS! ID not present");
        }
    }
}
