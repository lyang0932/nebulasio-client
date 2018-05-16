package com.nebulasio.client.api.response;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/05
 **/
public class CallResult implements Serializable{

    private String result;

    private String executeErr;

    private String estimateGas;

    public CallResult() {
    }

    public CallResult(String result, String executeErr, String estimateGas) {
        this.result = result;
        this.executeErr = executeErr;
        this.estimateGas = estimateGas;
    }

    public String getResult() {
        return result;
    }

    public CallResult setResult(String result) {
        this.result = result;
        return this;
    }

    public String getExecuteErr() {
        return executeErr;
    }

    public CallResult setExecuteErr(String executeErr) {
        this.executeErr = executeErr;
        return this;
    }

    public String getEstimateGas() {
        return estimateGas;
    }

    public CallResult setEstimateGas(String estimateGas) {
        this.estimateGas = estimateGas;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CallResult{");
        sb.append("result=").append(result);
        sb.append(", executeErr='").append(executeErr).append('\'');
        sb.append(", estimateGas=").append(estimateGas);
        sb.append('}');
        return sb.toString();
    }
}
