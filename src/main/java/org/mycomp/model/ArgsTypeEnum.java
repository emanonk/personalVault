/*
 * Copyright Camelot Global. All rights reserved
 */
package org.mycomp.model;

/**
 *
 * @author mmkamm
 */
public enum ArgsTypeEnum {

    COMMAND("command"),
    OPTIONS("options"),
    ARGS("args");

    private String type;

    private ArgsTypeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }



}
