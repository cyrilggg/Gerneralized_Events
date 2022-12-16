package com.example.generalized_new.service;

import com.example.generalized_new.bean.EventBean;
import com.example.generalized_new.bean.EventTypeBean;

import java.util.List;

public interface EventService {

    List<EventBean> QueryByTitle(String title);

    List<EventBean> QueryByEventId(String Event_Id);

    List<EventBean> QueryPreOrderEvent(String Event_Id);

    List<EventBean> QueryBackOrderEvent(String Event_Id);

    List<EventBean> QueryWholeChain(String Chain_Id);

    List<EventTypeBean> QueryByTypeId(String Event_Type_Id);

}
