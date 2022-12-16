package com.example.generalized_new.serviceImpl;

import com.example.generalized_new.service.EventService;
import com.example.generalized_new.mapper.EventMapper;
import com.example.generalized_new.bean.EventBean;
import com.example.generalized_new.bean.ChainBean;
import com.example.generalized_new.bean.EventTypeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.*;
import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventMapper eventMapper;

    public List<EventBean> QueryByTitle(String title){
        return eventMapper.findByTitle(title);
    }

    public List<EventBean> QueryByEventId(String Event_Id){
        return eventMapper.findByEventId(Event_Id);
    }

    public List<EventBean> QueryPreOrderEvent(String Event_Id){
        return eventMapper.findPreOrderEvent(Event_Id);
    }

    public List<EventBean> QueryBackOrderEvent(String Event_Id){
        return eventMapper.findBackOrderEvent(Event_Id);
    }

    public List<EventBean> QueryWholeChain(String Event_Id){
        return eventMapper.findWholeChain(Event_Id);
    }

    public List<EventTypeBean> QueryByTypeId(String Event_Type_Id){
        return eventMapper.findByTypeId(Event_Type_Id);
    }
}
