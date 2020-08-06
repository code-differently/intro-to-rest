package com.stayready.poll_application.domain;

import org.hibernate.validator.constraints.NotEmpty;

import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Size;

/* This class has a question field to store the poll question
*/

@Entity
public class Poll { 

  @Id
  @GeneratedValue
  @Column(name="POLL_ID")
  private Long id; 

  @Column(name="QUESTION")
  @NotEmpty
  private String question; 

  //indicates Poll instance can contain zero or more Option instances
  @OneToMany(cascade=CascadeType.ALL) //cascade=CascadeType.ALL indicates that any database operations such as persist, remove, or merge on a Poll instance needs to be propagated to all related Option instances. 
  @JoinColumn(name="POLL_ID")
  @OrderBy
  @Size(min=2, max=6)
  private Set<Option> options;

  public Long getId(){
    return this.id;
  }

  public void setId(Long x){
    this.id = x;
  }

  public String getQuestion(){
    return this.question;
  }
  
  public void setQuestion(String q){
    this.question = q;
  }

  public Set<Option> getOptions(){
    return this.options;
  }

  public void setOptions(Set<Option> o){
    this.options = o;
  }

  
  
}