package com.jamierf.sony.bravia.client.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Request {

    private static final String DEFAULT_VERSION = "1.0";
    private static final AtomicInteger REQUEST_COUNTER = new AtomicInteger(0);

    @JsonProperty
    private final int id;

    @JsonProperty
    private final String method;

    @JsonProperty
    private final String version;

    @JsonProperty
    private final List<Object> params;

    public Request(final String method) {
        this (REQUEST_COUNTER.incrementAndGet(), method, DEFAULT_VERSION, Collections.emptyList());
    }

    public Request(final int id, final String method, final String version, final List<Object> params) {
        this.id = id;
        this.method = method;
        this.version = version;
        this.params = params;
    }

    public int getId() {
        return id;
    }

    public String getMethod() {
        return method;
    }

    public String getVersion() {
        return version;
    }

    public List<Object> getParams() {
        return params;
    }
}
