package com.jsoja.snakecharmer.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PreyDTO {

    //DTOs might be useful in the future, currently they are redundant

    SnakeDTO snake;
    private String preySpieces;
    private int weight;

}
