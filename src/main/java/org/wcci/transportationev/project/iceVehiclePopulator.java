package org.wcci.transportationev.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wcci.transportationev.project.resources.IceVehicle;
import org.wcci.transportationev.project.resources.Make;
import org.wcci.transportationev.project.resources.Model;
import org.wcci.transportationev.project.resources.Year;
import org.wcci.transportationev.project.storage.IceVehicleStorage;
import org.wcci.transportationev.project.storage.MakeStorage;
import org.wcci.transportationev.project.storage.ModelStorage;
import org.wcci.transportationev.project.storage.YearStorage;

@Component
public class iceVehiclePopulator implements CommandLineRunner {

    private MakeStorage makeStorage;
    private ModelStorage modelStorage;
    private YearStorage yearStorage;
    private IceVehicleStorage iceVehicleStorage;

    public iceVehiclePopulator(MakeStorage makeStorage, ModelStorage modelStorage,
                               YearStorage yearStorage, IceVehicleStorage iceVehicleStorage) {
        this.makeStorage = makeStorage;
        this.modelStorage = modelStorage;
        this.yearStorage = yearStorage;
        this.iceVehicleStorage = iceVehicleStorage;
    }

    @Override
    public void run(String... args) throws Exception {

        Year twoTen = new Year(2010);
        yearStorage.saveYear(twoTen);

        Year twoEleven = new Year(2011);
        yearStorage.saveYear(twoEleven);

        Year twoTwelve = new Year(2012);
        yearStorage.saveYear(twoTwelve);

        Year twoThirteen = new Year(2013);
        yearStorage.saveYear(twoThirteen);

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

        IceVehicle userVehicle = new IceVehicle(24,350,24000,1800,
                7f,120, twoTwelve,ford,f150,"https://images.hgmsites.net/hug/2012-ford-f-150-2wd-supercab-163-xl-side-exterior-view_100373810_h.jpg");
        iceVehicleStorage.saveIceVehicle(userVehicle);
    }


}
