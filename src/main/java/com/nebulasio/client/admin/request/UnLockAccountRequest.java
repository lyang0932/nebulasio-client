package com.nebulasio.client.admin.request;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/10
 **/
public class UnLockAccountRequest implements Serializable {

    private String address;

    private String passphrase;

    private String duration;

    public UnLockAccountRequest() {
    }

    public UnLockAccountRequest(String address, String passphrase, String duration) {
        this.address = address;
        this.passphrase = passphrase;
        this.duration = duration;
    }

    public String getAddress() {
        return address;
    }

    public UnLockAccountRequest setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getPassphrase() {
        return passphrase;
    }

    public UnLockAccountRequest setPassphrase(String passphrase) {
        this.passphrase = passphrase;
        return this;
    }

    public String getDuration() {
        return duration;
    }

    public UnLockAccountRequest setDuration(String duration) {
        this.duration = duration;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UnLockAccountRequest{");
        sb.append("address='").append(address).append('\'');
        sb.append(", passphrase='").append(passphrase).append('\'');
        sb.append(", duration='").append(duration).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
