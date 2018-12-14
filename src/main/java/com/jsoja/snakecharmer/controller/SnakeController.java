package com.jsoja.snakecharmer.controller;

import com.jsoja.snakecharmer.service.MealService;
import com.jsoja.snakecharmer.service.SnakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RequestMapping("/preys")
@RestController
public class SnakeController {

    private final SnakeService snakeService;
    private final MealService mealService;

    @Autowired
    public SnakeController(SnakeService snakeService, MealService mealService) {
        this.snakeService = snakeService;
        this.mealService = mealService;
    }


}
