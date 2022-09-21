package ru.kovshov.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kovshov.shop.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
}
