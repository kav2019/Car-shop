package ru.kovshov.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kovshov.shop.service.CarService;

@Controller
@RequestMapping("/shop")
public class Controllers {
    private final CarService carService;

    @Autowired
    public Controllers(CarService carService) {
        this.carService = carService;
    }


    @GetMapping("")
    public String board(Model model){ //Страница сиска всех машин
        model.addAttribute("cars", carService.findAll());
        return "board/board";
    }


    @GetMapping("/auth") //Страница аворизции
    public String authorization(){
        return "authorization/auth";
    }

    @GetMapping("/registration")
    public String registration(){ //Страница регистрации
        return "registration/registration";
    }
}
