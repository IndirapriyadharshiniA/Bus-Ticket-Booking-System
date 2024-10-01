package com.example.busticket.controller;

import com.example.busticket.model.Bus;
import com.example.busticket.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")  // Adjust the origin as necessary
public class BusController {
    @Autowired
    private BusService busService;

    @PostMapping("/buses")
    public Bus addBus(@RequestBody Bus bus) {
        return busService.addBus(bus);
    }

    @GetMapping("/buses")
    public List<Bus> getAllBuses() {
        return busService.getAllBuses();
    }

    @DeleteMapping("/buses/{busId}")
    public void deleteBus(@PathVariable Long busId) {
        busService.deleteBus(busId);
    }
}

