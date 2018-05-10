package com.nebulasio.client.api.response;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Create by liuyang89 on 2018/05/07
 **/
public class GasPrice implements Serializable {

    private BigDecimal gasPrice;

    public GasPrice() {
    }

    public GasPrice(BigDecimal gasPrice) {
        this.gasPrice = gasPrice;
    }

    public BigDecimal getGasPrice() {
        return gasPrice;
    }

    public GasPrice setGasPrice(BigDecimal gasPrice) {
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
