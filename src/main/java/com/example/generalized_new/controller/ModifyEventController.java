package com.example.generalized_new.controller;

import com.example.generalized_new.bean.EventBean;
import com.example.generalized_new.bean.EventTypeBean;
import com.example.generalized_new.service.EventService;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONObject;

import java.util.*;

@RestController
@RequestMapping("/menu")
public class ModifyEventController {
    @Autowired
    private EventService eventService;

    @GetMapping("/search_title")
    public JSONObject findByTitle(@RequestParam("Title") String Title) {
        List<EventBean> eventBeans = eventService.QueryByTitle(Title);
        JSONObject result = new JSONObject();

        if (eventBeans.size() == 0) {
            result.put("code", 400);
            result.put("msg", "search error!");
        } else {
            result.put("code", 200);
            result.put("msg", "search successful");
            result.put("data", eventBeans);
        }
        return result;
    }

    @GetMapping("/search")
    public JSONObject findById(@RequestParam("Event_Id")String id) {
        List<EventBean> events = eventService.QueryByEventId(id);
        JSONObject result = new JSONObject();
        if (events.size() == 0) {
            result.put("code", 400);
            result.put("msg", "search error!");
        } else {
            result.put("code", 200);
            result.put("msg", "search successful");
            result.put("data", events.get(0));
        }
        return result;
    }

    @GetMapping("/search_event_type")
    public JSONObject find_event_type(@RequestParam("Event_Type_Id")String id) {
        List<EventTypeBean> eventtypeBeans = eventService.QueryByTypeId(id);
        JSONObject result = new JSONObject();
        if (eventtypeBeans.size() == 0) {
            result.put("code", 400);
            result.put("msg", "search error!");
        } else {
            result.put("code", 200);
            result.put("msg", "search successful");
            result.put("data", eventtypeBeans);
        }
        return result;
    }

    @GetMapping("/search_pre_event")
    public JSONObject find_pre_event(@RequestParam("Event_Id")String id) {
        List<EventBean> eventBeans = eventService.QueryPreOrderEvent(id);
        JSONObject result = new JSONObject();
        if (eventBeans.size() == 0) {
            result.put("code", 400);
            result.put("msg", "search error!");
        } else {
            result.put("code", 200);
            result.put("msg", "search successful");
            result.put("data", eventBeans);
        }
        return result;
    }

    @GetMapping("/search_back_event")
    public JSONObject find_back_event(@RequestParam("Event_Id")String id) {
        List<EventBean> eventBeans = eventService.QueryBackOrderEvent(id);
        JSONObject result = new JSONObject();
        if (eventBeans.size() == 0) {
            result.put("code", 400);
            result.put("msg", "search error!");
        } else {
            result.put("code", 200);
            result.put("msg", "search successful");
            result.put("data", eventBeans);
        }
        return result;
    }

    @GetMapping("/search_whole_chain")
    public JSONObject find_whole_chain(@RequestParam("Event_Id")String id) {
        List<EventBean> events = eventService.QueryByEventId(id);
        JSONObject result = new JSONObject();
        if (events.size() == 0){
            result.put("code", 400);
            result.put("msg", "search error!");
            return result;
        }
        EventBean event = events.get(0);
        List<EventBean> eventBeans = eventService.QueryWholeChain(String.valueOf(event.getChain_Id()));
        if (eventBeans.size() == 0) {
            result.put("code", 400);
            result.put("msg", "search error!");
        } else {
            result.put("code", 200);
            result.put("msg", "search successful");
            result.put("data", eventBeans);
        }
        return result;
    }

    @GetMapping("/search_generalized_chain")
    public JSONObject generalized_chain(@RequestParam("Event_Id")String id) {

        List<EventBean> events = eventService.QueryByEventId(id);
        List<List<EventBean>> eventChains = new ArrayList<>();
        int index = 1;
        List<EventBean> chain = eventService.QueryWholeChain(String.valueOf(index));

        JSONObject result = new JSONObject();

        while (chain.size() != 0){
            eventChains.add(chain);
            index ++;
            chain = eventService.QueryWholeChain(String.valueOf(index));
        }

        if (eventChains.size() == 0 || events.size() == 0) {
            result.put("code", 400);
            result.put("msg", "search error!");
        } else {
            result.put("code", 200);
            result.put("msg", "search successful");
            result.put("data", eventChains);
            result.put("chain_id", events.get(0).getChain_Id());
            result.put("pos_id", events.get(0).getOrdered_Pos());
        }
        return result;
    }
}
