package com.example.VehicleDetails.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.VehicleDetails.entity.Vehicle;

public interface VehicleRepository extends MongoRepository<Vehicle, String> {

}
