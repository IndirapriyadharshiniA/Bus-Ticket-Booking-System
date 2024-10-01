package com.example.busticket.service;

import com.example.busticket.model.Passenger;
import com.example.busticket.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {
    @Autowired
    private PassengerRepository passengerRepository;

    public Passenger addPassenger(Passenger passenger) {
        return passengerRepository.save(passenger);
    }

    public List<Passenger> getAllPassengers() {
        return passengerRepository.findAll();
    }

    public void deletePassenger(Long passengerId) {
        passengerRepository.deleteById(passengerId);
    }
}

