package com.example.via.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
import java.util.List;

//todo: refactor for reusability with train incidents
//@Data

public class BusIncident extends BaseIncident{

    @JsonProperty("RoutesAffected")
    private List<String> routesAffected;

    public BusIncident(LocalDateTime dateUpdated, String description, String incidentID, String incidentType,List<String> routesAffected){
        super(dateUpdated,description,incidentID,incidentType);
        this.routesAffected=routesAffected;
    }
}
