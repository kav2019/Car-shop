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

    @Transactional
    public void saveUser(User user){//сохранение юзера
        userRepository.save(user);
    }

    public boolean login(Login login){ //авторизова ли
        return true;
    }

    public User findUser(int id){ //находим пользователя
        return userRepository.findById(id).orElse(null);
    }
}
