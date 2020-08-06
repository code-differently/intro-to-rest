package com.stayready.poll_application.repositories;

import org.springframework.data.repository.CrudRepository;
import com.stayready.poll_application.domain.*;

public interface PollRepository extends CrudRepository<Poll, Long>{
  
}