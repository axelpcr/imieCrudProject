package com.imie.webservices;

import com.imie.entities.Customer;
import com.imie.services.CustomerService;
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
public class CustomerWebServices {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(path = "customers/{id}", method = RequestMethod.GET)
    public ResponseEntity<Customer> getCustomer(@PathVariable Integer id)
    {
        return new ResponseEntity<Customer>(customerService.select(id), HttpStatus.OK);
    }

    @RequestMapping(path = "customers", method = RequestMethod.POST)
    public ResponseEntity<Customer> setCustomer(Customer customer)
    {
        return new ResponseEntity<Customer>(customerService.insert(customer), HttpStatus.OK);
    }

    @RequestMapping(path = "customers/{id}", method = RequestMethod.DELETE)
    public void delCustomer(@PathVariable Integer id)
    {
        customerService.delete(id);
    }

    @RequestMapping(path = "customers", method = RequestMethod.GET)
    public ResponseEntity<Collection<Customer>> getCustomers()
    {
        return new ResponseEntity<Collection<Customer>>(customerService.selectAll(), HttpStatus.OK);
    }

    public CustomerService getCustomerService() {
        return customerService;
    }

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }
}
