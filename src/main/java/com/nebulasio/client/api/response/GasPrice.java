package com.nebulasio.client.api.response;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/07
 **/
public class GasPrice implements Serializable {

    private String gasPrice;

    public GasPrice() {
    }

    public GasPrice(String gasPrice) {
        this.gasPrice = gasPrice;
    }

    public String getGasPrice() {
        return gasPrice;
    }

    public GasPrice setGasPrice(String gasPrice) {
        this.gasPrice = gasPrice;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GasPrice{");
        sb.append("gasPrice=").append(gasPrice);
        sb.append('}');
        return sb.toString();
    }
}
