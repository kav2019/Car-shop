package ru.kovshov.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kovshov.shop.model.Car;
import ru.kovshov.shop.model.Login;
import ru.kovshov.shop.model.User;
import ru.kovshov.shop.service.CarService;
import ru.kovshov.shop.service.UserService;

@Controller
@RequestMapping("/shop")
public class Controllers {
    private final CarService carService;
    private final UserService userService;

    @Autowired
    public Controllers(CarService carService, UserService userService) {
        this.carService = carService;
        this.userService = userService;
    }


    @GetMapping("")
    public String board(Model model){ //Страница сиска всех машин
        model.addAttribute("cars", carService.findAll());
        return "board/board";
    }


    @GetMapping("/auth") //Страница аворизции
    public String authorization(@ModelAttribute("loginObj")Login login){
        return "authorization/auth";
    }

    @PatchMapping("/login")
    public String login(@ModelAttribute("loginObj") Login login){
        if(!userService.login(login)){
            return "authorization/auth";
        }
        return "redirect:/shop";
    }

    @GetMapping("/registr") // Страница регистрции
    public String registration(@ModelAttribute("user")User user){ //Страница регистрации
        return "registr/registration";
    }

    @PatchMapping("/new_user") // Создание ного пользователя и добавление в бд
    public String saveUser(@ModelAttribute("user") User user){
        userService.saveUser(user);
        return "redirect:/shop";
    }

    @GetMapping("/add_car")
    public String addCar(@ModelAttribute("car")Car car){ //Страница формы добавления автомобиля
        return "car/add_car";
    }

    @PatchMapping("/add_car") // Создание ного автомобиля и добавление в бд
    public String saveCar(@ModelAttribute("car") Car car){
        carService.carSave(car);
        return "redirect:/shop";
    }



}
