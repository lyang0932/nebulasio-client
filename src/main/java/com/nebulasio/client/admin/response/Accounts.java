package com.nebulasio.client.admin.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Create by liuyang89 on 2018/05/10
 **/
public class Accounts implements Serializable {

    private List<String> addresses = new ArrayList<>();

    public List<String> getAddresses() {
        return addresses;
    }

    public Accounts setAddresses(List<String> addresses) {
        this.addresses = addresses;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Accounts{");
        sb.append("addresses=").append(addresses);
        sb.append('}');
        return sb.toString();
    }

}
