package com.stayready.poll_application.repositories;

import org.apache.tomcat.jni.Poll;
import org.springframework.data.repository.CrudRepository;

public interface PollRepository extends CrudRepository<Poll, Long> {
    
}