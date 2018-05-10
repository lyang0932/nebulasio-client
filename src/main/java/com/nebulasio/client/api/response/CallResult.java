package com.nebulasio.client.api.response;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Create by liuyang89 on 2018/05/05
 **/
public class CallResult implements Serializable{

    private Integer result;

    private String executeErr;

    private BigDecimal estimateGas;

    public CallResult() {
    }

    public CallResult(Integer result, String executeErr, BigDecimal estimateGas) {
        this.result = result;
        this.executeErr = executeErr;
        this.estimateGas = estimateGas;
    }

    public Integer getResult() {
        return result;
    }

    public CallResult setResult(Integer result) {
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

    public BigDecimal getEstimateGas() {
        return estimateGas;
    }

    public CallResult setEstimateGas(BigDecimal estimateGas) {
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
