package com.nebulasio.client.api.response;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Create by liuyang89 on 2018/05/07
 **/
public class EstimateGas implements Serializable {

    private BigDecimal gas;

    private String err;

    public BigDecimal getGas() {
        return gas;
    }

    public EstimateGas setGas(BigDecimal gas) {
        this.gas = gas;
        return this;
    }

    public String getErr() {
        return err;
    }

    public EstimateGas setErr(String err) {
        this.err = err;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EstimateGas{");
        sb.append("gas=").append(gas);
        sb.append(", err='").append(err).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
