package com.example.meeting2020.gson;


public class Winners  {

    private int id;

    private int noteid;

    private String winjson;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNoteid() {
        return noteid;
    }

    public void setNoteid(int noteid) {
        this.noteid = noteid;
    }

    public String getWinjson() {
        return winjson;
    }

    public void setWinjson(String winjson) {
        this.winjson = winjson;
    }

    @Override
    public String toString() {
        return "Winners{" +
                "id=" + id +
                ", noteid=" + noteid +
                ", winjson='" + winjson + '\'' +
                '}';
    }
}
