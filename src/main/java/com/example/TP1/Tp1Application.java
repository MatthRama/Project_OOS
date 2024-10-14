package com.example.TP1;

import com.example.TP1.caracteristics.Cars;
import com.example.TP1.Controller.CarRentalWebService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Tp1Application {

	public static void main(String[] args) {
		SpringApplication.run(Tp1Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(CarRentalWebService carRentalService) {
		return (args) -> {
			// Add example data to the database
			Cars car1 = new Cars("11AA22", "Ferrari", 1000);
			carRentalService.addCar(car1);

			Cars car2 = new Cars("33BB44", "Porsche", 2000);
			carRentalService.addCar(car2);
		};
	}
}