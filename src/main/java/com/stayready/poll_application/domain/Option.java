package com.stayready.poll_application.domain;

import javax.persistence.*;
/* @Entity and @Id allows instances of the Option class to be easily
persisted and retrieved using JPA technology.
JPA- Javax Persistence Api
*/

@Entity //JPA annotations
public class Option {
  @Id
  @GeneratedValue
  @Column(name="OPTION_ID")
  private Long id; //hold the idenity

  @Column(name="OPTION_VALUE")
  private String value; //

  public Long getId(){
    return this.id;
  }

  public void setId(Long num){
    this.id = num;
  }

  public String getValue(){
    return this.value;
  }

  public void setValue(String value){
    this.value = value;
  }

  
}