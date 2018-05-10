package com.nebulasio.client.api.response;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/05
 **/
public class RawTransaction implements Serializable {

    private String txHash;

    private String contractAddress;

    public String getTxHash() {
        return txHash;
    }

    public RawTransaction setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }

    public String getContractAddress() {
        return contractAddress;
    }

    public RawTransaction setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RawTransaction{");
        sb.append("txHash='").append(txHash).append('\'');
        sb.append(", contractAddress='").append(contractAddress).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
