package com.stayready.poll_application.repositories;

import com.stayready.poll_application.Domain.Option;
import org.springframework.data.repository.CrudRepository;

public interface OptionRepository extends CrudRepository<Option, Long> {
    
}