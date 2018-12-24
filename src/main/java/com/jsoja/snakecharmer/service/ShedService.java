package com.jsoja.snakecharmer.service;

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
}
