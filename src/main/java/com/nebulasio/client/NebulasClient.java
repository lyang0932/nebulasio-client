package com.nebulasio.client;

import com.nebulasio.client.api.request.*;
import com.nebulasio.client.api.response.*;
import com.nebulasio.client.impl.HttpNebulasClient;

/**
 * Create by liuyang89 on 2018/05/05
 **/
public interface NebulasClient {

    static NebulasClient create(String host) {
        return new HttpNebulasClient(host);
    }

    Response<NebState> getNebState();

    Response<AccountState> getAccountState(GetAccountStateRequest request);

    Response<Block> latestIrreversibleBlock();

    Response<CallResult> call(CallRequest request);

    Response<RawTransaction> sendRawTransaction(SendRawTransactionRequest request);

    Response<Block> getBlockByHash(GetBlockByHashRequest request);

    Response<Block> getBlockByHeight(GetBlockByHeightRequest request);

    Response<TransactionReceipt> getTransactionReceipt(GetTransactionReceiptRequest request);

    Response<Event> subscribe(SubscribeRequest request);

    Response<GasPrice> getGasPrice();

    Response<EstimateGas> estimateGas(EstimateGasRequest request);

    Response<GetEventsByHashResult> getEventsByHash(GetEventByHashRequest request);

    Response<GetMinerResult> getDynasty(GetMinerRequest request);

}
