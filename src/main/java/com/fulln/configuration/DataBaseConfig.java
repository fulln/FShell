package com.fulln.configuration;

import java.util.ArrayList;
import java.util.List;

public class DataBaseConfig {

    private List<String> name = new ArrayList<>(List.of("local"));


    public String currentName() {
        return name.get(0);
    }

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }
}
