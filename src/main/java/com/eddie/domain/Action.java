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

   // @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
   // @JoinColumn(name = "createdBy")
    private Integer createdBy;


   // @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
   // @JoinColumn(name = "assignedTo")
    private Integer assignedTo;


    private Date createdOn;
    private Date actionRequiredBy;
    private String type;
    private String reason;
    private String note;
    private String outcome;

    private Integer previousAction;
    private Integer nextAction;

    private Integer contactId;

    @Transient
    private Integer messageId;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(Integer assignedTo) {
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

    public Integer getPreviousAction() {
        return previousAction;
    }

    public void setPreviousAction(Integer previousAction) {
        this.previousAction = previousAction;
    }

    public Integer getNextAction() {
        return nextAction;
    }

    public void setNextAction(Integer nextAction) {
        this.nextAction = nextAction;
    }

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
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
                ", contactId=" + contactId +
                ", messageId=" + messageId +
                '}';
    }
}
