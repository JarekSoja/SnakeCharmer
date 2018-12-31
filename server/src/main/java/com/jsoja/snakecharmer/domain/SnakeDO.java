package com.jsoja.snakecharmer.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

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

    @OneToMany(
            targetEntity = WeightDO.class,
            mappedBy = "snakeDO",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @Column (name = "WEIGHTS_SNAKE")
    private List<WeightDO> weights;

    public SnakeDO(LocalDate birthDate, String spieces, boolean sex, String morphs, List<MealDO> meals, List<ShedDO> sheds, List<WeightDO> weights) {
        this.birthDate = birthDate;
        this.spieces = spieces;
        this.sex = sex;
        this.morphs = morphs;
        this.meals = meals;
        this.sheds = sheds;
        this.weights = weights;
    }

    public SnakeDO(LocalDate birthDate, String spieces, boolean sex, String morphs) {
        this.birthDate = birthDate;
        this.spieces = spieces;
        this.sex = sex;
        this.morphs = morphs;
    }

    public SnakeDO() {
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

    public List<MealDO> getMeals() {
        return meals;
    }

    public void setMeals(List<MealDO> meals) {
        this.meals = meals;
    }

    public List<ShedDO> getSheds() {
        return sheds;
    }

    public void setSheds(List<ShedDO> sheds) {
        this.sheds = sheds;
    }

    public List<WeightDO> getWeights() {
        return weights;
    }

    public void setWeights(List<WeightDO> weights) {
        this.weights = weights;
    }
}
