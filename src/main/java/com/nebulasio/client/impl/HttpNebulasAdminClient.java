package com.nebulasio.client.impl;

import com.google.gson.reflect.TypeToken;
import com.nebulasio.client.NebulasAdminClient;
import com.nebulasio.client.admin.request.*;
import com.nebulasio.client.admin.response.*;
import com.nebulasio.client.api.response.Response;
import com.nebulasio.client.http.HttpClient;
import com.nebulasio.client.http.OKHttpClient;
import okhttp3.OkHttpClient;

/**
 * Create by liuyang89 on 2018/05/10
 **/
public class HttpNebulasAdminClient implements NebulasAdminClient {

    private String host;

    private HttpClient client;

    static NebulasAdminClient create(String host) {
        return new HttpNebulasAdminClient(host);
    }

    static NebulasAdminClient create(String host, OkHttpClient okHttpClient) {
        return new HttpNebulasAdminClient(host, okHttpClient);
    }

    public HttpNebulasAdminClient(String host) {
        this.host = host;
        this.client = new OKHttpClient();
    }

    public HttpNebulasAdminClient(String host, OkHttpClient client) {
        this.host = host;
        this.client = new OKHttpClient(client);
    }

    @Override
    public Response<NodeInfo> nodeInfo() {
        return client.get(host + "/v1/user/nodeinfo" , new TypeToken<Response<NodeInfo>>(){});
    }

    @Override
    public Response<Accounts> accounts() {
        return client.get(host + "/v1/admin/accounts" , new TypeToken<Response<Accounts>>(){});
    }

    @Override
    public Response<Account> createAccount(CreateAccountRequest request) {
        return client.post(host + "/v1/admin/account/new" ,request ,  new TypeToken<Response<Account>>(){});
    }

    @Override
    public Response<UnLockAccountResult> unLockAccount(UnLockAccountRequest request) {
        return client.post(host + "/v1/admin/account/unlock" ,request , new TypeToken<Response<UnLockAccountResult>>(){});
    }

    @Override
    public Response<LockAccountResult> lockAccount(LockAccountRequest request) {
        return client.post(host + "/v1/admin/account/lock" ,request ,  new TypeToken<Response<LockAccountResult>>(){});
    }

    @Override
    public Response<SignTransactionWithPassphraseResult> signTransactionWithPassphrase(SignTransactionWithPassphraseRequest request) {
        return client.post(host + "/v1/admin/sign" , request , new TypeToken<Response<SignTransactionWithPassphraseResult>>(){});
    }

    @Override
    public Response<SendTransactionWithPassphraseResult> sendTransactionWithPassphrase(SendTransactionWithPassphraseRequest request) {
        return client.post(host + "/v1/admin/transactionWithPassphrase" , request , new TypeToken<Response<SendTransactionWithPassphraseResult>>(){});
    }

    @Override
    public Response<SendTransactionResult> sendTransaction(SendTransactionRequest request) {
        return client.post(host + "/v1/user/transaction" , request , new TypeToken<Response<SendTransactionResult>>(){});
    }

    @Override
    public Response<SignHashResult> signHash(SignHashRequest request) {
        return client.post(host + "/v1/admin/sign/hash" ,request , new TypeToken<Response<SignHashResult>>(){});
    }

    @Override
    public Response<StartPprofResult> startPprof(StartPprofRequest request) {
        return client.post(host + "/v1/admin/pprof" , request , new TypeToken<Response<StartPprofResult>>(){});
    }

    @Override
    public Response<NebConfig> getConfig() {
        return client.get(host + "/v1/admin/getConfig" , new TypeToken<Response<NebConfig>>(){});
    }

}
