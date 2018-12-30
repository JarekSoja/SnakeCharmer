package com.jsoja.snakecharmer.service;

import com.jsoja.snakecharmer.domain.MealDO;
import com.jsoja.snakecharmer.repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MealService {

    private final MealRepository mealRepository;

    @Autowired
    public MealService(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }

    public MealDO saveMeal (MealDO meal) {
        return mealRepository.save(meal);
    }

    public void deleteMeal(long id) {
        mealRepository.deleteById(id);
    }

    public MealDO getMeal(long id) {
        return mealRepository.getByMealId(id);
    }
}
