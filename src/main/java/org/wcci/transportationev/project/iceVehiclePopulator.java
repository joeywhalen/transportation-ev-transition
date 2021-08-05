package org.wcci.transportationev.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wcci.transportationev.project.resources.Make;
import org.wcci.transportationev.project.resources.Model;
import org.wcci.transportationev.project.storage.MakeStorage;
import org.wcci.transportationev.project.storage.ModelStorage;

@Component
public class iceVehiclePopulator implements CommandLineRunner {

    private MakeStorage makeStorage;
    private ModelStorage modelStorage;

    public iceVehiclePopulator(MakeStorage makeStorage, ModelStorage modelStorage) {
        this.makeStorage = makeStorage;
        this.modelStorage = modelStorage;
    }

    @Override
    public void run(String... args) throws Exception {


        //FORD MAKE
        Make Ford = new Make("Ford");
        makeStorage.saveMake(Ford);
        //HOND MAKE
        Make Honda = new Make("Honda");
        makeStorage.saveMake(Honda);


        //Ford Models
        Model f150 = new Model("F-150",Ford);
        Model mustang = new Model("Mustang",Ford);
        modelStorage.saveModel(f150);
        modelStorage.saveModel(mustang);
        //Honda Models
        Model civic = new Model("Civic",Honda);
        Model accord = new Model("Accord",Honda);
        modelStorage.saveModel(civic);
        modelStorage.saveModel(accord);




    }


}
