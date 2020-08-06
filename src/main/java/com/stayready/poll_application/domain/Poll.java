package com.stayready.poll_application.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Poll<String, Set> {

    @Id
    @GeneratedValue
    @Column(name = "POLL_ID")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "QUESTION")
    private String question;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "POLL_ID")
    @OrderBy
    private Set option;

    public Set getOption() {
        return option;
    }

    public void setOption(Set option) {
        this.option = option;
    }
}
