package org.wcci.transportationev.project.resources;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ElectricVehicle {

    @Id
    @GeneratedValue
    private Long id;
    private String makeName;
    private String modelName;
    private float msrp;
    private boolean taxCredit;
    private int range;
    private int mpgE;
    private int zeroToSixty;
    private int topSpeed;
    private String wheelDrive;
    private int homeCharge;
    private int travelCharge;
    private int seating;
    private boolean autonomous;
    private boolean driverAssist;
    private boolean freeOtaUpdate;
    private int rearCargoSpace;
    private int frunkSpace;
    private int safetyRating;
    private boolean phoneKey;
    private String imageUrl;

    public ElectricVehicle(String makeName, String modelName, float msrp, boolean taxCredit,
                           int range, int mpgE, int zeroToSixty, int topSpeed, String wheelDrive,
                           int homeCharge, int travelCharge, int seating, boolean autonomous,
                           boolean driverAssist, boolean freeOtaUpdate, int rearCargoSpace,
                           int frunkSpace, int safetyRating, boolean phoneKey, String imageUrl) {
        this.makeName = makeName;
        this.modelName = modelName;
        this.msrp = msrp;
        this.taxCredit = taxCredit;
        this.range = range;
        this.mpgE = mpgE;
        this.zeroToSixty = zeroToSixty;
        this.topSpeed = topSpeed;
        this.wheelDrive = wheelDrive;
        this.homeCharge = homeCharge;
        this.travelCharge = travelCharge;
        this.seating = seating;
        this.autonomous = autonomous;
        this.driverAssist = driverAssist;
        this.freeOtaUpdate = freeOtaUpdate;
        this.rearCargoSpace = rearCargoSpace;
        this.frunkSpace = frunkSpace;
        this.safetyRating = safetyRating;
        this.phoneKey = phoneKey;
        this.imageUrl = imageUrl;
    }
}
