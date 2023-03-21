package com.example.tp1;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;

@RestController
public class CarRentalService {
    private ArrayList<Car> cars = new ArrayList<Car>();

    public CarRentalService() {
        cars.add(new Car("11AA22", "Ferrari", 1000));
        cars.add(new Car("33BB44", "Porsche", 2000));
    }

    @GetMapping("/cars")
    public ArrayList<Car> getCars() {
        return cars;
    }

    @GetMapping("/cars/{plateNumber}")
    public Car getCar(@PathVariable(value = "plateNumber") String plateNumber) {
        for (Car car : cars) {
            if (car.getPlateNumber().equals(plateNumber)) {
                return car;
            }
        }
        return null;
    }

    @PutMapping("/cars")
    public void rent(@RequestBody Car car) {
        System.out.println(car);
        for (Car c : cars) {
            if (c.getPlateNumber().equals(car.getPlateNumber())) {
                c.setRent(!c.isRent());
                return;
            }
        }
        throw new ResponseStatusException(org.springframework.http.HttpStatus.NOT_FOUND, "Car not found");
    }
    @PostMapping("/cars")
    public ArrayList<Car> addCar(@RequestBody Car car) throws Exception {
        cars.add(car);
        return cars;
    }
}