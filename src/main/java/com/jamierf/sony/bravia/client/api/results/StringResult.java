package com.jamierf.sony.bravia.client.api.results;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jamierf.sony.bravia.client.api.Result;

public class StringResult extends Result<Object> {
    @JsonCreator
    public StringResult(
            @JsonProperty("id") final int id,
            @JsonProperty("result") final Object result) {
        super(id, result);
    }
}
