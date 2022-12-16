package com.example.generalized_new.bean;

public class EventBean {
    private int id;
    private int Event_Id;
    private int Ordered_Pos, Chain_Id, Event_Type_Id;
    String Title, Article, Abstract, Event_Date;
    public EventBean(){}

    public EventBean(int event_Id, int ordered_Pos, int chainId, int event_Type_Id, String title, String article, String anAbstract, String event_Date) {
        Event_Id = event_Id;
        Ordered_Pos = ordered_Pos;
        Chain_Id = chainId;
        Event_Type_Id = event_Type_Id;
        Title = title;
        Article = article;
        Abstract = anAbstract;
        Event_Date = event_Date;
    }

    public String getEvent_Date() {
        return Event_Date;
    }

    public void setEvent_Date(String event_Date) {
        Event_Date = event_Date;
    }

    public int getEvent_Id() {
        return Event_Id;
    }

    public void setEvent_Id(int event_Id) {
        Event_Id = event_Id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrdered_Pos() {
        return Ordered_Pos;
    }

    public void setOrdered_Pos(int ordered_Pos) {
        Ordered_Pos = ordered_Pos;
    }
    public int getChain_Id() {
        return Chain_Id;
    }

    public void setChain_Id(int chainId) {
        Chain_Id = chainId;
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

    public String getArticle() {
        return Article;
    }

    public void setArticle(String article) {
        Article = article;
    }

    public String getAbstract() {
        return Abstract;
    }

    public void setAbstract(String anAbstract) {
        Abstract = anAbstract;
    }
}
