package com.directi.training.srp.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarRepository
{
    private List<Car> _carsDb = Arrays
        .asList(
            new Car("1", "Golf III", "Volkswagen"), 
            new Car("2", "Multipla", "Fiat"),
            new Car("3", "Megane", "Renault")
            );

    public Car getCarById(final String carId)
    {
        for (Car car : _carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

    // These are additional methods that we implemented and which are out of the scope of the problem 

    // Method to add a new car
    public boolean addCar(Car car) {
        if (getCarById(car.getId()) == null) {
            _carsDb.add(car);
            return true;
        }
        
        return false; // Car with the same ID already exists
    }

    // Method to delete a car by ID
    public boolean deleteCar(String carId) {
        Car car = getCarById(carId ) ;
        if ( car == null ) {
            return false; // Car does not exist
        }
        return _carsDb.remove(car);
    }

    // Method to update car details
    public boolean updateCar(String carId, String newModel, String newBrand) {
        Car car = getCarById(carId);
        if (car != null) {
            _carsDb.remove(car);
            _carsDb.add(new Car(carId, newModel, newBrand));
            return true;
        }
        return false; // Car does not exist
    }
    // Method to return all cars
    public List<Car> getAllCars() {
        return new ArrayList<>(_carsDb);
    }
}