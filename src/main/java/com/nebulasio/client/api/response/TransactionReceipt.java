package com.nebulasio.client.api.response;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Create by liuyang89 on 2018/05/05
 **/
public class TransactionReceipt implements Serializable {

    private String hash;

    private Integer chainId;

    private String from;

    private String to;

    private BigDecimal value;

    private Long nonce;

    private Long timestamp;

    private String type;

    private String data;

    private BigDecimal gasPrice;

    private BigDecimal gasLimit;

    private String contractAddress;

    private int status;

    private BigDecimal gasUsed;

    public Long getTimestamp() {
        return timestamp;
    }

    public TransactionReceipt setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public String getHash() {
        return hash;
    }

    public TransactionReceipt setHash(String hash) {
        this.hash = hash;
        return this;
    }

    public Integer getChainId() {
        return chainId;
    }

    public TransactionReceipt setChainId(Integer chainId) {
        this.chainId = chainId;
        return this;
    }

    public String getFrom() {
        return from;
    }

    public TransactionReceipt setFrom(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public TransactionReceipt setTo(String to) {
        this.to = to;
        return this;
    }

    public BigDecimal getValue() {
        return value;
    }

    public TransactionReceipt setValue(BigDecimal value) {
        this.value = value;
        return this;
    }

    public Long getNonce() {
        return nonce;
    }

    public TransactionReceipt setNonce(Long nonce) {
        this.nonce = nonce;
        return this;
    }

    public String getType() {
        return type;
    }

    public TransactionReceipt setType(String type) {
        this.type = type;
        return this;
    }

    public String getData() {
        return data;
    }

    public TransactionReceipt setData(String data) {
        this.data = data;
        return this;
    }

    public BigDecimal getGasPrice() {
        return gasPrice;
    }

    public TransactionReceipt setGasPrice(BigDecimal gasPrice) {
        this.gasPrice = gasPrice;
        return this;
    }

    public BigDecimal getGasLimit() {
        return gasLimit;
    }

    public TransactionReceipt setGasLimit(BigDecimal gasLimit) {
        this.gasLimit = gasLimit;
        return this;
    }

    public String getContractAddress() {
        return contractAddress;
    }

    public TransactionReceipt setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
        return this;
    }

    public int getStatus() {
        return status;
    }

    public TransactionReceipt setStatus(int status) {
        this.status = status;
        return this;
    }

    public BigDecimal getGasUsed() {
        return gasUsed;
    }

    public TransactionReceipt setGasUsed(BigDecimal gasUsed) {
        this.gasUsed = gasUsed;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TransactionReceipt{");
        sb.append("hash='").append(hash).append('\'');
        sb.append(", chainId=").append(chainId);
        sb.append(", from='").append(from).append('\'');
        sb.append(", to='").append(to).append('\'');
        sb.append(", value=").append(value);
        sb.append(", nonce=").append(nonce);
        sb.append(", timestamp=").append(timestamp);
        sb.append(", type='").append(type).append('\'');
        sb.append(", data='").append(data).append('\'');
        sb.append(", gasPrice=").append(gasPrice);
        sb.append(", gasLimit=").append(gasLimit);
        sb.append(", contractAddress='").append(contractAddress).append('\'');
        sb.append(", status=").append(status);
        sb.append(", gasUsed=").append(gasUsed);
        sb.append('}');
        return sb.toString();
    }
}
