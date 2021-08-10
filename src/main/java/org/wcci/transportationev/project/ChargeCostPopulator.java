package org.wcci.transportationev.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wcci.transportationev.project.resources.ChargeCost;
import org.wcci.transportationev.project.storage.ChargeCostRepository;

@Component
public class ChargeCostPopulator implements CommandLineRunner {

    private ChargeCostRepository chargeCostRepository;


    public ChargeCostPopulator(ChargeCostRepository chargeCostRepository) {
        this.chargeCostRepository = chargeCostRepository;
    }
    
    @Override
    public void run(String... args) throws Exception {
        ChargeCost alabama = new ChargeCost("Alabama", 7.94, 3333, 11.68, 2272);
        chargeCostRepository.save(alabama);

        ChargeCost alaska = new ChargeCost("Alaska", 13.59, 1923, 16.32, 1613);
        chargeCostRepository.save(alaska);

        
    }
    
}
