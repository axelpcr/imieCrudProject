package com.imie.dao;

import com.imie.entities.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by axel on 14/06/16.
 */
public interface CustomerDao extends CrudRepository<Customer, Integer> {
}
