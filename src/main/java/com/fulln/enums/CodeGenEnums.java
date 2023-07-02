package com.fulln.enums;


public enum CodeGenEnums {

    generateCode("generateCode", "gc", "generateCode", "generateCode");

    CodeGenEnums(String name, String key, String value, String help) {
        this.name = name;
        this.key = key;
        this.value = value;
        this.help = help;
    }

    public final String name;

    public final String key;

    public final String value;

    public final String help;

    public static final String url  = "http://localhost:8080/generate";

    public void getDetailUrl(String params) {

    }

}
