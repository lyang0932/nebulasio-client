package com.nebulasio.client.api.response;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/07
 **/
public class EstimateGas implements Serializable {

    private String gas;

    private String err;

    public String getGas() {
        return gas;
    }

    public EstimateGas setGas(String gas) {
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
