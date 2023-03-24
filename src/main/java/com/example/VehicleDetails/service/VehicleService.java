package com.example.VehicleDetails.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.VehicleDetails.Repo.VehicleRepository;
import com.example.VehicleDetails.entity.Vehicle;

@Service
public class VehicleService {
	 @Autowired
	    private VehicleRepository vehicleRepository;

	   public List<Vehicle> getAllVehicles() {
	        return vehicleRepository.findAll();
	    }

	    public Optional<Vehicle> getVehicleById(String id) {
	        return vehicleRepository.findById(id);
	    }

	    public Vehicle saveVehicle(Vehicle vehicle) {
	        return vehicleRepository.save(vehicle);
	    }

	    public void deleteVehicle(String id) {
	        vehicleRepository.deleteById(id);
	    }

}
