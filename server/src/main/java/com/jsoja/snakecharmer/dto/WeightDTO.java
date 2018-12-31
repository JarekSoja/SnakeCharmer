package com.jsoja.snakecharmer.dto;

import java.time.LocalDate;

public class WeightDTO {


    private long weightId;
    private LocalDate date;
    private int grams;
    private SnakeDTO snakeDTO;

    public WeightDTO(long weightId, LocalDate date, int grams, SnakeDTO snakeDTO) {
        this.weightId = weightId;
        this.date = date;
        this.grams = grams;
        this.snakeDTO = snakeDTO;
    }

    public WeightDTO() {
    }

    public long getWeightId() {
        return weightId;
    }

    public void setWeightId(long weightId) {
        this.weightId = weightId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getGrams() {
        return grams;
    }

    public void setGrams(int grams) {
        this.grams = grams;
    }

    public SnakeDTO getSnakeDTO() {
        return snakeDTO;
    }

    public void setSnakeDTO(SnakeDTO snakeDTO) {
        this.snakeDTO = snakeDTO;
    }
}
