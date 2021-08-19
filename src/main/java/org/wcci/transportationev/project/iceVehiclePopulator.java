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

        Year twoFive = new Year(2005);
        yearStorage.saveYear(twoFive);
        
        Year twoSix = new Year(2006);
        yearStorage.saveYear(twoSix);
        
        Year twoSeven = new Year(2007);
        yearStorage.saveYear(twoSeven);
        
        Year twoEight = new Year(2008);
        yearStorage.saveYear(twoEight);
        
        Year twoNine = new Year(2009);
        yearStorage.saveYear(twoNine);
        
        Year twoTen = new Year(2010);
        yearStorage.saveYear(twoTen);

        Year twoEleven = new Year(2011);
        yearStorage.saveYear(twoEleven);

        Year twoTwelve = new Year(2012);
        yearStorage.saveYear(twoTwelve);

        Year twoThirteen = new Year(2013);
        yearStorage.saveYear(twoThirteen);

        Year twoFourteen = new Year(2014);
        yearStorage.saveYear(twoFourteen);

        Year twoFifteen = new Year(2015);
        yearStorage.saveYear(twoFifteen);

        Year twoSixteen = new Year(2016);
        yearStorage.saveYear(twoSixteen);

        Year twoSeventeen = new Year(2017);
        yearStorage.saveYear(twoSeventeen);

        Year twoEighteen = new Year(2018);
        yearStorage.saveYear(twoEighteen);

        Year twoNineteen = new Year(2019);
        yearStorage.saveYear(twoNineteen);

        Year twoTwenty = new Year(2020);
        yearStorage.saveYear(twoTwenty);

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
