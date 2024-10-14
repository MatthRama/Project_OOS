package com.example.TP1;

import com.example.TP1.caracteristics.Cars;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import static org.mockito.Mockito.*;

@SpringBootTest
class Tp1ApplicationTests {

	@Test
	void contextLoads() throws Exception {
		Cars cars = Mockito.mock(Cars.class);

		when(cars.getPlateNumber()).thenReturn(cars.getPlateNumber());

		doNothing().when(cars).setPlateNumber("1001");

		when(cars.getBrand()).thenReturn(cars.getBrand());

		doNothing().when(cars).setBrand("Ford");

		when(cars.getPrice()).thenReturn(cars.getPrice());

		doNothing().when(cars).setPrice(1000);

		when(cars.isRented()).thenReturn(true);

		doNothing().when(cars).setRented(false);
	}

}
