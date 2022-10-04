package ru.kovshov.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kovshov.shop.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
