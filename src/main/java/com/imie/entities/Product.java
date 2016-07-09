package com.imie.entities;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.imie.serializer.CustomLocalDateTimeDeserializer;
import com.imie.serializer.CustomLocalDateTimeSerializer;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

import javax.persistence.*;
import java.util.Date;

/**
 * Product entity
 *
 * Created by axel on 14/06/16.
 */
@Entity
@Table(name = "product")
public class Product extends AbsEntity {

    private String description;
    @Column(name = "date_created")
    @JsonSerialize(using = CustomLocalDateTimeSerializer.class)
    @JsonDeserialize(using = CustomLocalDateTimeDeserializer.class)
    private LocalDateTime dateCreated;
    private Float price;
    private Integer stock;

    @PrePersist
    protected void onCreate() {
        dateCreated = new LocalDateTime().now();
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
