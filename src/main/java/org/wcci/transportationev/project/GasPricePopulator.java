package org.wcci.transportationev.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wcci.transportationev.project.resources.GasPrice;
import org.wcci.transportationev.project.storage.GasPriceRepository;

@Component
public class GasPricePopulator implements CommandLineRunner {
    private GasPriceRepository gasPriceRepository;

    public GasPricePopulator(GasPriceRepository gasPriceRepository) {
        this.gasPriceRepository = gasPriceRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        GasPrice alabama = new GasPrice("Alabama", 2.84f, 1060);
        gasPriceRepository.save(alabama);
        GasPrice alaska = new GasPrice("Alaska",3.67f, 824);
        gasPriceRepository.save(alaska);
        GasPrice arizona = new GasPrice("Arizona", 3.12f, 961);
        gasPriceRepository.save(arizona);
        GasPrice arkansas = new GasPrice("Arkansas",2.87f, 1052);
        gasPriceRepository.save(arkansas);
        GasPrice california = new GasPrice("California",4.39f);
        gasPriceRepository.save(california);
        GasPrice colorado = new GasPrice("Colorado",3.63f);
        gasPriceRepository.save(colorado);
        GasPrice connecticut = new GasPrice("Connecticut",3.17f);
        gasPriceRepository.save(connecticut);
        GasPrice dc = new GasPrice("District of Columbia",3.29f);
        gasPriceRepository.save(dc);
        GasPrice delaware = new GasPrice("Delaware",3.01f);
        gasPriceRepository.save(delaware);
        GasPrice florida = new GasPrice("Florida",3.01f);
        gasPriceRepository.save(florida);
        GasPrice georgia = new GasPrice("Georgia",2.96f);
        gasPriceRepository.save(georgia);
        GasPrice hawaii = new GasPrice("Hawaii",4.09f);
        gasPriceRepository.save(hawaii);
        GasPrice iowa = new GasPrice("Iowa",2.99f);
        gasPriceRepository.save(iowa);
        GasPrice idaho = new GasPrice("Idaho",3.80f);
        gasPriceRepository.save(idaho);
        GasPrice illinois = new GasPrice("Illinois",3.40f);
        gasPriceRepository.save(illinois);
        GasPrice indiana = new GasPrice("Indiana",3.12f);
        gasPriceRepository.save(indiana);
        GasPrice kansas = new GasPrice("Kansas",2.93f);
        gasPriceRepository.save(kansas);
        GasPrice kentucky = new GasPrice("Kentucky",2.96f);
        gasPriceRepository.save(kentucky);
        GasPrice louisiana = new GasPrice("Louisiana",2.82f);
        gasPriceRepository.save(louisiana);
        GasPrice mass = new GasPrice("Massachusetts",3.04f);
        gasPriceRepository.save(mass);
        GasPrice mary = new GasPrice("Maryland",3.06f);
        gasPriceRepository.save(mary);
        GasPrice maine = new GasPrice("Maine",3.11f);
        gasPriceRepository.save(maine);
        GasPrice mich = new GasPrice("Michigan",3.28f);
        gasPriceRepository.save(mich);
        GasPrice minn = new GasPrice("Minnesota",3.03f);
        gasPriceRepository.save(minn);
        GasPrice missouri = new GasPrice("Missouri",2.87f);
        gasPriceRepository.save(missouri);
        GasPrice mississippi = new GasPrice("Mississippi",2.79f);
        gasPriceRepository.save(mississippi);
        GasPrice mont = new GasPrice("Montana",3.29f);
        gasPriceRepository.save(mont);
        GasPrice ncar = new GasPrice("North Carolina",2.93f);
        gasPriceRepository.save(ncar);
        GasPrice ndak = new GasPrice("North Dakota",3.12f);
        gasPriceRepository.save(ndak);
        GasPrice neb = new GasPrice("Nebraska",3.02f);
        gasPriceRepository.save(neb);
        GasPrice newhamp = new GasPrice("New Hampshire",3.00f);
        gasPriceRepository.save(newhamp);
        GasPrice jersey = new GasPrice("New Jersey",3.20f);
        gasPriceRepository.save(jersey);
        GasPrice newmex = new GasPrice("New Mexico",3.09f);
        gasPriceRepository.save(newmex);
        GasPrice nev = new GasPrice("Nevada",4.04f);
        gasPriceRepository.save(nev);
        GasPrice york = new GasPrice("New York",3.22f);
        gasPriceRepository.save(york);
        GasPrice ohio = new GasPrice("Ohio",3.05f);
        gasPriceRepository.save(ohio);
        GasPrice ok = new GasPrice("Oklahoma",2.89f);
        gasPriceRepository.save(ok);
        GasPrice oregon = new GasPrice("Oregon",3.76f);
        gasPriceRepository.save(oregon);
        GasPrice penn = new GasPrice("Pennsylvania",3.28f);
        gasPriceRepository.save(penn);
        GasPrice rhode = new GasPrice("Rhode Island",3.06f);
        gasPriceRepository.save(rhode);
        GasPrice scar = new GasPrice("South Carolina",2.88f);
        gasPriceRepository.save(scar);
        GasPrice sdak = new GasPrice("South Dakota",3.18f);
        gasPriceRepository.save(sdak);
        GasPrice tenn = new GasPrice("Tennessee",2.88f);
        gasPriceRepository.save(tenn);
        GasPrice texas = new GasPrice("Texas",2.83f);
        gasPriceRepository.save(texas);
        GasPrice utah = new GasPrice("Utah",3.87f);
        gasPriceRepository.save(utah);
        GasPrice virginia = new GasPrice("Virginia",2.97f);
        gasPriceRepository.save(virginia);
        GasPrice wash = new GasPrice("Washington",3.87f);
        gasPriceRepository.save(wash);
        GasPrice wisc = new GasPrice("Wisconsin",3.03f);
        gasPriceRepository.save(wisc);
        GasPrice wv = new GasPrice("West Virginia",3.03f);
        gasPriceRepository.save(wv);
        GasPrice wyoming = new GasPrice("Wyoming",3.58f);
        gasPriceRepository.save(wyoming);
    }
}
