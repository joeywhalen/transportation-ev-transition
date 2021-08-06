package org.wcci.transportationev.project.resources;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Set;

@Entity
public class Make {

    @Id
    @GeneratedValue
    private Long id;
    private String makeName;

    @OneToMany(mappedBy = "make")
    private Collection<Model> models;

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
