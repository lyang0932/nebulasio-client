package com.nebulasio.client.api.response;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/05
 **/
public class ConsensusRoot implements Serializable {

    private  Long timestamp;

    private String proposer;

    private String dynastyRoot;

    public Long getTimestamp() {
        return timestamp;
    }

    public ConsensusRoot setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public String getProposer() {
        return proposer;
    }

    public ConsensusRoot setProposer(String proposer) {
        this.proposer = proposer;
        return this;
    }

    public String getDynastyRoot() {
        return dynastyRoot;
    }

    public ConsensusRoot setDynastyRoot(String dynastyRoot) {
        this.dynastyRoot = dynastyRoot;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ConsensusRoot{");
        sb.append("timestamp=").append(timestamp);
        sb.append(", proposer='").append(proposer).append('\'');
        sb.append(", dynastyRoot='").append(dynastyRoot).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
