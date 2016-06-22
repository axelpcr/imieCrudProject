package com.imie.entities;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by axel on 14/06/16.
 */
@Entity
@Table(name = "order_detail")
public class OrderDetail extends AbsEntity {

    private Float quantity;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Collection<Product> products;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Collection<Order> orders;

    public Float getQuantity() {
        return quantity;
    }

    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }

    public Collection<Product> getProducts() {
        return products;
    }

    public void setProducts(Collection<Product> products) {
        this.products = products;
    }

    public Collection<Order> getOrders() {
        return orders;
    }

    public void setOrders(Collection<Order> orders) {
        this.orders = orders;
    }
}
