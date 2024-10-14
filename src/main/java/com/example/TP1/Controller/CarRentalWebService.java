package com.example.TP1.Controller;
import com.example.TP1.caracteristics.Cars;
import com.example.TP1.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarRentalWebService {

    private final CarRepository carRepository;

    @Autowired
    public CarRentalWebService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public void addCar(Cars car) {
        carRepository.save(car);
    }

    public Iterable<Cars> getAllCars() {
        return carRepository.findAll();
    }

    public Cars getCarByPlateNumber(String plateNumber) throws Exception {
        return carRepository.findByPlateNumber(plateNumber)
                .stream()
                .findFirst()
                .orElseThrow(() -> new Exception("Car not found"));
    }
}
