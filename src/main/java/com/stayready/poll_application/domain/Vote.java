package com.stayready.poll_application.domain;
import javax.persistence.*;

@Entity
public class Vote {
  
  @Id
  @GeneratedValue
  @Column(name="VOTE_ID")
  private Long id; 

  @ManyToOne // indicates that an Option instance can have zero or more Vote instances associated with it.
  @JoinColumn(name="OPTION_ID")
  private Option option;

  public Long getId(){
    return this.id;
  }

  public void setId(Long x){
    this.id = x;
  }

  public Option getOption(){
    return this.option;
  }

  public void setOption(Option o){
    this.option = o;
  }
}