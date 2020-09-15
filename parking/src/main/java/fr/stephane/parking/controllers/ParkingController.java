package fr.stephane.parking.controllers;

import fr.stephane.parking.model.Parking;
import fr.stephane.parking.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ParkingController {

    @Autowired
    private ParkingService parkingService;

    @CrossOrigin("http://localhost:4200")
    @GetMapping(path = "/api/parkings")
    public List<Parking> getListeParkings(){
        return parkingService.getListeParking();
    }
}
