package org.wcci.transportationev.project.resources;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Make {

    @Id
    @GeneratedValue
    private Long id;
    private String makeName;

    @OneToMany(mappedBy = "make")
    private Collection<Model> models;

    @ManyToOne
    private Year year;

    //CONSTRUCTOR
    public Make(String makeName) {
        this.makeName = makeName;
    }




    //NULL CONSTRUCTOR
    protected Make() {
    }

    //GETTERS
    public Long getId() {
        return id;
    }

    public String getMakeName() {
        return makeName;
    }

    public Collection<Model> getModels() {
        return models;
    }

}
