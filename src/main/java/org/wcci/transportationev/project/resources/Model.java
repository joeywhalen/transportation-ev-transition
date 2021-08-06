package org.wcci.transportationev.project.resources;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Model {

    @Id
    @GeneratedValue
    private Long id;

    private String modelName;

    @ManyToOne
    private Make make;

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
