package com.primelides.desfribilador.controllers;

import com.primelides.desfribilador.models.Location;
import com.primelides.desfribilador.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private LocationRepository locationRepository;

    @GetMapping
    public ResponseEntity<List<Location>> locationList(){
        List<Location> list =(List<Location>) locationRepository.findAll();
        return ResponseEntity.status(200).body(list);
    }

    @PostMapping
    public ResponseEntity<Location> createLocation(@RequestBody Location location){
        Location newLocation = locationRepository.save(location);
        return ResponseEntity.status(201).body(newLocation);
    }

    @PutMapping
    public ResponseEntity<Location> editLocation(@RequestBody Location location){
        Location newLocation = locationRepository.save(location);
        return ResponseEntity.status(200).body(newLocation);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteLocation(@PathVariable Integer id){
        locationRepository.deleteById(id);
        return ResponseEntity.status(204).build();
    }
}
