package com.imie.services;

import com.imie.dao.OrderDetailDao;
import com.imie.entities.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * OrderDetail Service
 *
 * Created by axel on 14/06/16.
 */
@Service
public class OrderDetailService {

    @Autowired
    private OrderDetailDao orderDetailDao;

    //-------------    CRUD    ------------------//


    public OrderDetail insert(OrderDetail orderDetail){
        return orderDetailDao.save(orderDetail);
    }

    public Collection<OrderDetail> selectAll(){
        return orderDetailDao.findAll();
    }

    public OrderDetail select(Integer id){
        return orderDetailDao.findOne(id);
    }

    public void delete(Integer id) {
        orderDetailDao.delete(id);
    }

    //------------ Getters and Setters ---------------//


    public OrderDetailDao getOrderDetailDao() {
        return orderDetailDao;
    }

    public void setOrderDetailDao(OrderDetailDao orderDetailDao) {
        this.orderDetailDao = orderDetailDao;
    }
}
