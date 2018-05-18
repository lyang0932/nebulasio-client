package com.nebulasio.client.api.response;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Create by liuyang89 on 2018/05/07
 **/
@Data
@ToString
public class GetEventsByHashResult implements Serializable {

    private List<Event> events = new ArrayList<>();

}
