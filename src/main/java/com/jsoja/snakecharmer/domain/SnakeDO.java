package com.jsoja.snakecharmer.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "SNAKES")
@Getter
@Setter
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

    @OneToMany(
            targetEntity = PreyDO.class,
            mappedBy = "snake",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private List<PreyDO> listOfPreys;

    @Column(name = "SHEDS")
    private List<LocalDate> sheds;
}
