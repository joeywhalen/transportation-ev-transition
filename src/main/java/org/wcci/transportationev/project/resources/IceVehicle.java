package org.wcci.transportationev.project.resources;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class IceVehicle {
    @Id
    @GeneratedValue
    private Long id;
    private int mpg;
    private int range;
    private int msrp;
    private float yearlyMaintCost;
    private float zeroToSixty;
    private int topSpeed;

    @OneToOne(mappedBy = "model")
    private Model model;

    public IceVehicle(int mpg, int range, int msrp, float yearlyMaintCost,
                      float zeroToSixty, int topSpeed, Model model) {
        this.mpg = mpg;
        this.range = range;
        this.msrp = msrp;
        this.yearlyMaintCost = yearlyMaintCost;
        this.zeroToSixty = zeroToSixty;
        this.topSpeed = topSpeed;
        this.model = model;
    }

    public IceVehicle() {
    }

    public Long getId() {
        return id;
    }

    public int getMpg() {
        return mpg;
    }

    public int getRange() {
        return range;
    }

    public int getMsrp() {
        return msrp;
    }

    public float getYearlyMaintCost() {
        return yearlyMaintCost;
    }

    public float getZeroToSixty() {
        return zeroToSixty;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public Model getModel() {
        return model;
    }
}
