package com.imie.webservices;

import com.imie.entities.Delivery;
import com.imie.entities.Delivery;
import com.imie.services.DeliveryService;
import com.imie.services.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

/**
 * Created by axel on 14/06/16.
 */
@RestController
public class DeliveryWebServices {

    @Autowired
    private DeliveryService deliveryService;

    @RequestMapping(path = "deliveries/{id}", method = RequestMethod.GET)
    public ResponseEntity<Delivery> getDelivery(@PathVariable Integer id)
    {
        return new ResponseEntity<Delivery>(deliveryService.select(id), HttpStatus.OK);
    }

    @RequestMapping(path = "deliveries", method = RequestMethod.POST)
    public ResponseEntity<Delivery> setDelivery(Delivery delivery)
    {
        return new ResponseEntity<Delivery>(deliveryService.insert(delivery), HttpStatus.OK);
    }

    @RequestMapping(path = "deliveries/{id}", method = RequestMethod.DELETE)
    public void delDelivery(@PathVariable Integer id)
    {
        deliveryService.delete(id);
    }

    @RequestMapping(path = "deliveries", method = RequestMethod.GET)
    public ResponseEntity<Collection<Delivery>> getDeliveries()
    {
        return new ResponseEntity<Collection<Delivery>>(deliveryService.selectAll(), HttpStatus.OK);
    }

    public DeliveryService getDeliveryService() {
        return deliveryService;
    }

    public void setDeliveryService(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }
}
