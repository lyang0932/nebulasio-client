package com.nebulasio.client;

import com.nebulasio.client.api.request.*;
import com.nebulasio.client.api.response.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * Create by liuyang89 on 2018/05/10
 **/
@RunWith(JUnit4.class)
public class TestNebulasClient {

    private NebulasClient nebulasClient = NebulasClient.create("https://testnet.nebulas.io");

    @Test
    public void testGetNebState() {
        Response<NebState> response = nebulasClient.getNebState();
        System.out.println(response);
    }

    @Test
    public void testGetAccountState(){
        Response<AccountState> response = nebulasClient.getAccountState(new GetAccountStateRequest("n1Z6SbjLuAEXfhX1UJvXT6BB5osWYxVg3F3"));
        System.out.println(response);
    }

    @Test
    public void testLatestIrreversibleBlock(){
        Response<Block> response = nebulasClient.latestIrreversibleBlock();
        System.out.println(response);
    }

    @Test
    public void testCall(){
        Response<CallResult> response =
                nebulasClient.call(new CallRequest("n1Z6SbjLuAEXfhX1UJvXT6BB5osWYxVg3F3" ,  "n1mL2WCZyRi1oELEugfCZoNAW3dt8QpHtJw" , "0" , 3l , "1000000" , "2000000" , new Contract().setFunction("transferValue").setArgs("[500]")));
        System.out.println(response);
    }

    @Test
    public void testSendRawTransaction(){
        Response<RawTransaction> response = nebulasClient.sendRawTransaction(new SendRawTransactionRequest().setData("CiCrHtxyyIJks2/RErvBBA862D6iwAaGQ9OK1NisSGAuTBIYGiY1R9Fnx0z0uPkWbPokTeBIHFFKRaosGhgzPLPtjEF5cYRTgu3jz2egqWJwwF/i9wAiEAAAAAAAAAAADeC2s6dkAAAoAjDd/5jSBToICgZiaW5hcnlAZEoQAAAAAAAAAAAAAAAAAA9CQFIQAAAAAAAAAAAAAAAAAABOIFgBYkGLnnvGZEDSlocc202ZRWtUlbl2RHfGNdBY5eajFiHKThfgXIwGixh17LpnZGnYHlmfiGe2zqnFHdj7G8b2XIP2AQ=="));
        System.out.println(response);
    }

    @Test
    public void testGetBlockByHash(){
        Response<Block> response = nebulasClient.getBlockByHash(new GetBlockByHashRequest("00000658397a90df6459b8e7e63ad3f4ce8f0a40b8803ff2f29c611b2e0190b8" , true));
        System.out.println(response);
    }

    @Test
    public void testGetBlockByHeight(){
        Response<Block> response = nebulasClient.getBlockByHeight(new GetBlockByHeightRequest(1l , true));
        System.out.println(response);
    }

    @Test
    public void testGetTransactionReceipt(){
        Response<TransactionReceipt> response = nebulasClient.getTransactionReceipt(new GetTransactionReceiptRequest("cda54445ffccf4ea17f043e86e54be11b002053f9edbe30ae1fbc0437c2b6a73"));
        System.out.println(response);
    }

}
