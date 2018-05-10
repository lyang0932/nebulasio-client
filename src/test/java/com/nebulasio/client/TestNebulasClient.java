package com.nebulasio.client;

import com.nebulasio.client.api.response.NebState;
import com.nebulasio.client.api.response.Response;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Create by liuyang89 on 2018/05/10
 **/
@RunWith(JUnit4.class)
public class TestNebulasClient {

    private NebulasClient nebulasClient = NebulasClient.create("http://127.0.0.1:8685");

    @Test
    public void testGetNebState() {
        Response<NebState> response = nebulasClient.getNebState();
        System.out.println(response);
    }

}
