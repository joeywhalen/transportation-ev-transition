package org.wcci.transportationev.project.resources;
import javax.persistence.*;

@Entity
public class Model {

    @Id
    @GeneratedValue
    private Long id;

    private String modelName;

    @ManyToOne
    private Make make;

    @OneToOne
    private IceVehicle iceVehicle;

    //CONSTRUCTOR
    public Model(String modelName, Make make) {
        this.modelName = modelName;
        this.make = make;
    }





    //NULL CONSTRUCTOR
    protected Model() {}

    //GETTERS
    public Long getId() {return id;}
    public String getModelName() {return modelName;}
    public Make getMake() {return make;}
}
