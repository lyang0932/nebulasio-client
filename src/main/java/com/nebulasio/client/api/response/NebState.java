package com.nebulasio.client.api.response;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/05
 **/
public class NebState implements Serializable {

    private Integer chainId;

    private String tail;

    private String lib;

    private Long height;

    private String protocolVersion;

    @SerializedName(value = "synchronized")
    private boolean syn;

    private String version;

    public Integer getChainId() {
        return chainId;
    }

    public NebState setChainId(Integer chainId) {
        this.chainId = chainId;
        return this;
    }

    public String getTail() {
        return tail;
    }

    public NebState setTail(String tail) {
        this.tail = tail;
        return this;
    }

    public String getLib() {
        return lib;
    }

    public NebState setLib(String lib) {
        this.lib = lib;
        return this;
    }

    public Long getHeight() {
        return height;
    }

    public NebState setHeight(Long height) {
        this.height = height;
        return this;
    }

    public String getProtocolVersion() {
        return protocolVersion;
    }

    public NebState setProtocolVersion(String protocolVersion) {
        this.protocolVersion = protocolVersion;
        return this;
    }

    public boolean isSyn() {
        return syn;
    }

    public NebState setSyn(boolean syn) {
        this.syn = syn;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public NebState setVersion(String version) {
        this.version = version;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NebState{");
        sb.append("chainId=").append(chainId);
        sb.append(", tail='").append(tail).append('\'');
        sb.append(", lib='").append(lib).append('\'');
        sb.append(", height=").append(height);
        sb.append(", protocolVersion='").append(protocolVersion).append('\'');
        sb.append(", syn=").append(syn);
        sb.append(", version='").append(version).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
