package com.nebulasio.client.api.response;


import com.nebulasio.client.enums.AddressType;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Create by liuyang89 on 2018/05/05
 **/

public class AccountState implements Serializable{

    private BigDecimal balance;

    private Long nonce;

    private AddressType type;

    public BigDecimal getBalance() {
        return balance;
    }

    public AccountState setBalance(BigDecimal balance) {
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

    public AddressType getType() {
        return type;
    }

    public AccountState setType(AddressType type) {
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
