package com.jsoja.snakecharmer.service;

import com.jsoja.snakecharmer.domain.ShedDO;
import com.jsoja.snakecharmer.repository.ShedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShedService {

    private final ShedRepository shedRepository;

    @Autowired
    public ShedService(ShedRepository shedRepository) {
        this.shedRepository = shedRepository;
    }

    public ShedDO saveShed (ShedDO shed) {
        return shedRepository.save(shed);
    }

    public void deleteShed(long id) {
        shedRepository.deleteById(id);
    }

    public ShedDO getShed(long id) {
        return shedRepository.getByShedId(id);
    }
}
