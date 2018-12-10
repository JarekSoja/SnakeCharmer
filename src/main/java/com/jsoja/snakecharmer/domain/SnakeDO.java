package com.jsoja.snakecharmer.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.util.Pair;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "SNAKES")
@NoArgsConstructor
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

    @Column (name = "MORPHS")
    private String morphs;

    @Column(name = "WEIGHT")
    private Map<LocalDate, Integer> weights;

    @Column(name = "MEALS")
    private Map<LocalDate, Pair<String, Integer>> listOfMeals;

    @Column(name = "SHEDS")
    private List<LocalDate> sheds;

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

    public List<LocalDate> getSheds() {
        return sheds;
    }

    public void setSheds(List<LocalDate> sheds) {
        this.sheds = sheds;
    }

    public Map<LocalDate, Integer> getWeights() {
        return weights;
    }

    public void setWeights(Map<LocalDate, Integer> weights) {
        this.weights = weights;
    }

    public Map<LocalDate, Pair<String, Integer>> getListOfMeals() {
        return listOfMeals;
    }

    public void setListOfMeals(Map<LocalDate, Pair<String, Integer>> listOfMeals) {
        this.listOfMeals = listOfMeals;
    }
}
