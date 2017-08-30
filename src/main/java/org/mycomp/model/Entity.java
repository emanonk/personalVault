/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mycomp.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mmkamm
 */
public class Entity {

    private long id;
    private String serviceName;
    private List<Attribute> attributes;

    public Entity(String serviceName, List<Attribute> attributeList) {
        this.serviceName = serviceName;
        this.attributes = attributeList;
    }

    public Entity(String serviceName) {
        this.attributes = new ArrayList();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public String getAttribute(String name) {
        for (Attribute attribute : attributes) {
            if (attribute.getName().equalsIgnoreCase(name)) {
                return attribute.getValue();
            }
        }
        return null;
    }

    public void putAttribute(String name, String value) {
        attributes.add(new Attribute(name, value));
    }

}
