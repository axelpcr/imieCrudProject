package com.imie.dao;

/**
 * Created by axel on 22/06/16.
 */

import com.imie.entities.Invoice;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by axel on 14/06/16.
 */
public interface InvoiceDao extends CrudRepository<Invoice, Integer> {

    @Query("from Invoice where Invoice.id = (select max(id) from Invoice)")
    Integer findIdMax();
}

