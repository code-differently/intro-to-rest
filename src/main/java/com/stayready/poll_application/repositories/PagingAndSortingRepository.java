package com.stayready.poll_application.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;


import java.io.Serializable;

public interface PagingAndSortingRepository<T, ID extends Serializable>  extends CrudRepository<T, ID> {
    Page<T> findAll(Pageable pageable);
    Iterable<T> findAll(Sort sort);

}
