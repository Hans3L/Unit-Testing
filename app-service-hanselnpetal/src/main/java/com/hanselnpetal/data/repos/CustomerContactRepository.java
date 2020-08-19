package com.hanselnpetal.data.repos;

import org.springframework.data.repository.CrudRepository;

import com.hanselnpetal.domain.CustomerContact;
import org.springframework.stereotype.Repository;

@Repository("customerContactRepository")
public interface CustomerContactRepository extends CrudRepository<CustomerContact, Long> {

}
