package com.imie.entities;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.imie.serializer.CustomLocalDateTimeDeserializer;
import com.imie.serializer.CustomLocalDateTimeSerializer;
import com.imie.tools.ReferenceGeneration;
import org.joda.time.LocalDateTime;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by axel on 14/06/16.
 */
@Entity
@Table(name = "delivery")
public class Delivery extends AbsEntity {

    private String reference;
    @Column(name = "date_created")
    @JsonSerialize(using = CustomLocalDateTimeSerializer.class)
    @JsonDeserialize(using = CustomLocalDateTimeDeserializer.class)
    private LocalDateTime dateCreated;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Collection<Invoice> invoices;

    @PrePersist
    protected void onCreate() {
        reference = ReferenceGeneration.generateReference("DEL2016");
        dateCreated = new LocalDateTime();
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

    public Collection<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(Collection<Invoice> invoices) {
        this.invoices = invoices;
    }
}
