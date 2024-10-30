package com.chat.dao;

public class Message {
    private String name,talks;

    public String getTalks() {
        return talks;
    }

    public Message(String name,String talks) {
        this.name = name;
        this.talks=talks;
    }

    public void setTalks(String talks) {
        this.talks = talks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
