package org.wcci.transportationev.project.resources;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Entity
public class Year {
    @Id
    @GeneratedValue
    private Long id;
    private int year;

    @ManyToMany(mappedBy = "years")
    private Collection<Make> makes;

    public Year(int year) {
        this.year = year;
    }

    protected Year() {
    }

    public Long getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public Collection<Make> getMakes() {
        return makes;
    }
}
