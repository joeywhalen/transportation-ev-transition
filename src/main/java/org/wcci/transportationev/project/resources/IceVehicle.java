package org.wcci.transportationev.project.resources;

import javax.persistence.*;

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

    @ManyToOne
    private Model model;
    @ManyToOne
    private Year year;
    @ManyToOne
    private Make make;


    public IceVehicle(int mpg, int range, int msrp, float yearlyMaintCost,
                      float zeroToSixty, int topSpeed, Year year, Make make, Model model) {
        this.mpg = mpg;
        this.range = range;
        this.msrp = msrp;
        this.yearlyMaintCost = yearlyMaintCost;
        this.zeroToSixty = zeroToSixty;
        this.topSpeed = topSpeed;
        this.year = year;
        this.make = make;
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