package com.stayready.poll_application.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Option {

    @Id
    @GeneratedValue
    @Column(name = "OPTION_ID")
    private Long id;

    @Column(name = "OPTION_VALUE")
    private String value;

    public Long getId() {
        return id;
    }

    public void setId(Long newID) {
        id = newID;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String newValue) {
        value = newValue;
    }
}
