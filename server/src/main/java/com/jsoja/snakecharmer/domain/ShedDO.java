package com.jsoja.snakecharmer.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "SHEDS")
public class ShedDO {


    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "SHED_ID", unique = true)
    private long shedId;

    @Column(name = "DATES")
    private LocalDate date;

    @Column(name = "TROUBLES")
    private boolean wereTroubles;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn (name = "SHEDS_SNAKE")
    private SnakeDO snakeDO;

    public ShedDO(LocalDate date, boolean wereTroubles, SnakeDO snakeDO) {
        this.date = date;
        this.wereTroubles = wereTroubles;
        this.snakeDO = snakeDO;
    }

    public ShedDO(LocalDate date, boolean wereTroubles) {
        this.date = date;
        this.wereTroubles = wereTroubles;
    }

    public ShedDO() {
    }

    public long getShedId() {
        return shedId;
    }

    public void setShedId(long shedId) {
        this.shedId = shedId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isWereTroubles() {
        return wereTroubles;
    }

    public void setWereTroubles(boolean wereTroubles) {
        this.wereTroubles = wereTroubles;
    }

    public SnakeDO getSnakeDO() {
        return snakeDO;
    }

    public void setSnakeDO(SnakeDO snakeDO) {
        this.snakeDO = snakeDO;
    }
}
