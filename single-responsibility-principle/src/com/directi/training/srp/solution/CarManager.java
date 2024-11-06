package com.directi.training.srp.solution;
import java.util.List;

public class CarManager {
    private CarRepository carRepository;
    private CarUtility carUtility;

    public CarManager() {
        this.carRepository = new CarRepository();
        this.carUtility = new CarUtility();
    }

    public Car getFromDb(final String carId) {
        return carRepository.getCarById(carId);
    }

    public String getCarsNames() {
        List<Car> cars = carRepository.getAllCars();
        return carUtility.formatCarNames(cars);
    }

    public Car getBestCar() {
        List<Car> cars = carRepository.getAllCars();
        return carUtility.getBestCar(cars);
    }
}
