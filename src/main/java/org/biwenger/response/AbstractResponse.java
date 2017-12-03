package org.biwenger.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class AbstractResponse<Data extends AbstractData> {

    @JsonProperty("status")
    private Integer status;
    @JsonProperty("data")
    private Data data;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer pStatus) {
        this.status = pStatus;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data pData) {
        this.data = pData;
    }
}
