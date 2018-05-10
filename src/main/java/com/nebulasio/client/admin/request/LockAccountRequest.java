package com.nebulasio.client.admin.request;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/10
 **/
public class LockAccountRequest implements Serializable{

    private String address;

    public LockAccountRequest() {
    }

    public LockAccountRequest(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public LockAccountRequest setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LockAccountRequest{");
        sb.append("address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
