package com.imie.dao;

import com.imie.entities.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

/**
 * Created by axel on 14/06/16.
 */
public interface ProductDao extends CrudRepository<Product, Integer> {

    @Override
    Collection<Product> findAll();
}
