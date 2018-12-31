package com.jsoja.snakecharmer.mapper;

import com.jsoja.snakecharmer.domain.SnakeDO;
import com.jsoja.snakecharmer.dto.SnakeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SnakeMapper {

    private final ShedMapper shedMapper;

    private final MealMapper mealMapper;

    private final WeightMapper weightMapper;

    @Autowired
    public SnakeMapper(ShedMapper shedMapper, MealMapper mealMapper, WeightMapper weightMapper) {
        this.shedMapper = shedMapper;
        this.mealMapper = mealMapper;
        this.weightMapper = weightMapper;
    }

    public SnakeDO mapToSnakeDO(SnakeDTO snakeDTO) {
        SnakeDO snake = new SnakeDO();
        snake.setBirthDate(snakeDTO.getBirthDate());
        snake.setSex(snakeDTO.isSex());
        snake.setMorphs(snakeDTO.getMorphs());
        snake.setSpieces(snakeDTO.getSpieces());
        snake.setWeights(weightMapper.mapToWeightDOList(snakeDTO.getWeights()));
        snake.setMeals(mealMapper.mapToMealDOList(snakeDTO.getMeals()));
        snake.setSheds(shedMapper.mapToShedDOList(snakeDTO.getSheds()));

        return snake;
    }

    public SnakeDTO mapToSnakeDTO(SnakeDO snakeDO) {
        SnakeDTO snake = new SnakeDTO();
        snake.setBirthDate(snakeDO.getBirthDate());
        snake.setSex(snakeDO.isSex());
        snake.setMorphs(snakeDO.getMorphs());
        snake.setSpieces(snakeDO.getSpieces());
        snake.setWeights(weightMapper.mapToWeightDTOList(snakeDO.getWeights()));
        snake.setMeals(mealMapper.mapToMealDTOList(snakeDO.getMeals()));
        snake.setSheds(shedMapper.mapToShedDTOList(snakeDO.getSheds()));

        return snake;
    }

    public List<SnakeDO> mapToSnakeDOList(List<SnakeDTO> snakes) {
        return snakes. stream()
                .map(s -> mapToSnakeDO(s))
                .collect(Collectors.toList());
    }

    public List<SnakeDTO> mapToSnakeDTOList(List<SnakeDO> snakes) {
        return snakes. stream()
                .map(s -> mapToSnakeDTO(s))
                .collect(Collectors.toList());
    }



}


