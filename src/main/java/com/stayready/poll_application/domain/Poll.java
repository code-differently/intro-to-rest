package com.stayready.poll_application.domain;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
public class Poll {

    @Id
    @GeneratedValue
    @Column(name = "POLL_ID")
    private Long id;

    @Column(name = "QUESTION")
    @NotEmpty
    private String question;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "POLL_ID")
    @OrderBy
    @Size(min=2, max = 6)
    private Set<Option> options;

    public Long getId() {
        return id;
    }

    public void setId(Long newID) {
        id = newID;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String newQ) {
        question = newQ;
    }

    public Set<Option> getOptions() {
        return options;
    }

    public void setOptions(Set<Option> newOpts) {
        options = newOpts;
    }
}
