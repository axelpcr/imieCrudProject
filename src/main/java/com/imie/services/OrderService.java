package com.imie.services;

import com.imie.dao.OrderDao;
import com.imie.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by axel on 14/06/16.
 */
@Service
public class OrderService {

    @Autowired
    private OrderDao orderDao;

    public Order insert(Order order){
        return orderDao.save(order);
    }

    public Order select(Integer id){
        return orderDao.findOne(id);
    }
    public void delete(Integer id) {
        orderDao.delete(id);
    }
}
