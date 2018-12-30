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

    public WeightDO saveWeight(WeightDO weightDO) {
        return weightRepository.save(weightDO);
    }

    public void deleteWeight(long id) {
        weightRepository.deleteById(id);
    }

    public WeightDO getWeight(long id) {
        return weightRepository.getByWeightId(id);
    }
}
