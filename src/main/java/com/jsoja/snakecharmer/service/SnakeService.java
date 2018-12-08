package com.jsoja.snakecharmer.service;

import com.jsoja.snakecharmer.repository.SnakeRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class SnakeService {

    private final SnakeRepository snakeRepository;

    @Autowired
    public SnakeService(SnakeRepository snakeRepository) {
        this.snakeRepository = snakeRepository;
    }
}
