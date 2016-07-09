package com.imie.webservices;

import com.imie.entities.Order;
import com.imie.entities.Order;
import com.imie.services.OrderService;
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
public class OrderWebService {

    @Autowired
    private OrderService orderService;

    @RequestMapping(path = "orders/{id}", method = RequestMethod.GET)
    public ResponseEntity<Order> getOrder(@PathVariable Integer id)
    {
        return new ResponseEntity<Order>(orderService.select(id), HttpStatus.OK);
    }

    @RequestMapping(path = "orders", method = RequestMethod.POST)
    public ResponseEntity<Order> setOrder(Order delivery)
    {
        return new ResponseEntity<Order>(orderService.insert(delivery), HttpStatus.OK);
    }

    @RequestMapping(path = "orders/{id}", method = RequestMethod.DELETE)
    public void delOrder(@PathVariable Integer id)
    {
        orderService.delete(id);
    }

    @RequestMapping(path = "orders", method = RequestMethod.GET)
    public ResponseEntity<Collection<Order>> getOrders()
    {
        return new ResponseEntity<Collection<Order>>(orderService.selectAll(), HttpStatus.OK);
    }

    public OrderService getOrderService() {
        return orderService;
    }

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }
}
