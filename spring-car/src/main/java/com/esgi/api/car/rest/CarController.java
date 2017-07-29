package com.esgi.api.car.rest;

import com.esgi.api.car.domain.Car;
import com.esgi.api.car.domain.CarRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarRepository carRepository;

    public CarController(final CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }
}
