package com.jsoja.snakecharmer.service;

import com.jsoja.snakecharmer.domain.WeightDO;
import com.jsoja.snakecharmer.repository.WeightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeightService {

    private final WeightRepository weightRepository;

    @Autowired
    public WeightService(WeightRepository weightRepository) {
        this.weightRepository = weightRepository;
    }

    public WeightDO saveWeightDO(WeightDO weightDO) {
        return weightRepository.save(weightDO);
    }
}
