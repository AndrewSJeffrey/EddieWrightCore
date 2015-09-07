package com.eddie.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "email_message")
public class EmailMessage {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String uid;
    private String subject;

    private String fromField;

    private String name;
    private String email;
    private String phoneNumber;
    private String details;

    private Date receivedDate;
    private Date parsedDate;
    private Date processedDate;
    private boolean processed;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "assignedContact")
    private Contact assignedContact;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFromField() {
        return fromField;
    }

    public void setFromField(String fromField) {
        this.fromField = fromField;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public boolean isProcessed() {
        return processed;
    }

    public void setProcessed(boolean processed) {
        this.processed = processed;
    }


    public Date getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    public Date getProcessedDate() {
        return processedDate;
    }

    public void setProcessedDate(Date processedDate) {
        this.processedDate = processedDate;
    }

    public Date getParsedDate() {
        return parsedDate;
    }

    public void setParsedDate(Date parsedDate) {
        this.parsedDate = parsedDate;
    }


    public Contact getAssignedContact() {
        return assignedContact;
    }

    public void setAssignedContact(Contact assignedContact) {
        this.assignedContact = assignedContact;
    }

    @Override
    public String toString() {
        return "EmailMessage{" +
                "id=" + id +
                ", uid='" + uid + '\'' +
                ", subject='" + subject + '\'' +
                ", fromField='" + fromField + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", details='" + details + '\'' +
                ", receivedDate=" + receivedDate +
                ", parsedDate=" + parsedDate +
                ", processedDate=" + processedDate +
                ", processed=" + processed +
                ", assignedContact=" + assignedContact +
                '}';
    }
}

