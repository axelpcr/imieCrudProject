package com.imie.entities;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.imie.serializer.CustomLocalDateTimeDeserializer;
import com.imie.serializer.CustomLocalDateTimeSerializer;
import com.imie.tools.ReferenceGeneration;
import org.joda.time.LocalDateTime;

import javax.persistence.*;
/**
 * Order entity
 *
 * Created by axel on 14/06/16.
 */
@Entity
@Table(name = "orderr")
public class Order extends AbsEntity {

    private String reference;
    @Column(name = "date_created")
    @JsonSerialize(using = CustomLocalDateTimeSerializer.class)
    @JsonDeserialize(using = CustomLocalDateTimeDeserializer.class)
    private LocalDateTime dateCreated;



    @PrePersist
    protected void onCreate() {
        dateCreated = new LocalDateTime().now();
        reference = ReferenceGeneration.generateReference("ORD");
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }


}
