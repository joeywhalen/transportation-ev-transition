package org.wcci.transportationev.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wcci.transportationev.project.resources.Make;
import org.wcci.transportationev.project.resources.Model;
import org.wcci.transportationev.project.resources.Year;
import org.wcci.transportationev.project.storage.MakeStorage;
import org.wcci.transportationev.project.storage.ModelStorage;
import org.wcci.transportationev.project.storage.YearStorage;

@Component
public class iceVehiclePopulator implements CommandLineRunner {

    private MakeStorage makeStorage;
    private ModelStorage modelStorage;
    private YearStorage yearStorage;

    public iceVehiclePopulator(MakeStorage makeStorage, ModelStorage modelStorage, YearStorage yearStorage) {
        this.makeStorage = makeStorage;
        this.modelStorage = modelStorage;
        this.yearStorage = yearStorage;
    }

    @Override
    public void run(String... args) throws Exception {

        Year twoTwelve = new Year(2012);
        yearStorage.saveYear(twoTwelve);

        //FORD MAKE
        Make ford = new Make("Ford",twoTwelve);
        makeStorage.saveMake(ford);
        //HONDA MAKE
        Make honda = new Make("Honda",twoTwelve);
        makeStorage.saveMake(honda);

        //Ford Models
        Model f150 = new Model("F-150",ford);
        Model mustang = new Model("Mustang",ford);
        modelStorage.saveModel(f150);
        modelStorage.saveModel(mustang);
        //Honda Models
        Model civic = new Model("Civic",honda);
        Model accord = new Model("Accord",honda);
        modelStorage.saveModel(civic);
        modelStorage.saveModel(accord);




    }


}
