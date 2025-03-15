package com.example.via.controller;

import com.example.via.model.BusIncidentsResponse;
import com.example.via.model.RailIncidentsResponse;
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

    @GetMapping("/busincidents")
    public Mono<BusIncidentsResponse> getBusIncidents(){
        return viaService.busIncidents();
    }

    @GetMapping("/railincidents")
    public Mono<RailIncidentsResponse> getRailIncidents(){
        return viaService.railIncidents();
    }

}
