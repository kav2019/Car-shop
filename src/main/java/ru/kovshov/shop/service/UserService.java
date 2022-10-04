package ru.kovshov.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kovshov.shop.model.Car;
import ru.kovshov.shop.model.Login;
import ru.kovshov.shop.model.User;
import ru.kovshov.shop.repository.UserRepository;

@Service
@Transactional(readOnly = true)
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(User user){
        userRepository.save(user);
    }

    public boolean login(Login login){
        return true;
    }
}
