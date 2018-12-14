package com.jsoja.snakecharmer.controller;

import com.jsoja.snakecharmer.service.ShedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RequestMapping("/preys")
@RestController
public class ShedController {

    private final ShedService shedService;

    @Autowired
    public ShedController(ShedService shedService) {
        this.shedService = shedService;
    }
}
