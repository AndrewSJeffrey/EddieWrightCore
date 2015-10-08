package com.eddie.domain;


import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "actions")
public class Action {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "createdBy")
    private User createdBy;


    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "assignedTo")
    private User assignedTo;


    private Date createdOn;
    private Date actionRequiredBy;
    private String type;
    private String reason;
    private String note;
    private String outcome;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "previousAction")
    private Action previousAction;


    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "nextAction")
    private Action nextAction;


    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "contact")
    private Contact contact;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public User getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(User assignedTo) {
        this.assignedTo = assignedTo;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getActionRequiredBy() {
        return actionRequiredBy;
    }

    public void setActionRequiredBy(Date actionRequiredBy) {
        this.actionRequiredBy = actionRequiredBy;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReason() {
        return reason;
    }

    @Override
    public String toString() {
        return "Action{" +
                "id=" + id +
                ", createdBy=" + createdBy +
                ", assignedTo=" + assignedTo +
                ", createdOn=" + createdOn +
                ", actionRequiredBy=" + actionRequiredBy +
                ", type='" + type + '\'' +
                ", reason='" + reason + '\'' +
                ", note='" + note + '\'' +
                ", outcome='" + outcome + '\'' +
                ", previousAction=" + previousAction +
                ", nextAction=" + nextAction +
                ", contact=" + contact +
                '}';
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public Action getPreviousAction() {
        return previousAction;
    }

    public void setPreviousAction(Action previousAction) {
        this.previousAction = previousAction;
    }

    public Action getNextAction() {
        return nextAction;
    }

    public void setNextAction(Action nextAction) {
        this.nextAction = nextAction;
    }

}
