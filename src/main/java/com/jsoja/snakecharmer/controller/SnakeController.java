package com.jsoja.snakecharmer.controller;

import com.jsoja.snakecharmer.service.PreyService;
import com.jsoja.snakecharmer.service.SnakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RequestMapping("/preys")
@RestController
public class SnakeController {

    private final PreyService preyService;
    private final SnakeService snakeService;

    @Autowired
    public SnakeController(PreyService preyService, SnakeService snakeService) {
        this.preyService = preyService;
        this.snakeService = snakeService;
    }
}
