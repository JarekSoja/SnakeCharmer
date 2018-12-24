package com.jsoja.snakecharmer.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;


@Entity
@Table(name = "WEIGHT_MEASUERS")
public class WeightDO {


        @Id
        @GeneratedValue
        @NotNull
        @Column(name = "WEIGHT_ID", unique = true)
        private long weightId;

        @Column(name = "DATES")
        private LocalDate date;

        @Column(name ="GRAMS")
        private int grams;

        @ManyToOne(cascade = CascadeType.PERSIST)
        @JoinColumn (name = "WEIGHTS_SNAKE")
        private SnakeDO snakeDO;

    public WeightDO(LocalDate date, int grams, SnakeDO snakeDO) {
        this.date = date;
        this.grams = grams;
        this.snakeDO = snakeDO;
    }

    public WeightDO(LocalDate date, int grams) {
        this.date = date;
        this.grams = grams;
    }

    public WeightDO() {
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

    public SnakeDO getSnakeDO() {
        return snakeDO;
    }

    public void setSnakeDO(SnakeDO snakeDO) {
        this.snakeDO = snakeDO;
    }
}
