package com.imie.services;

import com.imie.dao.OrderDao;
import com.imie.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Order Service
 *
 *
 * Created by axel on 14/06/16.
 */
@Service
public class OrderService {

    @Autowired
    private OrderDao orderDao;

    //-------------    CRUD    ------------------//


    public Order insert(Order order) {
        return orderDao.save(order);
    }

    public Order select(Integer id) {
        return orderDao.findOne(id);
    }

    public void delete(Integer id) {
        orderDao.delete(id);
    }

    public Collection<Order> selectAll(){return orderDao.findAll();}


    //------------ Getters and Setters ---------------//


    public OrderDao getOrderDao() {
        return orderDao;
    }

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }


}
