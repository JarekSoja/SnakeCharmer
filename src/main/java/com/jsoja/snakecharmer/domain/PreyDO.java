package com.jsoja.snakecharmer.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "PREYS")
@Getter
@Setter
@NoArgsConstructor
public class PreyDO {

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "PREY_ID", unique = true)
    private long preyId;

    @ManyToOne
    @JoinColumn(name = "PREYS")
    private SnakeDO snake;

    @Column(name = "PREY_SPIECES")
    private String preySpieces;

    @Column(name = "WEIGHT")
    private int weight;

}
