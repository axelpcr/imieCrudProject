package com.imie.webservices;

import com.imie.entities.Order;
import com.imie.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by axel on 14/06/16.
 */
@RestController
public class OrderWebService {

    @Autowired
    private OrderService orderService;

    @RequestMapping(path = "orders", method = RequestMethod.POST)
    public ResponseEntity<Order> setOrder(Order order)
    {
        return new ResponseEntity<Order>(orderService.insert(order), HttpStatus.OK);
    }
}
