package com.fulln.commands;

import com.fulln.record.CommandRecord;
import org.springframework.shell.standard.ShellCommandGroup;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellCommandGroup("home commands")
@ShellComponent
public class HomeCommand {

    @ShellMethod(value = "show home", key = "f")
    public String home(@ShellOption(defaultValue = "fulln") String name) {
        var commandRecord = new CommandRecord("home", "f", "fulln", name);

        return "Welcome to FShell : "+name;
    }

    @ShellMethod(value = "do code generate", key = "d")
    public String code(@ShellOption(defaultValue = "fulln",help = "可以输入任意字符") String name) {
        return "do some generate : "+name;
    }



}
