package com.example.via.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

//todo: refactor for reusability with train incidents
@Data
public class BusIncident {

    @JsonProperty("DateUpdated")
    private LocalDateTime dateUpdated;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("IncidentID")
    private String incidentID;

    @JsonProperty("IncidentType")
    private String incidentType;

    @JsonProperty("RoutesAffected")
    private List<String> routesAffected;
}
