package com.imie.dao;

import com.imie.entities.OrderDetail;
import com.imie.entities.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

/**
 * OrderDetail Dao
 *
 * Created by axel on 14/06/16.
 */
public interface OrderDetailDao extends CrudRepository<OrderDetail, Integer> {

    @Override
    Collection<OrderDetail> findAll();
}
