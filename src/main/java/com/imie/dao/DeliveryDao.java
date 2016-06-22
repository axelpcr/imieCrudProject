package com.imie.dao;

import com.imie.entities.Delivery;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by axel on 14/06/16.
 */
public interface DeliveryDao extends CrudRepository<Delivery, Integer> {
}
