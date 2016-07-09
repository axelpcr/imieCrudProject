package com.imie.dao;

import com.imie.entities.Invoice;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

/**
 * Invoice Dao
 *
 * Created by axel on 14/06/16.
 */
public interface InvoiceDao extends CrudRepository<Invoice, Integer> {

    @Override
    Collection<Invoice> findAll();

    @Query("select max(id) from Invoice")
    Integer getMaxCode();


}

