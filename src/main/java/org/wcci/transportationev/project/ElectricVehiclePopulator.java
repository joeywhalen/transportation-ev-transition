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

        
    }
}
