package com.ciscospark;

import java.net.URI;
import java.util.Date;

public class Webhook {
    private Date created;
    private String event;
    private String filter;
    private String id;
    private String name;
    private String resource;
    private URI targetUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public URI getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(URI targetUrl) {
        this.targetUrl = targetUrl;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
