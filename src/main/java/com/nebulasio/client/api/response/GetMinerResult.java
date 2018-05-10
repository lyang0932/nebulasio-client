package com.nebulasio.client.api.response;

import com.google.common.collect.Lists;

import java.io.Serializable;
import java.util.List;

/**
 * Create by liuyang89 on 2018/05/07
 **/
public class GetMinerResult implements Serializable {

    private List<String> miners = Lists.newArrayList();

    public GetMinerResult() {
    }

    public GetMinerResult(List<String> miners) {
        this.miners = miners;
    }

    public List<String> getMiners() {
        return miners;
    }

    public GetMinerResult setMiners(List<String> miners) {
        this.miners = miners;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetMinerResult{");
        sb.append("miners=").append(miners);
        sb.append('}');
        return sb.toString();
    }
}
