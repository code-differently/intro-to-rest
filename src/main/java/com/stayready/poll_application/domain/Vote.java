/*package com.stayready.poll_application.domain;

import javax.persistence.*;

@Entity
public class Vote {

    @Id
    @GeneratedValue
    @Column(name = "VOTE_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "OPTION_ID")
    private Option option;

    public Long getId() {
        return id;
    }

    public void setId(Long newID) {
        id = newID;
    }

    public Option getOption() {
        return option;
    }

    public void setOption(Option newOpt) {
        option = newOpt;
    }
} */
