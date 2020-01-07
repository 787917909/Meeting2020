package com.example.meeting2020.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Meeting1 {
    private Integer meetingid;
    private String publisherid;
    private String publisher;
    private String theme;
    private String place;
    private Integer signinnumber;
    private String introduce;

    public Integer getMeetingid() {
        return meetingid;
    }

    public void setMeetingid(Integer meetingid) {
        this.meetingid = meetingid;
    }

    public String getPublisherid() {
        return publisherid;
    }

    public void setPublisherid(String publisherid) {
        this.publisherid = publisherid;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Integer getSigninnumber() {
        return signinnumber;
    }

    public void setSigninnumber(Integer signinnumber) {
        this.signinnumber = signinnumber;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

}
