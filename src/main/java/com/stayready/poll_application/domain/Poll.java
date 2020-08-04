package com.stayready.poll_application.domain;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Poll {
    @Id
    @GeneratedValue
    @Column(name = "POLL_ID")
    private long id;
    @Column(name = "QUESTION")
    private String question;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "POLL_ID")
    @OrderBy
    private Set<Option> options;

    public Poll(){
        this.options = new HashSet<Option>();
    }

    public long getId() {
        return this.id;
    }
    public String getQuestion() {
        return this.question;
    }
    public Set<Option> getOptions() {
        return this.options;
    }
    public void setId(long id){
        this.id = id;
    }
    public void setQuestion(String question){
        this.question = question;
    }
    public void setOptions(Set<Option> options){
        this.options = options;
    }
}
