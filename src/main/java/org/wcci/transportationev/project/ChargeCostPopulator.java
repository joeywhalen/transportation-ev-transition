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

        ChargeCost arizona = new ChargeCost("Arizona", 7.71, 3448, 10.95, 2381);
        chargeCostRepository.save(arizona);

        ChargeCost arkansas = new ChargeCost("Arkansas", 6.59, 4000, 10.00, 2632);
        chargeCostRepository.save(arkansas);

        ChargeCost california = new ChargeCost("California", 13.41, 1961, 14.58, 1818);
        chargeCostRepository.save(california);

        ChargeCost colorado = new ChargeCost("Colorado", 7.41, 3571, 10.79, 2439);
        chargeCostRepository.save(colorado);

        
    }
    
}
