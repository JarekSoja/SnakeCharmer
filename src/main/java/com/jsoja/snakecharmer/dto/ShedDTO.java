package com.jsoja.snakecharmer.dto;

import java.time.LocalDate;

public class ShedDTO {


    private long shedId;
    private LocalDate date;
    private boolean wereTroubles;
    private SnakeDTO snakeDTO;

    public ShedDTO(long shedId, LocalDate date, boolean wereTroubles, SnakeDTO snakeDTO) {
        this.shedId = shedId;
        this.date = date;
        this.wereTroubles = wereTroubles;
        this.snakeDTO = snakeDTO;
    }

    public ShedDTO() {
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

    public SnakeDTO getsnakeDTO() {
        return snakeDTO;
    }

    public void setsnakeDTO(SnakeDTO snakeDTO) {
        this.snakeDTO = snakeDTO;
    }
}
