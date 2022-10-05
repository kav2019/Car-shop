package ru.kovshov.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kovshov.shop.model.Car;
import ru.kovshov.shop.model.User;
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

    public List<Car> findAll(){ //вернуть всех
        return carRepository.findAll();
    }



    @Transactional
    public void carSave(Car car){ //сохранить одну
        carRepository.save(car);
    }

    public Car findOne(int id){ // вернуть одну
        Car car = carRepository.findById(id).orElse(null);
//        car.getUser();
        return car;
    }

    public User returnOwner(Car car){// вернуть владельца
        Car carDB = carRepository.findById(car.getId()).orElse(null);
        return carDB.getUser();
    }


}
