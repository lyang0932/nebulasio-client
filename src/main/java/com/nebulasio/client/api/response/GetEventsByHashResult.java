package com.nebulasio.client.api.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Create by liuyang89 on 2018/05/07
 **/
public class GetEventsByHashResult implements Serializable {

    private List<Event> events = new ArrayList<>();

    public GetEventsByHashResult() {
    }

    public GetEventsByHashResult(List<Event> events) {
        this.events = events;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetEventsByHashResult{");
        sb.append("events=").append(events);
        sb.append('}');
        return sb.toString();
    }
}
