package com.imie.webservices;

import com.imie.entities.Product;
import com.imie.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by axel on 14/06/16.
 */
@RestController
public class ProductWebService {

    @Autowired
    private ProductService productService;


    @RequestMapping(path = "products", method = RequestMethod.POST)
    public ResponseEntity<Product> setProduct(Product product)
    {
        return new ResponseEntity<Product>(productService.insert(product), HttpStatus.OK);
    }
}
