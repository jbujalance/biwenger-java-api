package org.biwenger.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class AbstractResponse<Data extends AbstractData> {

    @JsonProperty("status")
    private int status;
    @JsonProperty("data")
    private Data data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
