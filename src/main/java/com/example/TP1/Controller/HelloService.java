package com.example.TP1.Controller;

import com.example.TP1.caracteristics.Cars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class HelloService {

    private final CarRentalWebService carRentalService;

    HelloService myService;
    Logger logger = LoggerFactory.getLogger(HelloService.class);


    @Autowired
    public HelloService(CarRentalWebService carRentalService) {
        this.carRentalService = carRentalService;
    }

    @GetMapping("/")
    public String hello() {
        return "hello";
    }

    @GetMapping("/error")
    @ResponseStatus(HttpStatus.EXPECTATION_FAILED)
    @ResponseBody
    public DataException errorMessage() { return new DataException("An error has occured."); }

    @GetMapping("/cars")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Iterable<Cars> listOfCars() {
        return carRentalService.getAllCars();
    }

    @GetMapping("/cars/{plateNumber}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Cars aCar(@PathVariable("plateNumber") String plateNumber) throws Exception {
        return carRentalService.getCarByPlateNumber(plateNumber);
    }

}

