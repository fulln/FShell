package com.fulln.commands;

import com.fulln.configuration.CodeGenConfig;
import com.fulln.record.CommandRecord;
import com.fulln.service.ProjectConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.*;

@ShellCommandGroup("home commands")
@ShellComponent
public class HomeCommand {

    @Autowired
    private ProjectConfigService projectConfigService;


    @ShellMethod(value = "show home", key = "f")
    public String home(@ShellOption(defaultValue = "fulln") String name) {
        var commandRecord = new CommandRecord("home", "f", "fulln", name);
        return "Welcome to FShell : " + name;
    }

    @ShellMethod(value = "do code generate", key = "d")
    public String code(@ShellOption(defaultValue = "fulln",help = "可以输入任意字符") String name) {
        return "do some generate : " + name;
    }

    @ShellMethod(value = "set config about project include", key = "config")
    public String config(@ShellOption(defaultValue = "projectName",help = "可以输入任意项目") String params,@ShellOption(defaultValue = "列表查询",help = "可以输入任意字符") String al) {


            if (params.equals("dbName")) {
                return projectConfigService.getCurrentDataBase();
            } else if (params.equals("basePackage")) {
                return projectConfigService.getBasePackage();
            } else if (params.equals("projectName")) {
                return projectConfigService.getProjectName();
            } else if (params.equals("currentModule")) {
                return projectConfigService.getAllGenerateModel().toString();
            } else {
                return "error";
            }
    }



}
