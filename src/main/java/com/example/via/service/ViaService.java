package com.example.via.service;

import com.example.via.model.BusIncidentsResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ViaService {

    @Value("${api.key}")
    private String apiKey;

    private final WebClient webClient;

    public ViaService(WebClient.Builder webClient){
        this.webClient=webClient.baseUrl("http://api.wmata.com").build();
    }

    public Mono<BusIncidentsResponse> busIncidents(){
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                    .path("/Incidents.svc/json/BusIncidents")
                    .queryParam("api_key", apiKey)
                    .build())
                .retrieve()
                .bodyToMono(BusIncidentsResponse.class);
    }

    public Mono<String> railIncidents(){
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                    .path("/Incidents.svc/json/Incidents")
                    .queryParam("api_key",apiKey)
                    .build())
                .retrieve()
                .bodyToMono(String.class);
    }

}
