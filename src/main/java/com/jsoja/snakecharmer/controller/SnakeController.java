package com.jsoja.snakecharmer.controller;

import com.jsoja.snakecharmer.domain.SnakeDO;
import com.jsoja.snakecharmer.dto.SnakeDTO;
import com.jsoja.snakecharmer.mapper.SnakeMapper;
import com.jsoja.snakecharmer.service.MealService;
import com.jsoja.snakecharmer.service.SnakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RequestMapping("/preys")
@RestController
public class SnakeController {

    private final SnakeService snakeService;
    private final MealService mealService;
    private final SnakeDTO snakeDTO;
    private final SnakeMapper snakeMapper;

    @Autowired
    public SnakeController(SnakeService snakeService, MealService mealService, SnakeDTO snakeDTO, SnakeMapper snakeMapper) {
        this.snakeService = snakeService;
        this.mealService = mealService;
        this.snakeDTO = snakeDTO;
        this.snakeMapper = snakeMapper;
    }

    @PostMapping
    public SnakeDO createSnake(@RequestBody SnakeDTO snakeDto) {
        SnakeDO snake = snakeMapper.mapToSnakeDO(snakeDTO);
        return snakeService.saveSnake(snake);
    }

}
