/*
 * Copyright Camelot Global. All rights reserved
 */
package org.mycomp.model;

/**
 *
 * @author mmkamm
 */
public enum LoginCases {

    FILE_FOUND_KEY_MATCHED("fileFoundKeyMatched"),
    FILE_FOUND_KEY_REJECTED("fileFoundKeyRejected"),
    FILE_NOT_FOUND("fileNotFound");

    private String value;

    private LoginCases(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
