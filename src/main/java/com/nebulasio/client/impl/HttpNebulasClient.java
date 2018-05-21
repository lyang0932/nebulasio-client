package com.nebulasio.client.impl;

import com.google.gson.reflect.TypeToken;
import com.nebulasio.client.NebulasClient;
import com.nebulasio.client.api.request.*;
import com.nebulasio.client.api.response.*;
import com.nebulasio.client.http.HttpClient;
import com.nebulasio.client.http.OKHttpClient;
import okhttp3.OkHttpClient;

/**
 * Create by liuyang89 on 2018/05/05
 **/
public class HttpNebulasClient implements NebulasClient {

    private String host;

    private HttpClient client;

    static NebulasClient create(String host) {
        return new HttpNebulasClient(host);
    }

    static NebulasClient create(String host , OkHttpClient okHttpClient) {
        return new HttpNebulasClient(host , okHttpClient);
    }

    public HttpNebulasClient(String host) {
        this.host = host;
        this.client = new OKHttpClient();
    }

    public HttpNebulasClient(String host, OkHttpClient client) {
        this.host = host;
        this.client = new OKHttpClient(client);
    }

    @Override
    public Response<NebState> getNebState() {
        return client.get(host + "/v1/user/nebstate", new TypeToken<Response<NebState>>() {});
    }

    @Override
    public Response<AccountState> getAccountState(GetAccountStateRequest request) {
        return client.post(host + "/v1/user/accountstate", request, new TypeToken<Response<AccountState>>() {});
    }

    @Override
    public Response<Block> latestIrreversibleBlock() {
        return client.get(host + "/v1/user/lib", new TypeToken<Response<Block>>(){});
    }

    @Override
    public Response<CallResult> call(CallRequest request) {
        return client.post(host + "/v1/user/call", request , new TypeToken<Response<CallResult>>(){});
    }

    @Override
    public Response<RawTransaction> sendRawTransaction(SendRawTransactionRequest request) {
        return client.post(host + "/v1/user/rawtransaction",request ,  new TypeToken<Response<RawTransaction>>(){});
    }

    @Override
    public Response<Block> getBlockByHash(GetBlockByHashRequest request) {
        return client.post(host + "/v1/user/getBlockByHash", request , new TypeToken<Response<Block>>(){});
    }

    @Override
    public Response<Block> getBlockByHeight(GetBlockByHeightRequest request) {
        return client.post(host + "/v1/user/getBlockByHeight", request , new TypeToken<Response<Block>>(){});
    }

    @Override
    public Response<TransactionReceipt> getTransactionReceipt(GetTransactionReceiptRequest request) {
        return client.post(host + "/v1/user/getTransactionReceipt", request , new TypeToken<Response<TransactionReceipt>>(){});
    }

    @Override
    public Response<Event> subscribe(SubscribeRequest request) {
        return client.post(host + "/v1/user/subscribe", request , new TypeToken<Response<Event>>(){});
    }

    @Override
    public Response<GasPrice> getGasPrice() {
        return client.get(host + "/v1/user/getGasPrice", new TypeToken<Response<GasPrice>>(){});
    }

    @Override
    public Response<EstimateGas> estimateGas(EstimateGasRequest request) {
        return client.post(host + "/v1/user/estimateGas", request , new TypeToken<Response<EstimateGas>>(){});
    }

    @Override
    public Response<GetEventsByHashResult> getEventsByHash(GetEventByHashRequest request) {
        return client.post(host + "/v1/user/getEventsByHash" , request , new TypeToken<Response<GetEventsByHashResult>>(){});
    }

    @Override
    public Response<GetMinerResult> getDynasty(GetMinerRequest request) {
        return client.post(host + "/v1/user/dynasty" , request , new TypeToken<Response<GetMinerResult>>(){});
    }

}
