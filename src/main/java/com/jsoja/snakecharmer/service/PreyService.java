package com.jsoja.snakecharmer.service;

import com.jsoja.snakecharmer.repository.PreyRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class PreyService {

    private final PreyRepository preyRepository;

    @Autowired
    public PreyService(PreyRepository preyRepository) {
        this.preyRepository = preyRepository;
    }
}
