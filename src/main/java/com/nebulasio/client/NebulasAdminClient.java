package com.nebulasio.client;

import com.nebulasio.client.admin.request.*;
import com.nebulasio.client.admin.response.*;
import com.nebulasio.client.api.response.Response;

/**
 * Create by liuyang89 on 2018/05/10
 **/
public interface NebulasAdminClient {

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
