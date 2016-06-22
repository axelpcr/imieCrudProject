package com.imie.services;

import com.imie.dao.ProductDao;
import com.imie.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by axel on 14/06/16.
 */
@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    public Product insert(Product product){
      return productDao.save(product);
    }

    public Collection<Product> selectAll(){
        return productDao.findAll();
    }

    public Product select(Integer id){
        return productDao.findOne(id);
    }

    public void delete(Integer id) {
        productDao.delete(id);
    }
}
