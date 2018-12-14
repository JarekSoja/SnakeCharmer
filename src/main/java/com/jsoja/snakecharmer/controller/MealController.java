package com.jsoja.snakecharmer.controller;

import com.jsoja.snakecharmer.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RequestMapping("/preys")
@RestController
public class MealController {

    private final MealService mealService;


    @Autowired
    public MealController(MealService mealService) {
        this.mealService = mealService;
    }
}
