package com.imie.dao;

import com.imie.entities.Order;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by axel on 14/06/16.
 */
public interface OrderDao extends CrudRepository<Order, Integer> {
}
