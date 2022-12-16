package com.example.generalized_new.bean;

public class ChainBean {
    private int id;
    private int Chain_Id;
    private int Event_Id;
    public ChainBean(){}
    public ChainBean(int chainid, int Event_Id){
        this.Chain_Id = chainid;
        this.Event_Id = Event_Id;
    }

    public int getChain_Id() {
        return Chain_Id;
    }

    public void setChain_Id(int chain_Id) {
        this.Chain_Id = chain_Id;
    }

    public int getEvent_Id() {
        return Event_Id;
    }

    public void setEvent_Id(int event_Id) {
        this.Event_Id = event_Id;
    }
}
