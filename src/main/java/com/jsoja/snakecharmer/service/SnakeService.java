package com.jsoja.snakecharmer.service;

import com.jsoja.snakecharmer.domain.SnakeDO;
import com.jsoja.snakecharmer.repository.SnakeRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class SnakeService {

    private final SnakeRepository snakeRepository;

    @Autowired
    public SnakeService(SnakeRepository snakeRepository) {
        this.snakeRepository = snakeRepository;
    }

    public SnakeDO saveSnake (SnakeDO snake) {
        return snakeRepository.save(snake);
    }

    public SnakeDO getSnake(int id) {
        return snakeRepository.getBySnakeId(id);
    }

    public List<LocalDate> getAllShedsOfSnake(int id) {
        SnakeDO snake = snakeRepository.getBySnakeId(id);
        List<LocalDate> sheds = snake.getSheds();
        return sheds;
    }

    public Map<LocalDate, Pair<String, Integer>> getAllMealsOfSnake(int id) {
        SnakeDO snake = snakeRepository.getBySnakeId(id);
        Map<LocalDate, Pair<String, Integer>> meals = snake.getListOfMeals();
        return meals;
    }



}
