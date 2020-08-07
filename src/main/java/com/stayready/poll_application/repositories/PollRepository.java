package com.stayready.poll_application.repositories;


import com.stayready.poll_application.domain.Poll;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PollRepository extends PagingAndSortingRepository<Poll, Long> {

}
