package com.imie.entities;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.imie.serializer.CustomLocalDateTimeDeserializer;
import com.imie.serializer.CustomLocalDateTimeSerializer;
import com.imie.tools.ReferenceGeneration;
import org.joda.time.LocalDateTime;

import javax.persistence.*;

/**
 * Created by axel on 14/06/16.
 */
@Entity
@Table(name = "invoice")
public class Invoice extends AbsEntity {

    private String reference;
    @Column(name = "date_created")
    @JsonSerialize(using = CustomLocalDateTimeSerializer.class)
    @JsonDeserialize(using = CustomLocalDateTimeDeserializer.class)
    private LocalDateTime dateCreated;
    private Float tva;

    @PrePersist
    protected void onCreate()
    {
        dateCreated = new LocalDateTime();
        reference = ReferenceGeneration.generateReference("INV2016");
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

    public Float getTva() {
        return tva;
    }

    public void setTva(Float tva) {
        this.tva = tva;
    }
}
