package com.jsoja.snakecharmer.service;

import com.jsoja.snakecharmer.repository.ShedRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class ShedService {

    private final ShedRepository shedRepository;

    @Autowired
    public ShedService(ShedRepository shedRepository) {
        this.shedRepository = shedRepository;
    }
}
