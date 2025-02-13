package com.example.bookmanagementapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Publisher {

    @Id
    private Long publisherId;
    private String publisherName;
    private String publisherAddress;
    private String publisherContact;

    public Publisher(Long publisherId, String publisherName, String publisherAddress, String publisherContact) {
        this.publisherId = publisherId;
        this.publisherName = publisherName;
        this.publisherAddress = publisherAddress;
        this.publisherContact = publisherContact;
    }

    public Publisher() {

    }

    public Long getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Long publisherId) {
        this.publisherId = publisherId;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPublisherAddress() {
        return publisherAddress;
    }

    public void setPublisherAddress(String publisherAddress) {
        this.publisherAddress = publisherAddress;
    }

    public String getPublisherContact() {
        return publisherContact;
    }

    public void setPublisherContact(String publisherContact) {
        this.publisherContact = publisherContact;
    }
}
