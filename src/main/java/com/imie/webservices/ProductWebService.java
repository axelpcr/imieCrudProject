package com.imie.webservices;

import com.imie.entities.Product;
import com.imie.entities.Product;
import com.imie.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.Collection;

/**
 * Created by axel on 14/06/16.
 */
@RestController
public class ProductWebService {

    @Autowired
    private ProductService productService;


    @RequestMapping(path = "products/{id}", method = RequestMethod.GET)
    public ResponseEntity<Product> getProduct(@PathVariable Product product)
    {
        return new ResponseEntity<Product>(productService.insert(product), HttpStatus.OK);
    }


    @RequestMapping(path = "products", method = RequestMethod.POST)
    public ResponseEntity<Product> setProduct(Product delivery)
    {
        return new ResponseEntity<Product>(productService.insert(delivery), HttpStatus.OK);
    }

    @RequestMapping(path = "products/{id}", method = RequestMethod.DELETE)
    public void delProduct(@PathVariable Integer id)
    {
        productService.delete(id);
    }

    @RequestMapping(path = "products", method = RequestMethod.GET)
    public ResponseEntity<Collection<Product>> getProducts()
    {
        return new ResponseEntity<Collection<Product>>(productService.selectAll(), HttpStatus.OK);
    }

    public ProductService getProductService() {
        return productService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }
}
