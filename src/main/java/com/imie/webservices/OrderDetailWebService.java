package com.imie.webservices;

import com.imie.entities.OrderDetail;
import com.imie.services.OrderDetailService;
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
public class OrderDetailWebService {

    @Autowired
    private OrderDetailService orderDetailService;

    @RequestMapping(path = "orderDetails/{id}", method = RequestMethod.GET)
    public ResponseEntity<OrderDetail> getOrder(@PathVariable Integer id)
    {
        return new ResponseEntity<OrderDetail>(orderDetailService.select(id), HttpStatus.OK);
    }

    @RequestMapping(path = "orderDetails", method = RequestMethod.POST)
    public ResponseEntity<OrderDetail> setOrder(OrderDetail orderDetail)
    {
        return new ResponseEntity<OrderDetail>(orderDetailService.insert(orderDetail), HttpStatus.OK);
    }

    @RequestMapping(path = "orderDetails/{id}", method = RequestMethod.DELETE)
    public void delOrder(@PathVariable Integer id)
    {
        orderDetailService.delete(id);
    }

    @RequestMapping(path = "orderDetails", method = RequestMethod.GET)
    public ResponseEntity<Collection<OrderDetail>> getOrders()
    {
        return new ResponseEntity<Collection<OrderDetail>>(orderDetailService.selectAll(), HttpStatus.OK);
    }
}
