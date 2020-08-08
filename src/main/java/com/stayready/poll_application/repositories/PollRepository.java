package com.stayready.poll_application.repositories;

import com.stayready.poll_application.Domain.Poll;

public interface PollRepository extends PagingAndSortingRepository<Poll, Long> {
    
}