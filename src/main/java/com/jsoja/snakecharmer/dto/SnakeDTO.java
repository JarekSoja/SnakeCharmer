package com.jsoja.snakecharmer.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class SnakeDTO {

    //DTOs might be useful in the future, currently they are redundant

    private long snakeId;
    private String spieces;
    private boolean sex;
    private String morphs;
    private List<PreyDTO> listOfPreys;
    private List<LocalDate> sheds;
}
