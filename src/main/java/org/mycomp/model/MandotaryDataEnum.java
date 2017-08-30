/*
 * Copyright Camelot Global. All rights reserved
 */
package org.mycomp.model;

/**
 *
 * @author mmkamm
 */
public enum MandotaryDataEnum {

    SERVICE_NAME("serviceName");

    private String value;

    private MandotaryDataEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}
