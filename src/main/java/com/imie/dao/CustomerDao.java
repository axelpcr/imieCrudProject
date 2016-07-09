package com.imie.dao;

import com.imie.entities.Customer;
import com.imie.entities.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

/**
 * Customer Dao
 *
 * Created by axel on 14/06/16.
 */
public interface CustomerDao extends CrudRepository<Customer, Integer> {

    @Override
    Collection<Customer> findAll();
}
