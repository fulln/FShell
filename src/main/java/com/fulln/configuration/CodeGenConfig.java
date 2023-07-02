package com.fulln.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@ConfigurationProperties(prefix = "config")
public class CodeGenConfig implements Serializable {

    private String user = "fulln";

    @NestedConfigurationProperty
    private final Project env = new Project();

    @NestedConfigurationProperty
    private final DataBaseConfig dataBaseConfig = new DataBaseConfig();




    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Project getEnv() {
        return env;
    }

    public DataBaseConfig getDataBaseConfig() {
        return dataBaseConfig;
    }

    public static class Project {

        private String basePackage = "com.fulln";

        private String name = "FShell";
        private List<String> currentModule = new ArrayList<>(List.of("async", "web", "biz", "dao", "rpc"));

        public String getBasePackage() {
            return basePackage;
        }

        public void setBasePackage(String basePackage) {
            this.basePackage = basePackage;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<String> getCurrentModule() {
            return currentModule;
        }

        public void setCurrentModule(List<String> currentModule) {
            this.currentModule = currentModule;
        }
    }
}
