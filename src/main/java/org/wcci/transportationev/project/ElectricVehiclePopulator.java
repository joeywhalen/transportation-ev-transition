package org.wcci.transportationev.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wcci.transportationev.project.resources.ElectricVehicle;
import org.wcci.transportationev.project.storage.ElectricVehicleStorage;

@Component
public class ElectricVehiclePopulator  implements CommandLineRunner {

    private ElectricVehicleStorage electricVehicleStorage;

    public ElectricVehiclePopulator(ElectricVehicleStorage electricVehicleStorage) {
        this.electricVehicleStorage = electricVehicleStorage;
    }

    @Override
    public void run(String... args) throws Exception {

        //Audi e-tron Sportback EV to test data
        ElectricVehicle audiETronSB = new ElectricVehicle("Audi", "e-tron Sportback", 69100.00, true,
                218, 77, 5.5, 118, "AWD", 10, 30, 5, false,
                true, false, 27.2, 3, 4.5, false,
                "https://www.motortrend.com/uploads/sites/5/2019/11/2020-Audi-E-Tron-Sportback-11.jpg?fit=around%7C875:492");
        electricVehicleStorage.saveElectricVehicle(audiETronSB);

        ElectricVehicle chevyBolt = new ElectricVehicle("Chevrolet", "Bolt", 37500.00, false,
                247, 120, 7.0, 93, "FWD", 7.5, 60, 5, true,
                true, false, 16.6, 0, 5.0, false,
                "https://media.chevrolet.com/dld/content/dam/Media/images/US/Vehicles/Concepts/Chevrolet/BoltEV/Product/2015-Chevrolet-BoltEV-Concept-exterior-001.jpg");
        electricVehicleStorage.saveElectricVehicle(chevyBolt);

        ElectricVehicle fordMustang = new ElectricVehicle("Ford", "Mustang Mach-E Select (eAWD)", 42895.00, true,
                211, 90, 5.2, 130, "e-AWD", 14, 52, 5, false,
                true, true, 29.7, 4.7, 5.0, true,
                "https://www.ford.com/ntzlibs/content/dam/bev/us/november-2020-updates/21_FRD_MCH_50700_GTP.jpg.renditions.original.png");
        electricVehicleStorage.saveElectricVehicle(fordMustang);

        ElectricVehicle hyundaiIoniq = new ElectricVehicle("Hyundai", "Ioniq", 33245.00, true,
                170, 133, 10, 102, "FWD", 5.8, 60, 5, false,
                true, false, 23, 0, 4.0, false,
                "https://ev-database.org/img/auto/Hyundai_IONIQ_Electric_2020/Hyundai_IONIQ_Electric_2020-01.jpg");
        electricVehicleStorage.saveElectricVehicle(hyundaiIoniq);

        ElectricVehicle hyundaiKona = new ElectricVehicle("Hyundai", "Kona", 37900.00, true,
                258, 120, 6.4, 96, "FWD", 9, 54, 5, false,
                true, false, 19.2, 0, 5.0, false,
                "https://cdn.jdpower.com/JDPA_2020%20Hyundai%20Kona%20Ultimate%20White%20Front%20View.jpg");
        electricVehicleStorage.saveElectricVehicle(hyundaiKona);

        ElectricVehicle jaguarIpace = new ElectricVehicle("Jaguar", "I-Pace", 69900.00, true,
                234, 76, 4.5, 124, "AWD", 10.2, 90, 5, false,
                true, true, 23.2, 1.0, 5.0, false,
                "https://electrek.co/wp-content/uploads/sites/3/2019/01/Jaguar-I-Pace-hero-e1547961480245.jpg?quality=82&strip=all");
        electricVehicleStorage.saveElectricVehicle(jaguarIpace);

        ElectricVehicle kiaNiro = new ElectricVehicle("Kia", "Niro", 39090.00, true,
                239, 112, 6.5, 103, "FWD", 9.5, 60, 5, false,
                true, false, 18.5, 0, 5.0, false,
                "https://www.kia.com/us/en/vehicles/niro-plug-in-hybrid/2021/_jcr_content/root/responsivegrid/mediatext.coreimg.100.1400.jpeg/1616531623780.jpeg");
        electricVehicleStorage.saveElectricVehicle(kiaNiro);

        ElectricVehicle lucidAir = new ElectricVehicle("Lucid", "Air Touring", 87500.00, true,
                406, 100, 3.2, 168, "AWD", 6, 20, 5, false,
                true, true, 26.1, 9.9, 4.5, true,
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/lucid-air-103-1599688020.jpg?crop=0.652xw:0.733xh;0.104xw,0.0769xh&resize=640:*");
        electricVehicleStorage.saveElectricVehicle(lucidAir);

        ElectricVehicle miniCooperSE = new ElectricVehicle("Mini Cooper", "SE", 29900.00, true,
                114, 108, 6.9, 93, "FWD", 4, 36, 4, false,
                true, false, 8.7, 0, 4.0, false,
                "https://cdn.motor1.com/images/mgl/0lp6V/s1/mini-cooper-se-2020-im-test.jpg");
        electricVehicleStorage.saveElectricVehicle(miniCooperSE);

        ElectricVehicle nissanLeaf = new ElectricVehicle("Nissan", "Leaf S Plus", 37400.00, true,
                226, 114, 7.4, 90, "FWD", 11, 60, 5, false,
                true, false, 23.6, 0, 5.0, false,
                "https://inv.assets.sincrod.com/ChromeColorMatch/us/TRANSPARENT_cc_2021NIC160018_01_1280_KH3.png");
        electricVehicleStorage.saveElectricVehicle(nissanLeaf);

        ElectricVehicle polestarTwo = new ElectricVehicle("Polestar", "Two", 59900.00, true,
                233, 92, 4.5, 127, "AWD", 8, 47, 5, false,
                true, true, 14.3, 1.23, 5.0, true,
                "https://www.gannett-cdn.com/presto/2020/08/20/PDTF/636d94b2-68d6-424b-ada2-21103a7057f7-IMG_3086.JPG?crop=3504,1971,x15,y0&width=3200&height=1800&format=pjpg&auto=webp");
        electricVehicleStorage.saveElectricVehicle(polestarTwo);

        ElectricVehicle porscheTaycan = new ElectricVehicle("Porsche", "Taycan", 103800.00, true,
                200, 69, 3.4, 155, "RWD", 12, 15, 4, false,
                true, true, 12.9, 2.8, 5.0, false,
                "https://www.motortrend.com/uploads/sites/5/2021/01/2021_Porsche_Taycan_2.jpeg?fit=around%7C875:492.1875");
        electricVehicleStorage.saveElectricVehicle(porscheTaycan);

        ElectricVehicle teslaThree = new ElectricVehicle("Tesla", "Model 3 SR+", 39900.00, false,
                263, 133, 5.3, 140, "RWD", 5.5, 21, 5, true,
                true, true, 18, 5, 5.0, true,
                "https://upload.wikimedia.org/wikipedia/commons/9/91/2019_Tesla_Model_3_Performance_AWD_Front.jpg");
        electricVehicleStorage.saveElectricVehicle(teslaThree);

        ElectricVehicle teslaSPlaid = new ElectricVehicle("Tesla", "Model S Plaid", 129990.00, false,
                396, 101, 1.99, 200, "AWD", 6.5, 27, 5, true,
                true, true, 25, 3, 5.0, true,
                "https://i.insider.com/605ce29e106eb50019d05a89?width=700");
        electricVehicleStorage.saveElectricVehicle(teslaSPlaid);

        ElectricVehicle teslaX = new ElectricVehicle("Tesla", "Model X LR", 94990.00, false,
                360, 96, 3.8, 155, "AWD", 12, 22, 7, true,
                true, true, 83, 5, 5.0, true,
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/screen-shot-2021-01-27-at-6-16-08-pm-1611789398.png?crop=0.534xw:0.691xh;0.234xw,0.110xh&resize=640:*");
        electricVehicleStorage.saveElectricVehicle((teslaX));

        ElectricVehicle teslaY = new ElectricVehicle("Tesla", "Model Y LR", 53990.00, false,
                326, 121, 4.8, 135, "AWD", 10, 40, 5, true,
                true, true, 71, 5, 5.0, true,
                "https://www.tesla.com/assets/img/my_fb_s.jpg");
        electricVehicleStorage.saveElectricVehicle(teslaY);

        ElectricVehicle volksIdFour = new ElectricVehicle("Volkswagen", "ID.4", 44495.00, true,
                250, 99, 5.7, 112, "AWD", 7.5, 38, 5, false,
                true, true, 30, 0, 4.5, false,
                "https://techcrunch.com/wp-content/uploads/2021/03/vw-Large-12562-2021ID.4ProSwithGradientPackage.jpg?w=730&crop=1");
        electricVehicleStorage.saveElectricVehicle(volksIdFour);

        ElectricVehicle volvoXcForty = new ElectricVehicle("Volvo", "XC40 Recharge", 53990.00, true,
                208, 80, 4.3, 112, "AWD", 11, 40, 5, false,
                true, true, 20, 5, 5.0, true,
                "https://cdn.motor1.com/images/mgl/A8zbL/s1/volvo-xc40-recharge-2020.webp");
        electricVehicleStorage.saveElectricVehicle(volvoXcForty);

        ElectricVehicle audiA6Etron = new ElectricVehicle("Audi", "A6 e-tron", 80000.00, true,
                400, 80, 5.1, 125, "AWD", 10, 30, 5, false,
                true, false, 29.5, 3, 4.5, false,
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/audi-a6-e-tron-concept-113-1618585274.jpg?crop=0.739xw:0.494xh;0.0369xw,0.346xh&resize=1200:*");
        electricVehicleStorage.saveElectricVehicle(audiA6Etron);

        ElectricVehicle bmwIFour = new ElectricVehicle("BMW", "I4", 56395.00, true,
                300, 90, 5.7, 118, "RWD", 8.75, 30, 5, false,
                true, true, 16.6, 0, 4.5, true,
                "https://www.cnet.com/a/img/-fC9r7EA4SUrpAJVm211h2aGZ7I=/940x0/2020/02/28/4f5e69fe-2497-494c-b738-24f864561236/bmw-i4-concept-003.jpg");
        electricVehicleStorage.saveElectricVehicle(bmwIFour);

        ElectricVehicle bmwIX = new ElectricVehicle("BMW", "IX", 84194.00, true,
                300, 85, 4.6, 124, "AWD", 11, 35, 5, false,
                true, true, 27.4, 0, 4.5, true,
                "https://cdn.motor1.com/images/mgl/Kj0qM/s1/bmw-ix.jpg");
        electricVehicleStorage.saveElectricVehicle(bmwIX);

        ElectricVehicle bollingerBTwo = new ElectricVehicle("Bollinger", "B2", 125000.00, true,
                200, 70, 4.5, 100, "AWD", 10, 75, 4, false,
                false, false, 86, 8.0, 4.0, false,
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/bollinger-b2-201-1607721643.jpg");
        electricVehicleStorage.saveElectricVehicle(bollingerBTwo);

        ElectricVehicle caddyLyriq = new ElectricVehicle("Cadillac", "Lyriq", 59995.00, true,
                300, 80, 4.3, 130, "RWD", 6, 35, 7, true,
                true, true, 12.6, 0, 4.5, false,
                "https://i0.wp.com/electrek.co/wp-content/uploads/sites/3/2021/04/Cadillac-Lyriq-2.jpg?ssl=1");
        electricVehicleStorage.saveElectricVehicle(caddyLyriq);

        ElectricVehicle fordLightning = new ElectricVehicle("Ford", "F-150 Lightning", 42000.00, true,
                230, 75, 4.5, 100, "AWD", 8, 44, 5, true,
                true, true, 80, 14.1, 5.0, true,
                "https://cdn.motor1.com/images/mgl/3yeZp/s1/2022-ford-f-150-lightning-side-view.webp");
        electricVehicleStorage.saveElectricVehicle(fordLightning);

        ElectricVehicle genesisGEighty = new ElectricVehicle("Genesis", "G80", 50000.00, true,
                310, 90, 4.8, 100, "e-AWD", 9, 22, 5, false,
                true, false, 13.1, 0, 4.5, true,
                "https://www.motortrend.com/uploads/sites/5/2020/03/2021-Genesis-G80-4.jpg");
        electricVehicleStorage.saveElectricVehicle(genesisGEighty);

        ElectricVehicle gmcHummer = new ElectricVehicle("GMC", "Hummer EV", 79995.00, true,
                350, 75, 3.0, 100, "AWD", 12, 30, 5, true,
                true, false, 80, 11.3, 4.5, true,
                "https://www.motortrend.com/uploads/sites/5/2020/10/2022-GMC-Hummer-EV-03.jpg");
        electricVehicleStorage.saveElectricVehicle(gmcHummer);

        ElectricVehicle hyundaiIoniqFive = new ElectricVehicle("Hyundai", "Ioniq 5", 45000.00, true,
                225, 125, 5.2, 115, "AWD", 7.75, 18, 5, false,
                true, false, 18.8, 0.85, 4.5, true,
                "https://www.topgear.com/sites/default/files/images/news-article/2021/02/fa6aac51e8f8f99b67802fbec8432e04/ioniq5kvs_4.jpg");
        electricVehicleStorage.saveElectricVehicle(hyundaiIoniqFive);

        ElectricVehicle jeepMagneto = new ElectricVehicle("Jeep", "Wrangler Magneto", 52500.00, true,
                200, 95, 6.8, 120, "AWD", 9, 45, 4, false,
                true, false, 17, 0, 4.0, false,
                "https://www.motortrend.com/uploads/sites/5/2021/03/Jeep-Magneto-1.jpg?fit=around%7C875:492");
        electricVehicleStorage.saveElectricVehicle(jeepMagneto);

        ElectricVehicle kiaEvSix = new ElectricVehicle("Kia", "EV6", 45000.00, true,
                270, 110, 5.2, 115, "RWD", 7, 18, 5, false,
                true, false, 28, 0, 4.5, true,
                "https://cimg0.ibsrv.net/ibimg/hgm/1920x1080-1/100/786/2022-kia-ev6_100786824.jpg");
        electricVehicleStorage.saveElectricVehicle(kiaEvSix);

        ElectricVehicle mercedesEqa = new ElectricVehicle("Mercedes-Benz", "EQA", 57000.00, true,
                250, 100, 7.0, 99, "AWD", 7.25, 35, 5, false,
                true, false, 12, 0, 4.5, true,
                "https://s.yimg.com/os/creatr-uploaded-images/2021-01/99601910-5b08-11eb-abff-1193b560fe7f");
        electricVehicleStorage.saveElectricVehicle(mercedesEqa);

        ElectricVehicle nissaAriya = new ElectricVehicle("Nissan", "Ariya", 40000.00, true,
                300, 105, 7.5, 99, "FWD", 10, 31, 5, true,
                true, false, 16.5, 0, 4.5, false,
                "https://www.cnet.com/a/img/u8T28wvt1gBqp47Rm_6jxBeia08=/1200x675/2021/03/19/0bb10fed-d925-47c0-ba90-a4b42837b7a3/ogi-nissan.jpg");
        electricVehicleStorage.saveElectricVehicle(nissaAriya);

        ElectricVehicle rivianROneT = new ElectricVehicle("Rivian", "R1T", 73000.00, true,
                300, 80, 3.0, 100, "AWD", 10, 35, 5, true,
                true, true, 57, 11.0, 4.5, false,
                "https://cdn.motor1.com/images/mgl/B37xA/s3/rivian-r1t-c-2020-jeff-johnson.jpg");
        electricVehicleStorage.saveElectricVehicle(rivianROneT);

        ElectricVehicle teslaCybertruck = new ElectricVehicle("Tesla", "Cybertruck", 70000.00, false,
                500, 90, 3.0, 130, "AWD", 10, 44, 6, true,
                true, true, 90, 10.0, 5.0, true,
                "https://i.gaw.to/content/photos/45/28/452817-le-tesla-cybertruck-ne-sera-finalement-pas-pret-avant-2022.jpeg?460x287");
        electricVehicleStorage.saveElectricVehicle(teslaCybertruck);

        ElectricVehicle teslaRoadsterTwo = new ElectricVehicle("Tesla", "Roadster 2", 200000.00, false,
                620, 90, 1.9, 250, "AWD", 8, 44, 4, true,
                true, true, 15, 4.0, 5.0, true,
                "https://cdn.vox-cdn.com/thumbor/HTcou-2jE-vt33LaXJN_tmmN4pY=/0x0:3840x2160/1400x933/filters:focal(1562x816:2176x1430):no_upscale()/cdn.vox-cdn.com/uploads/chorus_image/image/57642853/Roadster_Front_58.0.jpg");
        electricVehicleStorage.saveElectricVehicle(teslaRoadsterTwo);


    }
}
