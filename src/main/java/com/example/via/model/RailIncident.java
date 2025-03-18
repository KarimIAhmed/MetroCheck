package com.example.via.model;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;


public class RailIncident extends BaseIncident{

    @JsonProperty("LinesAffected")
    private String linesAffected;

    public RailIncident(LocalDateTime dateUpdated, String description, String incidentID, String incidentType,String linesAffected){
        super(dateUpdated,description,incidentID,incidentType);
        this.linesAffected=linesAffected;
    }
}
