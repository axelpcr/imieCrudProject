package com.imie.services;

import com.imie.dao.CustomerDao;
import com.imie.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Custom service
 *
 * Created by axel on 14/06/16.
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;

    //-------------    CRUD    ------------------//

    public Customer insert(Customer customer){
        return customerDao.save(customer);
    }

    public Collection<Customer> selectAll(){
        return customerDao.findAll();
    }

    public Customer select(Integer id){
        return customerDao.findOne(id);
    }

    public void delete(Integer id) {
        customerDao.delete(id);
    }


    //------------ Getters and Setters ---------------//


    public CustomerDao getCustomerDao() {
        return customerDao;
    }

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }
}
