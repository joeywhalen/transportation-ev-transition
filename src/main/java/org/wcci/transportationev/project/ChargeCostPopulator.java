package org.wcci.transportationev.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wcci.transportationev.project.storage.ChargeCostRepository;

@Component
public class ChargeCostPopulator implements CommandLineRunner {

    private ChargeCostRepository chargeCostRepository;


    public ChargeCostPopulator(ChargeCostRepository chargeCostRepository) {
        this.chargeCostRepository = chargeCostRepository;
    }
    
    @Override
    public void run(String... args) throws Exception {
        
    }
    
}
