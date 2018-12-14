package com.jsoja.snakecharmer.service;

import com.jsoja.snakecharmer.domain.MealDO;
import com.jsoja.snakecharmer.domain.ShedDO;
import com.jsoja.snakecharmer.domain.SnakeDO;
import com.jsoja.snakecharmer.repository.MealRepository;
import com.jsoja.snakecharmer.repository.ShedRepository;
import com.jsoja.snakecharmer.repository.SnakeRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class SnakeService {

    private final SnakeRepository snakeRepository;
    private final MealRepository mealRepository;
    private final ShedRepository shedRepository;

    @Autowired
    public SnakeService(SnakeRepository snakeRepository, MealRepository mealRepository, ShedRepository shedRepository) {
        this.snakeRepository = snakeRepository;
        this.mealRepository = mealRepository;
        this.shedRepository = shedRepository;
    }

    public SnakeDO saveSnake (SnakeDO snake) {
        return snakeRepository.save(snake);
    }

    public SnakeDO getSnake(int id) {
        return snakeRepository.getBySnakeId(id);
    }

    public List<ShedDO> getAllShedsOfSnake(int id) {
        SnakeDO snake = snakeRepository.getBySnakeId(id);
        List<ShedDO> sheds = snake.getSheds();
        return sheds;
    }

    public List<MealDO> getAllMealsOfSnake(int id) {
        SnakeDO snake = snakeRepository.getBySnakeId(id);
        List<MealDO> meals = snake.getMeals();
        return meals;
    }



}
