package com.imie.dao;

import com.imie.entities.Delivery;
import com.imie.entities.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

/**
 * Delivery Dao
 *
 * Created by axel on 14/06/16.
 */
public interface DeliveryDao extends CrudRepository<Delivery, Integer> {

    @Override
    Collection<Delivery> findAll();
}
