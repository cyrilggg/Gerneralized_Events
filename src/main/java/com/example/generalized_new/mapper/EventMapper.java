package com.example.generalized_new.mapper;

import com.example.generalized_new.bean.EventBean;
import com.example.generalized_new.bean.EventTypeBean;

import java.util.List;

public interface EventMapper {

    List<EventBean> findByTitle(String title);

    List<EventBean> findByEventId(String Event_Id);

    List<EventBean> findPreOrderEvent(String Event_Id);

    List<EventBean> findBackOrderEvent(String Event_Id);

    List<EventBean> findWholeChain(String Chain_Id);

    List<EventTypeBean> findByTypeId(String Event_Type_Id);

}
