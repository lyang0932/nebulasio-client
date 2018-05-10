package com.nebulasio.client.api.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Create by liuyang89 on 2018/05/05
 **/
public class Block implements Serializable {

    private String hash;

    private String parentHash;

    private Long height;

    private Long nonce;

    private String coinbase;

    private Long timestamp;

    private Long chainId;

    private String stateRoot;

    private String txsRoot;

    private String eventsRoot;

    private ConsensusRoot consensusRoot;

    private String miner;

    private boolean isFinality;

    private List<TransactionReceipt> transactions = new ArrayList<>();

    public String getHash() {
        return hash;
    }

    public Block setHash(String hash) {
        this.hash = hash;
        return this;
    }

    public String getParentHash() {
        return parentHash;
    }

    public Block setParentHash(String parentHash) {
        this.parentHash = parentHash;
        return this;
    }

    public Long getHeight() {
        return height;
    }

    public Block setHeight(Long height) {
        this.height = height;
        return this;
    }

    public Long getNonce() {
        return nonce;
    }

    public Block setNonce(Long nonce) {
        this.nonce = nonce;
        return this;
    }

    public String getCoinbase() {
        return coinbase;
    }

    public Block setCoinbase(String coinbase) {
        this.coinbase = coinbase;
        return this;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public Block setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public Long getChainId() {
        return chainId;
    }

    public Block setChainId(Long chainId) {
        this.chainId = chainId;
        return this;
    }

    public String getStateRoot() {
        return stateRoot;
    }

    public Block setStateRoot(String stateRoot) {
        this.stateRoot = stateRoot;
        return this;
    }

    public String getTxsRoot() {
        return txsRoot;
    }

    public Block setTxsRoot(String txsRoot) {
        this.txsRoot = txsRoot;
        return this;
    }

    public String getEventsRoot() {
        return eventsRoot;
    }

    public Block setEventsRoot(String eventsRoot) {
        this.eventsRoot = eventsRoot;
        return this;
    }

    public ConsensusRoot getConsensusRoot() {
        return consensusRoot;
    }

    public Block setConsensusRoot(ConsensusRoot consensusRoot) {
        this.consensusRoot = consensusRoot;
        return this;
    }

    public String getMiner() {
        return miner;
    }

    public Block setMiner(String miner) {
        this.miner = miner;
        return this;
    }

    public boolean isFinality() {
        return isFinality;
    }

    public Block setFinality(boolean finality) {
        isFinality = finality;
        return this;
    }

    public List<TransactionReceipt> getTransactions() {
        return transactions;
    }

    public Block setTransactions(List<TransactionReceipt> transactions) {
        this.transactions = transactions;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LatestIrreversibleBlock{");
        sb.append("hash='").append(hash).append('\'');
        sb.append(", parentHash='").append(parentHash).append('\'');
        sb.append(", height=").append(height);
        sb.append(", nonce=").append(nonce);
        sb.append(", coinbase='").append(coinbase).append('\'');
        sb.append(", timestamp=").append(timestamp);
        sb.append(", chainId=").append(chainId);
        sb.append(", stateRoot='").append(stateRoot).append('\'');
        sb.append(", txsRoot='").append(txsRoot).append('\'');
        sb.append(", eventsRoot='").append(eventsRoot).append('\'');
        sb.append(", consensusRoot=").append(consensusRoot);
        sb.append(", miner='").append(miner).append('\'');
        sb.append(", isFinality=").append(isFinality);
        sb.append(", transactions=").append(transactions);
        sb.append('}');
        return sb.toString();
    }
}
