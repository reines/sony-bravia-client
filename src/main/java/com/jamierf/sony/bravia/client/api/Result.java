package com.jamierf.sony.bravia.client.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Result<T> {

    @JsonProperty
    private final int id;

    @JsonProperty
    private final T result;

    @JsonCreator
    public Result(
            @JsonProperty("id") final int id,
            @JsonProperty("result") final T result) {
        this.id = id;
        this.result = result;
    }

    public int getId() {
        return id;
    }

    public T getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "Result{" +
                "id=" + id +
                ", result=" + result +
                '}';
    }
}
