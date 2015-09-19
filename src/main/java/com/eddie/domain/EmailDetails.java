package com.eddie.domain;

import java.util.Date;

public class EmailDetails {

    private String subject;
    private String from;
    private String to;
    private Date sentOn;

    private String url;


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Date getSentOn() {
        return sentOn;
    }

    public void setSentOn(Date sentOn) {
        this.sentOn = sentOn;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "EmailDetails{" +
                "subject='" + subject + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", sentOn=" + sentOn +
                ", url='" + url + '\'' +
                '}';
    }
}
