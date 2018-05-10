package com.nebulasio.client.api.response;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Create by liuyang89 on 2018/05/07
 **/
public class Event implements Serializable {

    private String topic;

    private Map<String,String> data = new HashMap();

    public Event() {
    }

    public Event(String topic, Map<String, String> data) {
        this.topic = topic;
        this.data = data;
    }

    public String getTopic() {
        return topic;
    }

    public Event setTopic(String topic) {
        this.topic = topic;
        return this;
    }

    public Map<String, String> getData() {
        return data;
    }

    public Event setData(Map<String, String> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SubscribeResult{");
        sb.append("topic='").append(topic).append('\'');
        sb.append(", data=").append(data);
        sb.append('}');
        return sb.toString();
    }
}
