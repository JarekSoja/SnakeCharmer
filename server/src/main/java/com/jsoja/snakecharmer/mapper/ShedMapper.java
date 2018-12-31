package com.jsoja.snakecharmer.mapper;

import com.jsoja.snakecharmer.domain.ShedDO;
import com.jsoja.snakecharmer.dto.ShedDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ShedMapper {

    public ShedDO mapToShedDO(ShedDTO shedDTO) {
        ShedDO shedDO = new ShedDO();
        shedDO.setDate(shedDTO.getDate());
        shedDO.setWereTroubles(shedDO.isWereTroubles());
        return shedDO;
    }

    public ShedDTO mapToShedDTO(ShedDO shedDO) {
        ShedDTO shedDTO = new ShedDTO();
        shedDTO.setDate(shedDO.getDate());
        shedDTO.setWereTroubles(shedDO.isWereTroubles());
        return shedDTO;
    }

    public List<ShedDO> mapToShedDOList(List<ShedDTO> sheds) {
        return sheds.stream()
                .map(s -> mapToShedDO(s))
                .collect(Collectors.toList());
    }

    public List<ShedDTO> mapToShedDTOList(List<ShedDO> sheds) {
        return sheds.stream()
                .map(s -> mapToShedDTO(s))
                .collect(Collectors.toList());
    }
}

