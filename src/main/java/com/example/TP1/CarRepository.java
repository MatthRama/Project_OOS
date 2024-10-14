package com.example.TP1;
import com.example.TP1.caracteristics.Cars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;
public interface CarRepository extends CrudRepository<Cars, String> {
    List<Cars> findByPlateNumber(String plateNumber);
}

