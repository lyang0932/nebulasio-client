package com.nebulasio.client.api.response;


import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/05
 **/

public class AccountState implements Serializable {

    private String balance;

    private Long nonce;

    private Integer type;

    public String getBalance() {
        return balance;
    }

    public AccountState setBalance(String balance) {
        this.balance = balance;
        return this;
    }

    public Long getNonce() {
        return nonce;
    }

    public AccountState setNonce(Long nonce) {
        this.nonce = nonce;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public AccountState setType(Integer type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AccountState{");
        sb.append("balance=").append(balance);
        sb.append(", nonce=").append(nonce);
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
