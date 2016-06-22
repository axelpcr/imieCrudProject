package com.imie.dao;

import com.imie.entities.OrderDetail;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by axel on 14/06/16.
 */
public interface OrderDetailDao extends CrudRepository<OrderDetail, Integer> {
}
