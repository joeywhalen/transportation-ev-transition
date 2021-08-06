package org.wcci.transportationev.project.resources;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Year {
    @Id
    @GeneratedValue
    private Long id;
    private int year;

    @OneToMany(mappedBy = "year")
    private Collection<Make> makes;

    public Year(int year, Collection<Make> makes) {
        this.year = year;
        this.makes = makes;
    }

    public Year() {
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
