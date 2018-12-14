package com.jsoja.snakecharmer.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name ="MEALS")
public class MealDO {

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "MEAL_ID", unique = true)
    private long mealId;

    @Column(name = "MEAL_SPIECIES")
    private String mealSpiecies;

    @Column(name = "WEIGHTS")
    private int weights;

    @Column(name = "FEEDING_DATES")
    private LocalDate feedingDate;

    @Column(name = "IS_EATEN")
    private boolean isEaten;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn (name = "MEALS_SNAKE")
    private SnakeDO snakeDO;

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

    public boolean isEaten() {
        return isEaten;
    }

    public void setEaten(boolean eaten) {
        isEaten = eaten;
    }

    public LocalDate getFeedingDate() {
        return feedingDate;
    }

    public void setFeedingDate(LocalDate feedingDate) {
        this.feedingDate = feedingDate;
    }

    public SnakeDO getSnakeDO() {
        return snakeDO;
    }

    public void setSnakeDO(SnakeDO snakeDO) {
        this.snakeDO = snakeDO;
    }
}
