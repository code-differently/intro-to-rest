package com.stayready.poll_application.domain;

import javax.persistence.*;

@Entity
public class Vote {
    @Id
    @GeneratedValue
    @Column(name = "VOTE_ID")
    private long id;
    @ManyToOne
    @JoinColumn(name = "OPTION_ID")
    private Option option;

    public long getId(){
        return this.id;
    }
    public Option getOption(){
        return this.option;
    }
    public void setId(long id){
        this.id = id;
    }
    public void setOption(Option option){
        this.option = option;
    }
}
