package com.example.via.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class RailIncidentsResponse {

    @JsonProperty("Incidents")
    private List<RailIncident> railIncidents;
}
