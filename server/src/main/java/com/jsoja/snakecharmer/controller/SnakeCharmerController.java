package com.jsoja.snakecharmer.controller;

import com.jsoja.snakecharmer.domain.MealDO;
import com.jsoja.snakecharmer.domain.ShedDO;
import com.jsoja.snakecharmer.domain.SnakeDO;
import com.jsoja.snakecharmer.domain.WeightDO;
import com.jsoja.snakecharmer.dto.MealDTO;
import com.jsoja.snakecharmer.dto.ShedDTO;
import com.jsoja.snakecharmer.dto.SnakeDTO;
import com.jsoja.snakecharmer.dto.WeightDTO;
import com.jsoja.snakecharmer.mapper.MealMapper;
import com.jsoja.snakecharmer.mapper.ShedMapper;
import com.jsoja.snakecharmer.mapper.SnakeMapper;
import com.jsoja.snakecharmer.mapper.WeightMapper;
import com.jsoja.snakecharmer.service.MealService;
import com.jsoja.snakecharmer.service.ShedService;
import com.jsoja.snakecharmer.service.SnakeService;
import com.jsoja.snakecharmer.service.WeightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@CrossOrigin(origins = "*")
@RequestMapping("/")
@RestController
public class SnakeCharmerController {

    private final SnakeService snakeService;
    private final MealService mealService;
    private final ShedService shedService;
    private final WeightService weightService;
    private final SnakeMapper snakeMapper;
    private final MealMapper mealMapper;
    private final ShedMapper shedMapper;
    private final WeightMapper weightMapper;

    @Autowired
    public SnakeCharmerController(SnakeService snakeService, MealService mealService, ShedService shedService,
                                  WeightService weightService, SnakeMapper snakeMapper, MealMapper mealMapper,
                                  ShedMapper shedMapper, WeightMapper weightMapper) {
        this.snakeService = snakeService;
        this.mealService = mealService;
        this.shedService = shedService;
        this.weightService = weightService;
        this.snakeMapper = snakeMapper;
        this.mealMapper = mealMapper;
        this.shedMapper = shedMapper;
        this.weightMapper = weightMapper;
    }

    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public SnakeDO createSnake(@RequestBody SnakeDTO snakeDTO) {
        SnakeDO snake = snakeMapper.mapToSnakeDO(snakeDTO);
        return snakeService.saveSnake(snake);
    }

    @PostMapping(value ="/shed", consumes = APPLICATION_JSON_VALUE)
    public ShedDO createShed(@RequestBody ShedDTO shedDTO) {
        ShedDO shed = shedMapper.mapToShedDO(shedDTO);
        return shedService.saveShed(shed);
    }

    @PostMapping(value ="/meal", consumes = APPLICATION_JSON_VALUE)
    public MealDO createMeal(@RequestBody MealDTO mealDTO) {
        MealDO meal = mealMapper.mapToMealDO(mealDTO);
        return mealService.saveMeal(meal);
    }

    @PostMapping(value = "/weight", consumes = APPLICATION_JSON_VALUE)
    public WeightDO createWeight(@RequestBody WeightDTO weightDTO) {
        WeightDO weight = weightMapper.mapToWeightDO(weightDTO);
        return weightService.saveWeight(weight);
    }

    @DeleteMapping(value = "/{id}")
    public void removeSnake (@PathVariable("id") Long snakeId) {
        snakeService.deleteSnake(snakeId);
    }

    @DeleteMapping(value = "/shed/{id}")
    public void removeShed (@PathVariable("id") Long shedId) {
        shedService.deleteShed(shedId);
    }

    @DeleteMapping(value = "/meal/{id}")
    public void removeMeal (@PathVariable("id") Long mealId) {
        mealService.deleteMeal(mealId);
    }

    @DeleteMapping(value = "/weight/{id}")
    public void removeWeight (@PathVariable("id") Long weightId) {
        weightService.deleteWeight(weightId);
    }

    @GetMapping(value ="/{id}")
    public SnakeDTO getSnake(@RequestParam("id") long snakeId) {
        SnakeDO snakeDO = snakeService.getSnake(snakeId);
        return snakeMapper.mapToSnakeDTO(snakeDO);
    }

    @GetMapping(value ="/shed/{id}")
    public ShedDTO getShed(@RequestParam("id") long shedId) {
        ShedDO shedDO = shedService.getShed(shedId);
        return shedMapper.mapToShedDTO(shedDO);
    }

    @GetMapping(value ="/meal/{id}")
    public MealDTO getMeal(@RequestParam("id") long mealId) {
        MealDO mealDO = mealService.getMeal(mealId);
        return mealMapper.mapToMealDTO(mealDO);
    }

    @GetMapping(value ="/weight/{id}")
    public WeightDTO getWeight(@RequestParam("id") long weightId) {
        WeightDO weightDO = weightService.getWeight(weightId);
        return weightMapper.mapToWeightDTO(weightDO);
    }

    @GetMapping(value ="/weight/{id}")
    public WeightDTO getCurrentWeight(@RequestParam("id") long snakeID) {
        SnakeDO snake = snakeService.getSnake(snakeID);
        List<WeightDO> weights = snake.getWeights();
        return weightMapper.mapToWeightDTO(weights.get(weights.size()-1));
    }

    @GetMapping(value="/shed")
    public List<ShedDTO> getAllSheds(@RequestParam("id") long snakeId) {
        SnakeDO snake = snakeService.getSnake(snakeId);
        List<ShedDO> sheds = snake.getSheds();
        return shedMapper.mapToShedDTOList(sheds);
    }

    @GetMapping(value="/meal")
    public List<MealDTO> getAllMeals(@RequestParam("id") long snakeId) {
        SnakeDO snake = snakeService.getSnake(snakeId);
        List<MealDO> meals = snake.getMeals();
        return mealMapper.mapToMealDTOList(meals);
    }

    @GetMapping(value ="/meal/{id}")
    public MealDTO getLastMeal(@RequestParam("id") long snakeID) {
        SnakeDO snake = snakeService.getSnake(snakeID);
        List<MealDO> meals = snake.getMeals();
        return mealMapper.mapToMealDTO(meals.get(meals.size()-1));
    }

    @PutMapping
    public SnakeDTO updateSnake(@RequestBody SnakeDTO snakeDTO) {
        SnakeDO snakeDO = snakeMapper.mapToSnakeDO(snakeDTO);
        snakeService.saveSnake(snakeDO);
        return snakeMapper.mapToSnakeDTO(snakeDO);
    }

    @PutMapping(value ="/shed/{id}")
    public ShedDTO updateShed(@RequestBody ShedDTO shedDTO) {
        ShedDO shedDO = shedMapper.mapToShedDO(shedDTO);
        shedService.saveShed(shedDO);
        return shedMapper.mapToShedDTO(shedDO);
    }

    @PutMapping(value ="/meal/{id}")
    public MealDTO updateMeal(@RequestBody MealDTO mealDTO) {
        MealDO mealDO = mealMapper.mapToMealDO(mealDTO);
        mealService.saveMeal(mealDO);
        return mealMapper.mapToMealDTO(mealDO);
    }

    @PutMapping(value ="/weight/{id}")
    public WeightDTO updateWeight(@RequestBody WeightDTO weightDTO) {
        WeightDO weightDO = weightMapper.mapToWeightDO(weightDTO);
        weightService.saveWeight(weightDO);
        return weightMapper.mapToWeightDTO(weightDO);
    }

}
