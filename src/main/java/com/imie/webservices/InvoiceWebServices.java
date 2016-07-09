package com.imie.webservices;

import com.imie.entities.Invoice;
import com.imie.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by axel on 14/06/16.
 */
@RestController
public class InvoiceWebServices {

    @Autowired
    private InvoiceService invoiceService;

    @RequestMapping(path = "invoices/{id}", method = RequestMethod.GET)
    public ResponseEntity<Invoice> getInvoice(@PathVariable Integer id)
    {
        return new ResponseEntity<Invoice>(invoiceService.select(id), HttpStatus.OK);
    }

    @RequestMapping(path = "invoices", method = RequestMethod.POST)
    public ResponseEntity<Invoice> setInvoice(Invoice invoice)
    {
        return new ResponseEntity<Invoice>(invoiceService.insert(invoice), HttpStatus.OK);
    }

    @RequestMapping(path = "invoices/{id}", method = RequestMethod.DELETE)
    public void delInvoice(@PathVariable Integer id)
    {
        invoiceService.delete(id);
    }

    @RequestMapping(path = "invoices", method = RequestMethod.GET)
    public ResponseEntity<Collection<Invoice>> getDeliveries()
    {
        return new ResponseEntity<Collection<Invoice>>(invoiceService.selectAll(), HttpStatus.OK);
    }

    public InvoiceService getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }
}
