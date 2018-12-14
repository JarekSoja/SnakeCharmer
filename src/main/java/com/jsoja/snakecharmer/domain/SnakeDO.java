package com.jsoja.snakecharmer.domain;

import org.springframework.data.util.Pair;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "SNAKES")
public class SnakeDO {


    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "SNAKE_ID", unique = true)
    private long snakeId;

    @Column(name = "BIRTH_DATE")
    private LocalDate birthDate;

    @Column(name = "SPIECES")
    private String spieces;

    @Column(name = "SEX")
    private boolean sex;

    @Column(name = "MORPHS")
    private String morphs;

    @Column(name = "WEIGHT")
    private int weight;

    @Column(name = "WEIGHT_DATES")
    private LocalDate weightDate;

    @OneToMany(
            targetEntity = MealDO.class,
            mappedBy = "snakeDO",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @Column (name = "MEALS_SNAKE")
    private List<MealDO> meals;


    @OneToMany(
            targetEntity = ShedDO.class,
            mappedBy = "snakeDO",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @Column (name = "SHEDS_SNAKE")
    private List<ShedDO> sheds;

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

    public List<ShedDO> getSheds() {
        return sheds;
    }

    public void setSheds(List<ShedDO> sheds) {
        this.sheds = sheds;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public LocalDate getWeightDate() {
        return weightDate;
    }

    public void setWeightDate(LocalDate weightDate) {
        this.weightDate = weightDate;
    }

    public List<MealDO> getMeals() {
        return meals;
    }

    public void setMeals(List<MealDO> meals) {
        this.meals = meals;
    }
}
