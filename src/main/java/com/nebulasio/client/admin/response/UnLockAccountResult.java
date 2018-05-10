package com.nebulasio.client.admin.response;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/10
 **/
public class UnLockAccountResult implements Serializable {

    private Boolean result;

    public boolean isResult() {
        return result;
    }

    public UnLockAccountResult setResult(boolean result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UnLockAccountResult{");
        sb.append("result=").append(result);
        sb.append('}');
        return sb.toString();
    }
}
