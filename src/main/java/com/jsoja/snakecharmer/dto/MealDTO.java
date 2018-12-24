package com.jsoja.snakecharmer.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class MealDTO {

    private long mealId;
    private String mealSpiecies;
    private int weights;
    private LocalDate feedingDate;
    private boolean isEaten;
    private SnakeDTO snakeDTO;

    public MealDTO(long mealId, String mealSpiecies, int weights, LocalDate feedingDate, boolean isEaten, SnakeDTO snakeDTO) {
        this.mealId = mealId;
        this.mealSpiecies = mealSpiecies;
        this.weights = weights;
        this.feedingDate = feedingDate;
        this.isEaten = isEaten;
        this.snakeDTO = snakeDTO;
    }

    public MealDTO() {
    }

    public long getMealId() {
        return mealId;
    }

    public void setMealId(long mealId) {
        this.mealId = mealId;
    }

    public String getMealSpiecies() {
        return mealSpiecies;
    }

    public void setMealSpiecies(String mealSpiecies) {
        this.mealSpiecies = mealSpiecies;
    }

    public int getWeights() {
        return weights;
    }

    public void setWeights(int weights) {
        this.weights = weights;
    }

    public LocalDate getFeedingDate() {
        return feedingDate;
    }

    public void setFeedingDate(LocalDate feedingDate) {
        this.feedingDate = feedingDate;
    }

    public boolean isEaten() {
        return isEaten;
    }

    public void setEaten(boolean eaten) {
        isEaten = eaten;
    }

    public SnakeDTO getSnakeDTO() {
        return snakeDTO;
    }

    public void setSnakeDTO(SnakeDTO snakeDTO) {
        this.snakeDTO = snakeDTO;
    }
}
