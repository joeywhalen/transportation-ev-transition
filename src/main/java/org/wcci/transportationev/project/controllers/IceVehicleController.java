package org.wcci.transportationev.project.controllers;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.wcci.transportationev.project.resources.IceVehicle;
import org.wcci.transportationev.project.resources.Make;
import org.wcci.transportationev.project.resources.Model;
import org.wcci.transportationev.project.resources.Year;
import org.wcci.transportationev.project.storage.IceVehicleStorage;
import org.wcci.transportationev.project.storage.MakeStorage;
import org.wcci.transportationev.project.storage.ModelStorage;
import org.wcci.transportationev.project.storage.YearStorage;

@RestController
public class IceVehicleController {
    private YearStorage yearStorage;
    private MakeStorage makeStorage;
    private ModelStorage modelStorage;
    private IceVehicleStorage iceVehicleStorage;

    public IceVehicleController(YearStorage yearStorage, MakeStorage makeStorage, ModelStorage modelStorage,
            IceVehicleStorage iceVehicleStorage) {
        this.yearStorage = yearStorage;
        this.makeStorage = makeStorage;
        this.modelStorage = modelStorage;
        this.iceVehicleStorage = iceVehicleStorage;
    }

    // GET http://localhost:8080/api/ice/years

    @GetMapping("/api/ice/years")
    public Iterable<Year> retrieveAllYears() {
        return yearStorage.retrieveAllYears();
    }

    // ### Get all makes of said year
    // GET http://localhost:8080/api/ice/years/2012
    @GetMapping("/api/ice/years/{year}")
    public Iterable<Make> retrieveAllMakesByYear(@PathVariable int year) {
        Year currentYear = yearStorage.retrieveMakesByYear(year);
        return currentYear.getMakes();
    }

    // ### Get all models of said make
    // GET http://localhost:8080/api/ice/years/2012/ford

    @GetMapping("/api/ice/years/{year}/{make}")
    public Iterable<Model> retrieveModelsByYearAndMake(@PathVariable int year, @PathVariable String make) {

        Year currentYear = yearStorage.retrieveMakesByYear(year);
        Collection<Make> currentMakes = currentYear.getMakes();

        Make makeToReturn = null;

        for (Make currentMake : currentMakes) {
            if (currentMake.getMakeName().toLowerCase().equals(make)) {
                makeToReturn = currentMake;
            }
        }

        Collection<Model> modelsToReturn = makeToReturn.getModels();

        return modelsToReturn;
    }

}
