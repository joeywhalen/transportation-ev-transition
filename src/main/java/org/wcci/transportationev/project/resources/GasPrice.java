package org.wcci.transportationev.project.resources;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class GasPrice {
    @Id
    @GeneratedValue
    private Long id;
    private String state;
    private float pricePerGal;

    public GasPrice(String state, float pricePerGal) {
        this.state = state;
        this.pricePerGal = pricePerGal;
    }

    public GasPrice() {
    }

    public Long getId() {
        return id;
    }

    public String getState() {
        return state;
    }

    public float getPricePerGal() {
        return pricePerGal;
    }
}
