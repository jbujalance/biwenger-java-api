package org.biwenger.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class AbstractResponse<D extends AbstractData> {

    @JsonProperty("status")
    private Integer status;
    @JsonProperty("data")
    private D data;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer pStatus) {
        this.status = pStatus;
    }

    public D getData() {
        return data;
    }

    public void setData(D pData) {
        this.data = pData;
    }
}
