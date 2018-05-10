package com.nebulasio.client.api.response;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/05
 **/
public class Response<T> implements Serializable {

    private String error;

    private T result;

    public Response() {
    }

    public Response(String error, T result) {
        this.error = error;
        this.result = result;
    }

    public String getError() {
        return error;
    }

    public Response<T> setError(String error) {
        this.error = error;
        return this;
    }

    public T getResult() {
        return result;
    }

    public Response<T> setResult(T result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Response{");
        sb.append("error='").append(error).append('\'');
        sb.append(", result=").append(result);
        sb.append('}');
        return sb.toString();
    }
}
