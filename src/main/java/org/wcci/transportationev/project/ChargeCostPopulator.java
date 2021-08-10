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

        ChargeCost connecticut = new ChargeCost("Connecticut", 13.00, 2041, 13.68, 1923);
        chargeCostRepository.save(connecticut);

        ChargeCost delaware = new ChargeCost("Delaware", 7.88, 3333, 10.26, 2564);
        chargeCostRepository.save(delaware);

        ChargeCost district = new ChargeCost("District of Columbia", 7.88, 3333, 11.95, 2222);
        chargeCostRepository.save(district);

        ChargeCost florida = new ChargeCost("Florida", 6.94, 3846, 10.21, 2564);
        chargeCostRepository.save(florida);

        ChargeCost georgia = new ChargeCost("Georgia", 7.82, 3333, 10.79, 2439);
        chargeCostRepository.save(georgia);

        ChargeCost hawaii = new ChargeCost("Hawaii", 19.29, 1370, 21.11, 1250);
        chargeCostRepository.save(hawaii);

        ChargeCost idaho = new ChargeCost("Idaho", 6.12, 4348, 9.37, 2778);
        chargeCostRepository.save(idaho);

        ChargeCost illinois = new ChargeCost("Illinois", 8.35, 3125, 10.37, 2564);
        chargeCostRepository.save(illinois);

        ChargeCost indiana = new ChargeCost("Indiana", 8.35, 3125, 11.47, 2273);
        chargeCostRepository.save(indiana);

        ChargeCost iowa = new ChargeCost("Iowa", 7.88, 3333, 10.63, 2500);
        chargeCostRepository.save(iowa);

        ChargeCost kansas = new ChargeCost("Kansas", 8.18, 3226, 10.90, 2439);
        chargeCostRepository.save(kansas);

        ChargeCost kentucky = new ChargeCost("Kentucky", 7.00, 3704, 10.95, 2381);
        chargeCostRepository.save(kentucky);

        ChargeCost louisiana = new ChargeCost("Louisana", 6.88, 3846, 10.79, 2439);
        chargeCostRepository.save(louisiana);

        ChargeCost maine = new ChargeCost("Maine", 9.77, 2703, 11.84, 2222);
        chargeCostRepository.save(maine);

        ChargeCost maryland = new ChargeCost("Maryland", 6.88, 3846, 10.37, 2564);
        chargeCostRepository.save(maryland);

        ChargeCost massachusetts = new ChargeCost("Massachusetts", 10.94, 2381, 13.21, 2000);
        chargeCostRepository.save(massachusetts);

        ChargeCost michigan = new ChargeCost("Michigan", 10.42, 2500, 11.84, 2222);
        chargeCostRepository.save(michigan);

        ChargeCost minnesota = new ChargeCost("Minnesota", 8.00, 3333, 11.16, 2381);
        chargeCostRepository.save(minnesota);

        ChargeCost mississippi = new ChargeCost("Mississippi", 7.29, 3571, 11.11, 2381);
        chargeCostRepository.save(mississippi);

        ChargeCost missouri = new ChargeCost("Missouri", 6.77, 3846, 9.79, 2703);
        chargeCostRepository.save(missouri);

        ChargeCost montana = new ChargeCost("Montana", 6.65, 4000, 10.90, 2439);
        chargeCostRepository.save(montana);

        
    }
    
}
