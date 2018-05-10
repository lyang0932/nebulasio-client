package com.nebulasio.client.admin.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Create by liuyang89 on 2018/05/10
 **/
public class RouteTable implements Serializable {

    private String id;

    private List<String> address = new ArrayList<>();

    public String getId() {
        return id;
    }

    public RouteTable setId(String id) {
        this.id = id;
        return this;
    }

    public List<String> getAddress() {
        return address;
    }

    public RouteTable setAddress(List<String> address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RouteTable{");
        sb.append("id='").append(id).append('\'');
        sb.append(", address=").append(address);
        sb.append('}');
        return sb.toString();
    }

}
