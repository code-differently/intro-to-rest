package com.stayready.poll_application.domain;

<<<<<<< HEAD
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
public class Poll {
=======
import javax.persistence.*;
import java.util.Set;

@Entity
public class Poll<String, Set> {
>>>>>>> d7713af17b1ec37011acd3aac18c4df87cd1d097

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
<<<<<<< HEAD
    @NotEmpty
=======
>>>>>>> d7713af17b1ec37011acd3aac18c4df87cd1d097
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
<<<<<<< HEAD
    @Size(min=2, max = 6)
    private Set<Option> option;
=======
    private Set option;
>>>>>>> d7713af17b1ec37011acd3aac18c4df87cd1d097

    public Set getOption() {
        return option;
    }

    public void setOption(Set option) {
        this.option = option;
    }
}
