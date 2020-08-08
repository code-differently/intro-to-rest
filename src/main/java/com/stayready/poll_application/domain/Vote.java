package com.stayready.poll_application.domain;

import javax.persistence.*;

@Entity
<<<<<<< HEAD
public class Vote {
=======
public class Vote<Option> {
>>>>>>> d7713af17b1ec37011acd3aac18c4df87cd1d097

    @Id
    @GeneratedValue
    @Column(name = "VOTE_ID")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "OPTION_ID")
    private Option option;

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
    }
}
