package com.jsoja.snakecharmer.controller;

import com.jsoja.snakecharmer.domain.SnakeDO;
import com.jsoja.snakecharmer.domain.WeightDO;
import com.jsoja.snakecharmer.dto.WeightDTO;
import com.jsoja.snakecharmer.mapper.WeightMapper;
import com.jsoja.snakecharmer.service.SnakeService;
import com.jsoja.snakecharmer.service.WeightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RequestMapping("/weight")
@RestController
public class WeightController {

    private final WeightMapper weightMapper;
    private final WeightService weightService;
    private final SnakeService snakeService;

    @Autowired
    public WeightController(WeightMapper weightMapper, WeightService weightService, SnakeService snakeService) {
        this.weightMapper = weightMapper;
        this.weightService = weightService;
        this.snakeService = snakeService;
    }

    @PostMapping
    public WeightDO createWeight(@RequestBody WeightDTO weightDTO, @RequestParam("id") Integer snakeID) {
        WeightDO weight = weightMapper.mapToWeightDO(weightDTO);
        WeightDO weightSaved = weightService.saveWeightDO(weight);
        return weightSaved;
    }

    @GetMapping(value ="/{id}")
    public WeightDTO getCurrentWeight(@RequestParam("id") Integer snakeID) {
        SnakeDO snake = snakeService.getSnake(snakeID);
        List<WeightDO> weights = snake.getWeights();
        return weightMapper.mapToWeightDTO(weights.get(weights.size()-1));
    }

}
