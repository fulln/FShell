package com.fulln.service;

import com.fulln.configuration.CodeGenConfig;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@EnableConfigurationProperties(CodeGenConfig.class)
public class ProjectConfigService {

    private final CodeGenConfig config;

    public ProjectConfigService(CodeGenConfig config) {
        this.config = config;
    }

    public String getBasePackage() {
        return config.getEnv().getBasePackage();
    }

    public String getUserName() {
        return config.getUser();
    }

    public String getProjectName() {
        return config.getEnv().getName();
    }

    public List<String> getAllGenerateModel() {
        return config.getEnv().getCurrentModule();
    }

    public String getCurrentDataBase() {
        return config.getDataBaseConfig().currentName();
    }

    public List<String> getAllDataBase() {
        return config.getDataBaseConfig().getName();
    }

    @PostConstruct
    public void init() {
        System.out.println("ProjectConfigService init");
    }

}
