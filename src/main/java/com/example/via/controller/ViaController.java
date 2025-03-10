package com.example.via.controller;

import com.example.via.service.ViaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class ViaController {

    private final ViaService viaService;

    public ViaController(ViaService viaService){
        this.viaService=viaService;
    }

    @GetMapping("/schedule")
    public Mono<String> schedule(){
        return viaService.getSchedule();
    }
}
