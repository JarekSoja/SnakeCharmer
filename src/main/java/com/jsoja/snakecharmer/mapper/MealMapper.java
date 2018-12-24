package com.jsoja.snakecharmer.mapper;

import com.jsoja.snakecharmer.domain.MealDO;
import com.jsoja.snakecharmer.dto.MealDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MealMapper {

   public MealDO mapToMealDO(MealDTO mealDTO) {
       MealDO mealDO = new MealDO();
       mealDO.setMealSpiecies(mealDTO.getMealSpiecies());
       mealDO.setWeights(mealDTO.getWeights());
       mealDO.setFeedingDate(mealDTO.getFeedingDate());
       mealDO.setEaten(mealDTO.isEaten());
       return mealDO;
   }

    public MealDTO mapToMealDTO(MealDO mealDO) {
        MealDTO mealDTO = new MealDTO();
        mealDTO.setMealSpiecies(mealDO.getMealSpiecies());
        mealDTO.setWeights(mealDO.getWeights());
        mealDTO.setFeedingDate(mealDO.getFeedingDate());
        mealDTO.setEaten(mealDO.isEaten());
        return mealDTO;
    }

    public List<MealDO> mapToMealDOList(List<MealDTO> mealsDTO) {
        return mealsDTO.stream()
                .map(m -> mapToMealDO(m))
                .collect(Collectors.toList());
    }

    public List<MealDTO> mapToMealDTOList(List<MealDO> mealsDO) {
       return mealsDO.stream()
               .map(m -> mapToMealDTO(m))
               .collect(Collectors.toList());
    }
}
