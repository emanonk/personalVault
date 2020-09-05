package org.mycomp.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mmkamm on 21/01/2018.
 */
public class Credentials {

    private long id;
    private String serviceName;
    private List<Attribute> attributes;

    public Credentials() {}

    public Credentials(String serviceName) {
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
