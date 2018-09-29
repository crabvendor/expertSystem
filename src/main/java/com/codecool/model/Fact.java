package com.codecool.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Fact {

    private String id;
    private String description;
    private Map<String, Boolean> idsValues = new HashMap<>();

    public Fact(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setFactValueById(String id, Boolean value) {
        idsValues.put(id, value);
    }

    public Set getIdSet() {
        return idsValues.keySet();
    }

    public Boolean getValueById(String id) {
        return idsValues.get(id);
    }

    public String getId() {
        return this.id;
    }
}
