package com.example.via.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
public abstract class BaseIncident {
    @JsonProperty("DateUpdated")
    private LocalDateTime dateUpdated;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("IncidentID")
    private String incidentID;

    @JsonProperty("IncidentType")
    private String incidentType;

    public BaseIncident(LocalDateTime dateUpdated, String description, String incidentID, String incidentType){
        this.dateUpdated=dateUpdated;
        this.description=description;
        this.incidentID=incidentID;
        this.incidentType=incidentType;
    }
}
