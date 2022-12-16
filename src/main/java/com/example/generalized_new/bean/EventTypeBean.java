package com.example.generalized_new.bean;

public class EventTypeBean {
    int id, Event_Type_Id;
    String Title, Description;

    public EventTypeBean(){}
    public EventTypeBean(int Event_type_Id, String Title, String Description){
        this.Event_Type_Id = Event_type_Id;
        this.Title = Title;
        this.Description = Description;
    }

    public int getEvent_Type_Id() {
        return Event_Type_Id;
    }

    public void setEvent_Type_Id(int event_Type_Id) {
        Event_Type_Id = event_Type_Id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
