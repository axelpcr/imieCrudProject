package com.imie.services;

import com.imie.dao.DeliveryDao;
import com.imie.entities.Delivery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Delivery service
 *
 * Created by axel on 14/06/16.
 */
@Service
public class DeliveryService {


    @Autowired
    private DeliveryDao deliveryDao;

    //-------------    CRUD    ------------------//


    public Delivery insert(Delivery delivery){
        return deliveryDao.save(delivery);
    }

    public Collection<Delivery> selectAll(){
        return deliveryDao.findAll();
    }

    public Delivery select(Integer id){
        return deliveryDao.findOne(id);
    }

    public void delete(Integer id) {
        deliveryDao.delete(id);
    }


    //------------ Getters and Setters ---------------//


    public DeliveryDao getDeliveryDao() {
        return deliveryDao;
    }

    public void setDeliveryDao(DeliveryDao deliveryDao) {
        this.deliveryDao = deliveryDao;
    }
}
