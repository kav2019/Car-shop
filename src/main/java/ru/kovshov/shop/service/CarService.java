package ru.kovshov.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kovshov.shop.model.Car;
import ru.kovshov.shop.repository.CarRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class CarService {
    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> findAll(){
        return carRepository.findAll();
    }

    public void carSave(Car car){
        carRepository.save(car);
    }


}
