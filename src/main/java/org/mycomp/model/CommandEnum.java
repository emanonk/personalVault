/*
 * Copyright Camelot Global. All rights reserved
 */
package org.mycomp.model;

/**
 *
 * @author mmkamm
 */
public enum CommandEnum {

    FIND("find", ""),
    ADD("add", ""),
    UPDATE("update", ""),
    DELETE("delete", ""),
    HELP("help", ""),
    EXPORT("export", ""),
    EXIT("exit", "");

    private String name;
    private String commandHelp;

    private CommandEnum(String name, String commandHelp) {
        this.name = name;
        this.commandHelp = commandHelp;
    }

    public String getName() {
        return name;
    }

    public String getHelp() {
        return commandHelp;
    }

}
