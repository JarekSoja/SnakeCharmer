package com.jsoja.snakecharmer.dto;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class SnakeDTO {

    private long snakeId;
    private LocalDate birthDate;
    private String spieces;
    private boolean sex;
    private String morphs;
    private List<MealDTO> meals;
    private List<ShedDTO> sheds;
    private List<WeightDTO> weights;

    public SnakeDTO(long snakeId, LocalDate birthDate, String spieces, boolean sex, String morphs, List<MealDTO> meals, List<ShedDTO> sheds, List<WeightDTO> weights) {
        this.snakeId = snakeId;
        this.birthDate = birthDate;
        this.spieces = spieces;
        this.sex = sex;
        this.morphs = morphs;
        this.meals = meals;
        this.sheds = sheds;
        this.weights = weights;
    }

    public SnakeDTO(long snakeId, LocalDate birthDate, String spieces, boolean sex, String morphs) {
        this.snakeId = snakeId;
        this.birthDate = birthDate;
        this.spieces = spieces;
        this.sex = sex;
        this.morphs = morphs;
    }

    public SnakeDTO() {
    }

    public long getSnakeId() {
        return snakeId;
    }

    public void setSnakeId(long snakeId) {
        this.snakeId = snakeId;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getSpieces() {
        return spieces;
    }

    public void setSpieces(String spieces) {
        this.spieces = spieces;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getMorphs() {
        return morphs;
    }

    public void setMorphs(String morphs) {
        this.morphs = morphs;
    }

    public List<MealDTO> getMeals() {
        return meals;
    }

    public void setMeals(List<MealDTO> meals) {
        this.meals = meals;
    }

    public List<ShedDTO> getSheds() {
        return sheds;
    }

    public void setSheds(List<ShedDTO> sheds) {
        this.sheds = sheds;
    }

    public List<WeightDTO> getWeights() {
        return weights;
    }

    public void setWeights(List<WeightDTO> weights) {
        this.weights = weights;
    }
}
