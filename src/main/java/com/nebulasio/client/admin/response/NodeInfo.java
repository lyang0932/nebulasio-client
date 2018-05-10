package com.nebulasio.client.admin.response;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Create by liuyang89 on 2018/05/10
 **/
public class NodeInfo implements Serializable {

    private String id;

    private Long chainId;

    private String coinbase;

    private Long peerCount;

    @SerializedName(value = "synchronized")
    private boolean syn;

    private Integer bucketSize;

    private String protocolVersion;

    private List<RouteTable> routeTable = new ArrayList<>();

    public String getId() {
        return id;
    }

    public NodeInfo setId(String id) {
        this.id = id;
        return this;
    }

    public Long getChainId() {
        return chainId;
    }

    public NodeInfo setChainId(Long chainId) {
        this.chainId = chainId;
        return this;
    }

    public String getCoinbase() {
        return coinbase;
    }

    public NodeInfo setCoinbase(String coinbase) {
        this.coinbase = coinbase;
        return this;
    }

    public Long getPeerCount() {
        return peerCount;
    }

    public NodeInfo setPeerCount(Long peerCount) {
        this.peerCount = peerCount;
        return this;
    }

    public boolean isSyn() {
        return syn;
    }

    public NodeInfo setSyn(boolean syn) {
        this.syn = syn;
        return this;
    }

    public Integer getBucketSize() {
        return bucketSize;
    }

    public NodeInfo setBucketSize(Integer bucketSize) {
        this.bucketSize = bucketSize;
        return this;
    }

    public String getProtocolVersion() {
        return protocolVersion;
    }

    public NodeInfo setProtocolVersion(String protocolVersion) {
        this.protocolVersion = protocolVersion;
        return this;
    }

    public List<RouteTable> getRouteTable() {
        return routeTable;
    }

    public NodeInfo setRouteTable(List<RouteTable> routeTable) {
        this.routeTable = routeTable;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NodeInfo{");
        sb.append("id='").append(id).append('\'');
        sb.append(", chainId=").append(chainId);
        sb.append(", coinbase='").append(coinbase).append('\'');
        sb.append(", peerCount=").append(peerCount);
        sb.append(", syn=").append(syn);
        sb.append(", bucketSize=").append(bucketSize);
        sb.append(", protocolVersion='").append(protocolVersion).append('\'');
        sb.append(", routeTable=").append(routeTable);
        sb.append('}');
        return sb.toString();
    }
}
