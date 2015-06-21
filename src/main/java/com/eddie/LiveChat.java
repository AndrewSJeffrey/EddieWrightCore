package com.eddie;

import java.util.Date;

/**
 * Created by andrewjeffrey on 17/06/15.
 */
public class LiveChat {

    private int id;
    private Date time;
    private String name;
    private String townCity;
    private String telephoneNumber;
    private String type;
    private String source;
    private Boolean appointment;
    private String comments;
    private String m;
    private String se;

    public int getId() {
        return id;
    }

    public LiveChat setId(int id) {
        this.id = id;
        return this;
    }

    public Date getTime() {
        return time;
    }

    public LiveChat setTime(Date time) {
        this.time = time;
        return this;
    }

    public String getName() {
        return name;
    }

    public LiveChat setName(String name) {
        this.name = name;
        return this;
    }

    public String getTownCity() {
        return townCity;
    }

    public LiveChat setTownCity(String townCity) {
        this.townCity = townCity;
        return this;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public LiveChat setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
        return this;
    }

    public String getType() {
        return type;
    }

    public LiveChat setType(String type) {
        this.type = type;
        return this;
    }

    public String getSource() {
        return source;
    }

    public LiveChat setSource(String source) {
        this.source = source;
        return this;
    }

    public Boolean getAppointment() {
        return appointment;
    }

    public LiveChat setAppointment(Boolean appointment) {
        this.appointment = appointment;
        return this;
    }

    public String getComments() {
        return comments;
    }

    public LiveChat setComments(String comments) {
        this.comments = comments;
        return this;
    }

    public String getM() {
        return m;
    }

    public LiveChat setM(String m) {
        this.m = m;
        return this;
    }

    public String getSe() {
        return se;
    }

    public LiveChat setSe(String se) {
        this.se = se;
        return this;
    }
}
