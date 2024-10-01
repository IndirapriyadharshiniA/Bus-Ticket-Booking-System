package com.example.busticket.controller;

import com.example.busticket.model.Passenger;
import com.example.busticket.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")  // Adjust the origin as necessary
public class PassengerController {
    @Autowired
    private PassengerService passengerService;

    @PostMapping("/passengers")
    public Passenger addPassenger(@RequestBody Passenger passenger) {
        return passengerService.addPassenger(passenger);
    }

    @GetMapping("/passengers")
    public List<Passenger> getAllPassengers() {
        return passengerService.getAllPassengers();
    }

    @DeleteMapping("/passengers/{passengerId}")
    public void deletePassenger(@PathVariable Long passengerId) {
        passengerService.deletePassenger(passengerId);
    }
}

