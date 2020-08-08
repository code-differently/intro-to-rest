package com.stayready.poll_application.repositories;

import java.io.Serializable;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

public interface PagingAndSortingRepository<T, ID extends Serializable> extends CrudRepository<T, ID> {
    Page<T> findAll(Pageable pageable);    
    Iterable<T> findAll(Sort sort);

}