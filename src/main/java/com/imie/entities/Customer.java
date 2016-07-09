package com.imie.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Customer entity
 *
 * Created by axel on 14/06/16.
 */
@Entity
@Table(name = "customer")
public class Customer extends AbsEntity {

    private String firstname;
    private String lastname;
    private String address;
    private String postal;
    private String city;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
