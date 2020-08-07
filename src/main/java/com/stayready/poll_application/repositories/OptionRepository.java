package com.stayready.poll_application.repositories;

import org.springframework.data.repository.CrudRepository;
import com.stayready.poll_application.domain.*;

/* the CrudRepository interface takes the type of domain object that it manipulates and the
type of domain object’s identifier field as its generic parameters T and ID.
*/
public interface OptionRepository extends CrudRepository<Option, Long>{
  
}