package com.example.via.service;

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

    public Mono<String> getSchedule(){
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/Bus.svc/json/jRoutes")
                        .queryParam("api_key", apiKey)
                        .build())
                .retrieve()
                .bodyToMono(String.class);
    }

}
