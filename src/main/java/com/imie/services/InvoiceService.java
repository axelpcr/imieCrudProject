package com.imie.services;

import com.imie.dao.InvoiceDao;
import com.imie.entities.Invoice;
import com.imie.tools.ReferenceGeneration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Invoice Service
 * <p/>
 * Created by axel on 22/06/16.
 */
@Service
public class InvoiceService {

    @Autowired
    private InvoiceDao invoiceDao;

    //-------------    CRUD    ------------------//

    /**
     * Insert invoice with incremental reference.
     * @param invoice
     * @return
     */
    public Invoice insert(Invoice invoice) {
        Integer maxId = invoiceDao.getMaxCode();
        invoice.setReference(ReferenceGeneration.generateReference("INV") + maxId);
        return invoiceDao.save(invoice);
    }

    public Collection<Invoice> selectAll() {
        return invoiceDao.findAll();
    }

    public Invoice select(Integer id) {
        return invoiceDao.findOne(id);
    }

    public void delete(Integer id) {
        invoiceDao.delete(id);
    }


    //------------ Getters and Setters ---------------//


    public InvoiceDao getInvoiceDao() {
        return invoiceDao;
    }

    public void setInvoiceDao(InvoiceDao invoiceDao) {
        this.invoiceDao = invoiceDao;
    }
}
