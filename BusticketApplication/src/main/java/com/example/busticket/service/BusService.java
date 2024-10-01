package com.example.busticket.service;

import com.example.busticket.model.Bus;
import com.example.busticket.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusService {
    @Autowired
    private BusRepository busRepository;

    public Bus addBus(Bus bus) {
        return busRepository.save(bus);
    }

    public List<Bus> getAllBuses() {
        return busRepository.findAll();
    }

    public void deleteBus(Long busId) {
        busRepository.deleteById(busId);
    }
}

