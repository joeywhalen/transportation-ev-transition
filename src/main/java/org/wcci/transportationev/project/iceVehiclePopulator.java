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

        //2012 MAKES
        Make ford = new Make("Ford",twoTwelve);
        makeStorage.saveMake(ford);
        
        Make honda = new Make("Honda",twoTwelve);
        makeStorage.saveMake(honda);

        Make vw = new Make("Volkswagen",twoTwelve);
        makeStorage.saveMake(vw);

        Make kia = new Make("Kia",twoTwelve);
        makeStorage.saveMake(kia);

        Make mazda = new Make("Mazda",twoTwelve);
        makeStorage.saveMake(mazda);

        Make toyota = new Make("Toyota",twoTwelve);
        makeStorage.saveMake(toyota);

        Make mitsubishi = new Make("Mitsubishi",twoTwelve);
        makeStorage.saveMake(mitsubishi);

        // 2013 Makes
        Make dodge2013 = new Make("Dodge", twoThirteen);
        makeStorage.saveMake(dodge2013);

        Make mercedes2013 = new Make("Mercedes-Benz", twoThirteen);
        makeStorage.saveMake(mercedes2013);

        // 2014 Makes
        Make chevrolet2014 = new Make("Chevrolet", twoFourteen);
        makeStorage.saveMake(chevrolet2014);

        Make lexus2014 = new Make("Lexus", twoFourteen);
        makeStorage.saveMake(lexus2014);

        // 2015 Makes
        Make cadillac2015 = new Make("Cadillac", twoFifteen);
        makeStorage.saveMake(cadillac2015);

        Make jeep2015 = new Make("Jeep", twoFifteen);
        makeStorage.saveMake(jeep2015);

        // 2016 Makes
        Make acura2016 = new Make("Acura", twoSixteen);
        makeStorage.saveMake(acura2016);

        Make jaguar2016 = new Make("Jaguar", twoSixteen);
        makeStorage.saveMake(jaguar2016);

        Make lincoln2016 = new Make("Lincoln", twoSixteen);
        makeStorage.saveMake(lincoln2016);

        // 2017 Makes
        Make bmw2017 = new Make("BMW", twoSeventeen);
        makeStorage.saveMake(bmw2017);

        Make genesis2017 = new Make("Genesis", twoSeventeen);
        makeStorage.saveMake(genesis2017);

        Make mazda2017 = new Make("Mazda", twoSeventeen);
        makeStorage.saveMake(mazda2017);

        //2018 MAKES
        Make audi2018 = new Make("Audi", twoEighteen);
        makeStorage.saveMake(audi2018);

        Make ford2018 = new Make("Ford",twoEighteen);
        makeStorage.saveMake(ford2018);

        Make gmc2018 = new Make("GMC", twoEighteen);
        makeStorage.saveMake(gmc2018);

        // 2019 Makes
        Make hyundai2019 = new Make("Hyundai", twoNineteen);
        makeStorage.saveMake(hyundai2019);

        Make kia2019 = new Make("Kia", twoNineteen);
        makeStorage.saveMake(kia2019);

        // Acura Models
        Model mdx4wd = new Model("MDX 4WD", acura2016);
        modelStorage.saveModel(mdx4wd);

        // Audi Models
        Model a6 = new Model("A6", audi2018);
        modelStorage.saveModel(a6);

        // BMW Models
        Model five30i = new Model("530i", bmw2017);
        modelStorage.saveModel(five30i);

        // Cadillac Models
        Model ctsSedanAwd = new Model("CTS Sedan AWD", cadillac2015);
        modelStorage.saveModel(ctsSedanAwd);

        // Chevrolet Models
        Model camaro = new Model("Camaro", chevrolet2014);
        modelStorage.saveModel(camaro);

        // Dodge Models
        Model challenger = new Model("Challenger", dodge2013);
        modelStorage.saveModel(challenger);

        //Ford Models
        Model f150 = new Model("F-150",ford);
        Model mustang = new Model("Mustang",ford);
        Model explorer = new Model("Explorer",ford);
        Model fiesta = new Model("Fiesta",ford);
        Model taurus = new Model("Taurus",ford);
        Model fusion = new Model("Fusion",ford2018);
        Model focus = new Model("Focus", ford2018);
        Model escape = new Model("Escape", ford2018);

        modelStorage.saveModel(f150);
        modelStorage.saveModel(mustang);
        modelStorage.saveModel(explorer);
        modelStorage.saveModel(fiesta);
        modelStorage.saveModel(taurus);
        modelStorage.saveModel(fusion);
        modelStorage.saveModel(focus);
        modelStorage.saveModel(escape);

        // Genesis Models
        Model g80Awd = new Model("G80 AWD", genesis2017);
        modelStorage.saveModel(g80Awd);

        // GMC Models
        Model terrainAwd = new Model("Terrain AWD", gmc2018);
        modelStorage.saveModel(terrainAwd);

        //Honda Models
        Model civic = new Model("Civic",honda);
        Model accord = new Model("Accord",honda);
        modelStorage.saveModel(civic);
        modelStorage.saveModel(accord);

        // Hyundai Models
        Model konaAwd = new Model("Kona AWD", hyundai2019);
        modelStorage.saveModel(konaAwd);

        // Jaguar Models
        Model fTypeCoupe = new Model("F-Type Coupe", jaguar2016);
        modelStorage.saveModel(fTypeCoupe);

        // Jeep Models
        Model wrangler4Wd = new Model("Wrangler 4WD", jeep2015);
        modelStorage.saveModel(wrangler4Wd);

        // Kia Models
        Model niro = new Model("Niro", kia2019);
        modelStorage.saveModel(niro);

        // Lexus Models
        Model rx350Awd = new Model("RX350 AWD", lexus2014);
        modelStorage.saveModel(rx350Awd);

        // Lincoln Models
        Model mksAwd = new Model("MKS AWD", lincoln2016);
        modelStorage.saveModel(mksAwd);

        // Mazda Models
        Model cx54Wd = new Model("CX-5 4WD", mazda2017);
        modelStorage.saveModel(cx54Wd);

        // Mercedes-Benz Models
        Model cls550 = new Model("CLS550", mercedes2013);
        modelStorage.saveModel(cls550);

        IceVehicle userVehicle = new IceVehicle(24,350,24000,1800,
                7f,120, twoTwelve,ford,f150,"https://images.hgmsites.net/hug/2012-ford-f-150-2wd-supercab-163-xl-side-exterior-view_100373810_h.jpg");
        iceVehicleStorage.saveIceVehicle(userVehicle);

        IceVehicle fordMustang2012 = new IceVehicle(25,325,16000,1500,
                6.5f,160, twoTwelve,ford,mustang,"https://s.aolcdn.com/commerce/autodata/images/CAC20FOC051B0101.jpg");
        iceVehicleStorage.saveIceVehicle(fordMustang2012);

        IceVehicle fordExplorer2012 = new IceVehicle(24,275,12000,1500,
                8.5f,140, twoTwelve,ford,explorer,"https://file.kelleybluebookimages.com/kbb/base/evox/CP/7597/2012-Ford-Explorer-front_7597_032_1812x872_HT_cropped.png");
        iceVehicleStorage.saveIceVehicle(fordExplorer2012);

        IceVehicle fordFiesta2012 = new IceVehicle(35,375,7000,1200,
                8f,140, twoTwelve,ford,fiesta,"https://file.kelleybluebookimages.com/kbb/base/evox/CP/7657/2012-Ford-Fiesta-front_7657_032_1753x812_SQ_cropped.png");
        iceVehicleStorage.saveIceVehicle(fordFiesta2012);

        IceVehicle fordTaurus2012 = new IceVehicle(30,375,12000,1250,
                7f,135, twoTwelve,ford,taurus,"https://file.kelleybluebookimages.com/kbb/base/evox/CP/7677/2012-Ford-Taurus-front_7677_032_1785x739_HT_cropped.png");
        iceVehicleStorage.saveIceVehicle(fordTaurus2012);

        IceVehicle fordFusion2018 = new IceVehicle(28,375,20000,1250,
                6.5f,150, twoEighteen,ford2018,fusion,"https://file.kelleybluebookimages.com/kbb/base/evox/CP/12239/2018-Ford-Fusion-front_12239_032_1795x753_G1_cropped.png");
        iceVehicleStorage.saveIceVehicle(fordFusion2018);

        IceVehicle fordFocus2018 = new IceVehicle(31,375,25000,1250,
                7.5f,120, twoEighteen,ford2018,focus,"https://file.kelleybluebookimages.com/kbb/base/evox/CP/12239/2018-Ford-Fusion-front_12239_032_1795x753_G1_cropped.png");
        iceVehicleStorage.saveIceVehicle(fordFocus2018);
    }


}
