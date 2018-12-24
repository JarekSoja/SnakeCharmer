package com.jsoja.snakecharmer.mapper;

import com.jsoja.snakecharmer.domain.WeightDO;
import com.jsoja.snakecharmer.dto.WeightDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class WeightMapper {

    public WeightDO mapToWeightDO(WeightDTO weightDTO) {
        WeightDO weightDO = new WeightDO();
        weightDO.setDate(weightDTO.getDate());
        weightDO.setGrams(weightDTO.getGrams());
        return weightDO;
    }

    public WeightDTO mapToWeightDTO(WeightDO weightDO) {
        WeightDTO weightDTO = new WeightDTO();
        weightDTO.setDate(weightDO.getDate());
        weightDTO.setGrams(weightDO.getGrams());
        return weightDTO;
    }

    public List<WeightDO> mapToWeightDOList(List<WeightDTO> weights) {
        return weights.stream()
                .map(w -> mapToWeightDO(w))
                .collect(Collectors.toList());
    }

    public List<WeightDTO> mapToWeightDTOList(List<WeightDO> weights) {
        return weights.stream()
                .map(w -> mapToWeightDTO(w))
                .collect(Collectors.toList());
    }
}
