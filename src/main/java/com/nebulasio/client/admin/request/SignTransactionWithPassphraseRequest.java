package com.nebulasio.client.admin.request;

import com.nebulasio.client.api.request.Contract;
import com.nebulasio.client.enums.TransactionType;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Create by liuyang89 on 2018/05/10
 **/
public class SignTransactionWithPassphraseRequest implements Serializable {

    private String from;

    private String to;

    private BigDecimal value;

    private Long nonce;

    private BigDecimal gasPrice;

    private BigDecimal gasLimit;

    private TransactionType type;

    private Contract contract;

    public SignTransactionWithPassphraseRequest() {
    }

    public SignTransactionWithPassphraseRequest(String from, String to, BigDecimal value, Long nonce, BigDecimal gasPrice, BigDecimal gasLimit, TransactionType type) {
        this.from = from;
        this.to = to;
        this.value = value;
        this.nonce = nonce;
        this.gasPrice = gasPrice;
        this.gasLimit = gasLimit;
        this.type = type;
    }

    public SignTransactionWithPassphraseRequest(String from, String to, BigDecimal value, Long nonce, BigDecimal gasPrice, BigDecimal gasLimit, TransactionType type, Contract contract) {
        this.from = from;
        this.to = to;
        this.value = value;
        this.nonce = nonce;
        this.gasPrice = gasPrice;
        this.gasLimit = gasLimit;
        this.type = type;
        this.contract = contract;
    }

    public String getFrom() {
        return from;
    }

    public SignTransactionWithPassphraseRequest setFrom(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public SignTransactionWithPassphraseRequest setTo(String to) {
        this.to = to;
        return this;
    }

    public BigDecimal getValue() {
        return value;
    }

    public SignTransactionWithPassphraseRequest setValue(BigDecimal value) {
        this.value = value;
        return this;
    }

    public Long getNonce() {
        return nonce;
    }

    public SignTransactionWithPassphraseRequest setNonce(Long nonce) {
        this.nonce = nonce;
        return this;
    }

    public BigDecimal getGasPrice() {
        return gasPrice;
    }

    public SignTransactionWithPassphraseRequest setGasPrice(BigDecimal gasPrice) {
        this.gasPrice = gasPrice;
        return this;
    }

    public BigDecimal getGasLimit() {
        return gasLimit;
    }

    public SignTransactionWithPassphraseRequest setGasLimit(BigDecimal gasLimit) {
        this.gasLimit = gasLimit;
        return this;
    }

    public TransactionType getType() {
        return type;
    }

    public SignTransactionWithPassphraseRequest setType(TransactionType type) {
        this.type = type;
        return this;
    }

    public Contract getContract() {
        return contract;
    }

    public SignTransactionWithPassphraseRequest setContract(Contract contract) {
        this.contract = contract;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SendTransactionRequest{");
        sb.append("from='").append(from).append('\'');
        sb.append(", to='").append(to).append('\'');
        sb.append(", value=").append(value);
        sb.append(", nonce=").append(nonce);
        sb.append(", gasPrice=").append(gasPrice);
        sb.append(", gasLimit=").append(gasLimit);
        sb.append(", type=").append(type);
        sb.append(", contract=").append(contract);
        sb.append('}');
        return sb.toString();
    }
}
