package com.nebulasio.client;

import com.nebulasio.client.admin.request.*;
import com.nebulasio.client.admin.response.*;
import com.nebulasio.client.api.response.Response;
import com.nebulasio.client.impl.HttpNebulasClient;
import okhttp3.OkHttpClient;

/**
 * Create by liuyang89 on 2018/05/10
 **/
public interface NebulasAdminClient {

    static NebulasClient create(String host) {
        return new HttpNebulasClient(host);
    }

    static NebulasClient create(String host, OkHttpClient okHttpClient) {
        return new HttpNebulasClient(host, okHttpClient);
    }

    Response<NodeInfo> nodeInfo();

    Response<Accounts> accounts();

    Response<Account> createAccount(CreateAccountRequest request);

    Response<UnLockAccountResult> unLockAccount(UnLockAccountRequest request);

    Response<LockAccountResult> lockAccount(LockAccountRequest request);

    Response<SignTransactionWithPassphraseResult> signTransactionWithPassphrase(SignTransactionWithPassphraseRequest request);

    Response<SendTransactionResult> sendTransaction(SendTransactionRequest request);

    Response<SignHashResult> signHash(SignHashRequest request);

    Response<StartPprofResult> startPprof(StartPprofRequest request);

    Response<NebConfig> getConfig();


}
