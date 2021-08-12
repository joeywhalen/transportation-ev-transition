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
        ElectricVehicle audiETronSB = new ElectricVehicle("Audi", "e-tron Sportback", "Cliff Booth", "Sedan", 69100.00, true, 
                725, 218, 77, 5.5, 118, "AWD", 10, 30, 5, false,
                true, false, 27.2, 3, 4.5, false,
                "https://www.motortrend.com/uploads/sites/5/2019/11/2020-Audi-E-Tron-Sportback-11.jpg?fit=around%7C875:492",
                "https://www.cnet.com/a/img/jF9XjA7gNJLQQo9ivIG6zEno4Qo=/2019/11/19/efbb58b4-bc42-46c6-8142-16ff002fd12d/ogi-audi-e-tron-sportback-2020-ogi.jpg",
                "2021 Audi e-tron sportback electric vehicle. The new model features standard EPA and CE certification.\n" +
                "\n" +
                "The Model S Sportback features an all electric engine, while the smaller, sportier version replaces the 3.2-liter V-6 that would replace the smaller V-6 found in the S-Class. The rear seats (or lack thereof) are identical to the S-Class models, but there's no dual-slip differential. This means it's a more comfortable ride.\n" +
                "\n" +
                "Other new features include a 3.5-liter V-6 in both passenger and cargo space, electric skid roll, heated front seats, air bags and all-new rear wheels.\n" +
                "\n" +
                "The Model S Sportback, along with the all electric engine, also comes equipped with six-piston calipers along with three-way hydraulics. All interior dimensions are as follows:\n" +
                "\n" +
                "• S-Class: 2x6L, 19-inch alloy wheels, Michelin Pilot Pilot, SAE A14-T (2mm) in all valves.\n" +
                "\n" +
                "• New front fascia, 6-inch alloy hubs, aluminum-machined, two-piece frame.",
                "I could not agree more.  Love Audi, and love this vehicle!");
        electricVehicleStorage.saveElectricVehicle(audiETronSB);

        ElectricVehicle chevyBolt = new ElectricVehicle("Chevrolet", "Bolt", "Mia Wallace", "Crossover", 37500.00, false, 
                725, 247, 120, 7.0, 93, "FWD", 7.5, 60, 5, true,
                true, false, 16.6, 0, 5.0, false,
                "https://media.chevrolet.com/dld/content/dam/Media/images/US/Vehicles/Concepts/Chevrolet/BoltEV/Product/2015-Chevrolet-BoltEV-Concept-exterior-001.jpg",
                "https://media.chevrolet.com/content/Pages/news/us/en/2021/feb/0214-boltev-bolteuv/_jcr_content/top_parsys/image.img.jpg/1613335646777.jpg",
                "2022 Chevrolet Bolt – A new engine and new wheels are all the rage in the Chevrolet Bolt, bringing a new class of SUV for the next generation and the only place in the market where all that is new is the Chevrolet Bolt.\n" +
                "\n" +
                "And it comes with a new, $39,000 msrp.\n" +
                "\n" +
                "That's over $8,000 cheaper than what has been added to the Bolt for the U.S. market, but it's still just 4% more expensive than the U.S. market, which saw 16.4% more sales for the first time over last year.\n" +
                "\n" +
                "I was interested not once, not twice, but once and for all where the CTM and GM cars are coming from.\n" +
                "\n" +
                "When they came out, we thought they were not coming just for the U.S., but were going to be coming around the world.\n" +
                "\n" +
                "So we set about making sure Chevrolet got to where they were able to do that.");
        electricVehicleStorage.saveElectricVehicle(chevyBolt);

        ElectricVehicle fordMustang = new ElectricVehicle("Ford", "Mustang Mach-E Select (eAWD)", "Vincent Vega", "Crossover", 42895.00, true,
                725, 211, 90, 5.2, 130, "e-AWD", 14, 52, 5, false,
                true, true, 29.7, 4.7, 5.0, true,
                "https://www.ford.com/ntzlibs/content/dam/bev/us/november-2020-updates/21_FRD_MCH_50700_GTP.jpg.renditions.original.png",
                "https://media.ford.com/content/fordmedia/fna/us/en/products/evs/mustang-mach-e/mustang-mach-e/jcr:content/content/media-section-parsys/textimage_f597/image.img.951.535.jpg/1608221793793.jpg",
                "2021 Ford Mustang Mach E, All electric vehicle with 9.7-inch display.\n" +
                "\n" +
                "These small and well equipped Ford Mustang Mach E are equipped with a unique design and all-new electric engine. Each Ford Mustang Mach E with the powertrain comes with the latest Ford Mustang technology including Ford-developed electric motors capable of producing a fully automatic transmission. In addition to the powerful torque at 100-to 20,000 RPM, Ford Mustang Mach E features automatic drive, electronically-configurable engine and more horsepower. Also, in addition to the powertrain, the Ford Mustang Mach E also comes equipped with automatic torque converter, which enhances smooth driving for those with different driving tastes.\n" +
                "\n" +
                "There is an optional 4x32 rear-wheel drive mode available for all four sizes. For more information, please visit Ford.com.");
        electricVehicleStorage.saveElectricVehicle(fordMustang);

        ElectricVehicle hyundaiIoniq = new ElectricVehicle("Hyundai", "Ioniq", "Joe Cabot", "Sedan", 33245.00, true,
                725, 170, 133, 10, 102, "FWD", 5.8, 60, 5, false,
                true, false, 23, 0, 4.0, false,
                "https://ev-database.org/img/auto/Hyundai_IONIQ_Electric_2020/Hyundai_IONIQ_Electric_2020-01.jpg",
                "https://media.ed.edmunds-media.com/hyundai/ioniq-hybrid/2020/oem/2020_hyundai_ioniq-hybrid_4dr-hatchback_limited_fq_oem_1_1600.jpg",
                "2021 Hyundai Ioniq electric vehicle\n" +
                "\n" +
                "I have been a Hyundai Ioniq owner since 2001. I work with a car of every type, including a Kia i8, i8 Premium model, and I have made one new car during the past 11 years or so. Here are some tips for your Toyota or Lowe's dealership that I know of, and would recommend to a Toyota owner:\n" +
                "\n" +
                "1. Keep your vehicle well ventilated.\n" +
                "\n" +
                "2. Use a large open window to bring one foot level below the vehicle to help protect it from moisture.\n" +
                "\n" +
                "3. Check your window to make sure the windows are sealed and keep those windows open and dry.\n" +
                "\n" +
                "4. Keep your car clean with an odor-free paint application.\n" +
                "\n" +
                "5. If possible, cover your vehicle with plastic that is a little harder to get out of the car - make sure that the plastic and paint work together to eliminate air and fog.\n" +
                "\n" +
                "6. If you are not in the Toyota or Lowe's area, take the car outside for a few hours and check outside for anything that may be contaminated with debris and dirt on the curb.\n" +
                "\n" +
                "7. The car door is secure.\n" +
                "\n" +
                "8. Use a metal plate that does not interfere with your window.\n" +
                "\n" +
                "If it is a large flat-panel TV or TV stand, make sure it is completely sealed in the clear plastic bag.\n" +
                "\n" +
                "9. Cover your car",
                "I was planning on purchasing a 2021 Hyundai Ioniq EV, but after reading this review I am definitely going with Tesla!");
        electricVehicleStorage.saveElectricVehicle(hyundaiIoniq);

        ElectricVehicle hyundaiKona = new ElectricVehicle("Hyundai", "Kona", "Alabama Whitman", "Crossover", 37900.00, true,
                725, 258, 120, 6.4, 96, "FWD", 9, 54, 5, false,
                true, false, 19.2, 0, 5.0, false,
                "https://cdn.jdpower.com/JDPA_2020%20Hyundai%20Kona%20Ultimate%20White%20Front%20View.jpg",
                "https://cdn.motor1.com/images/mgl/qz7Eg/s1/hyundai-kona-electric-restyling-2021.webp",
                "Among hybrid and electric SUVs, the Hyundai Kona Electric offers great driving range and swift acceleration.  It provides punchy performance from its 201-horsepower electric motor and can go more than 250 miles before recharging.\n" +
                "\n" +
                "Like the regular Kona, the Electric version drives well and has decently zippy acceleration. Being electric, it doesn't suffer the regular Kona's turbo lag.\n" +
                "\n" +
                "The Kona is an excellent choice if you're looking for a smaller SUV with carlike driving manners.");
        electricVehicleStorage.saveElectricVehicle(hyundaiKona);

        ElectricVehicle jaguarIpace = new ElectricVehicle("Jaguar", "I-Pace", "Mallory Knox", "Crossover", 69900.00, true,
                725, 234, 76, 4.5, 124, "AWD", 10.2, 90, 5, false,
                true, true, 23.2, 1.0, 5.0, false,
                "https://electrek.co/wp-content/uploads/sites/3/2019/01/Jaguar-I-Pace-hero-e1547961480245.jpg?quality=82&strip=all",
                "https://cdn.motor1.com/images/mgl/qvVZR/s1/jaguar-i-pace-lo-show-di-presentazione-dalle-19-del-1-marzo.jpg",
                "2021 Jaguar I-Pace electric vehicle\n" +
                "\n" +
                "The best of the best of the best\n" +
                "\n" +
                "The biggest problem I'm trying to solve\n" +
                "\n" +
                "The car I want to purchase\n" +
                "\n" +
                "The guy who thinks I'm crazy\n" +
                "\n" +
                "This article is about, for example, the car I bought. The car I wanted could not meet the 'rules' for a successful sale. This car, though I'd consider it, might well be an exception.\n" +
                "\n" +
                "At the least, this doesn't mean that the car I wanted didn't come with a few different reasons. I'm just as likely to be a customer for a certain thing as someone who buys a vehicle at the local auto dealer.\n" +
                "\n" +
                "At the risk of sounding a bit paranoid here, car buyers and dealers love to put car prices on the table. That's why we often overlook or minimize high interest purchases. The most often overlooked item is the interest they pay to buy a car.\n" +
                "\n" +
                "It's possible for a buyer to make an investment of money by buying a car, for example, at a discount. However, such investments tend not to result in high rates of interest.\n" +
                "\n" +
                "It is important to note two general points:\n" +
                "\n" +
                "- If the car being offered at the dealership makes a purchase, that item will be accepted by some buyer as something that they'd purchase at their local car retailer.\n" +
                "\n" +
                "- A 'price on the street' comparison isn't a very efficient way to measure the...");
        electricVehicleStorage.saveElectricVehicle(jaguarIpace);

        ElectricVehicle kiaNiro = new ElectricVehicle("Kia", "Niro", "Seth Gecko", "Crossover", 39090.00, true,
                725, 239, 112, 6.5, 103, "FWD", 9.5, 60, 5, false,
                true, false, 18.5, 0, 5.0, false,
                "https://www.kia.com/us/en/vehicles/niro-plug-in-hybrid/2021/_jcr_content/root/responsivegrid/mediatext.coreimg.100.1400.jpeg/1616531623780.jpeg",
                "https://electrek.co/wp-content/uploads/sites/3/2021/06/2021-Kia-Niro-EV.jpg?quality=82&strip=all",
                "2021 Kia Niro Electric vehicle. The Niro is a smart-chargable electric vehicle that combines electrical power, lithium ion batteries, and electrical surge storage with remote charging. It is powered by electric motor and is equipped with the latest generation of lithium-ion batteries. It's designed to be ready to walk in to anywhere in the United States within two years, and can then be transported on rail to its destination in less than a month. The Niro is available with a range of 300 kilometers from a factory in the Bay Area to Alaska.\n" +
                "\n" +
                "About the Niro Motorsports\n" +
                "\n" +
                "The Niro is the latest generation of the most innovative electric vehicle, developed and produced by Niro, a maker of electric cars. In October 2016, Niro Motorsports began developing the Niro, known for providing an alternative vision to Tesla, the electric car company. Niro Motorsports is the company that developed the latest generation of electric vehicle, the Niro 4.4. That means Niro Motorsports provides a top-of-the-line electric vehicle, with high performance and safety features, with a range of 6,000 kilometers and a range of 6,400 kilometers. In October, 2016, the company announced a partnership between Tesla Motorsports and Niro to develop Niro for the future of the electric mobility market.");
        electricVehicleStorage.saveElectricVehicle(kiaNiro);

        ElectricVehicle lucidAir = new ElectricVehicle("Lucid", "Air Touring", "Kate Fuller", "Sedan", 87500.00, true,
                725, 406, 100, 3.2, 168, "AWD", 6, 20, 5, false,
                true, true, 26.1, 9.9, 4.5, true,
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/lucid-air-103-1599688020.jpg?crop=0.652xw:0.733xh;0.104xw,0.0769xh&resize=640:*",
                "https://i.ytimg.com/vi/X0f0LuA6Qvk/maxresdefault.jpg",
                "Overheating Earth, meet the 2021 Lucid Air, the newest electric vehicle to join Tesla in the green fleet of luxury sedans.\n" +
                "\n" +
                "The 2021 Lucid Air electric sedan has the Tesla Model S in its crosshairs.\n" +
                "\n" +
                "EV Power Meets Ultimate Luxury."
                );
        electricVehicleStorage.saveElectricVehicle(lucidAir);

        ElectricVehicle miniCooperSE = new ElectricVehicle("Mini Cooper", "SE", "Santanico Pandemonium", "Sedan", 29900.00, true,
                725, 114, 108, 6.9, 93, "FWD", 4, 36, 4, false,
                true, false, 8.7, 0, 4.0, false,
                "https://cdn.motor1.com/images/mgl/0lp6V/s1/mini-cooper-se-2020-im-test.jpg",
                "https://cdn.motor1.com/images/mgl/kNN7x/s1/mini-cooper-se.jpg",
                "2021 Mini Cooper SE Electric vehicle features a new, lower-powered electric propulsion system and comes with a redesigned steering wheel using less energy in direct sunlight.\n" +
                "\n" +
                "In terms of features, the EV is available with the S-Penetration Pro, which helps reduce the battery voltage by 15%, while the Paddle mode offers two more modes for increased stability and additional power levels.\n" +
                "\n" +
                "The EV version offers only one option for the user after the user activates the app for two minutes in the EV Comfort mode.\n" +
                "\n" +
                "The EV version also features additional LED lights available to help you take a look or just take a video.");
        electricVehicleStorage.saveElectricVehicle(miniCooperSE);

        ElectricVehicle nissanLeaf = new ElectricVehicle("Nissan", "Leaf S Plus", "Max Cherry", "Crossover", 37400.00, true,
                725, 226, 114, 7.4, 90, "FWD", 11, 60, 5, false,
                true, false, 23.6, 0, 5.0, false,
                "https://inv.assets.sincrod.com/ChromeColorMatch/us/TRANSPARENT_cc_2021NIC160018_01_1280_KH3.png",
                "https://cdn.motor1.com/images/mgl/42lOZ/s1/2021-nissan-leaf.jpg",
                "2021 Nissan Leaf Electric vehicle\n" +
                "\n" +
                "In June 2015, Nissan introduced the 'Polarizer' of the model year and went on to have this year's models from Nissan.\n" +
                "\n" +
                "The new electric version of the Leaf may still be a bit less powerful than the 2017 model and the update was supposed to last two months, meaning that the brand will still need to develop a good test-drive to compare it to the previous generation models. But the test-drive test was, frankly, not good.\n" +
                "\n" +
                "The Tesla Model S was more powerful than the Nissan Leaf as a real test road car. But, after some testing, the Model S took all three test-driving sessions off. This test was run by Tesla Motors, Hyundai Motors, and Mitsubishi Motors in Tokyo.");
        electricVehicleStorage.saveElectricVehicle(nissanLeaf);

        ElectricVehicle polestarTwo = new ElectricVehicle("Polestar", "Two", "Ray Nicolette", "Crossover", 59900.00, true,
                725, 233, 92, 4.5, 127, "AWD", 8, 47, 5, false,
                true, true, 14.3, 1.23, 5.0, true,
                "https://www.gannett-cdn.com/presto/2020/08/20/PDTF/636d94b2-68d6-424b-ada2-21103a7057f7-IMG_3086.JPG?crop=3504,1971,x15,y0&width=3200&height=1800&format=pjpg&auto=webp",
                "https://i.insider.com/5f36af5fe89ebf001f04496b?width=1136&format=jpeg",
                "One of the most complete electric cars money can buy. Superb build quality, and decent to drive.\n" +
                "\n" +
                "The 2021 Polestar 2 pairs handsome design with adequate performance.\n" +
                "\n" +
                "The Polestar has a higher ride height than most sedans, and SUV-like body cladding, making it a bit of a pseudo-crossover. However you classify it, the Polestar 2 is an extremely handsome car, with minimal body surfacing and great proportions.");
        electricVehicleStorage.saveElectricVehicle(polestarTwo);

        ElectricVehicle porscheTaycan = new ElectricVehicle("Porsche", "Taycan", "Elle Driver", "Sedan", 103800.00, true,
                725, 200, 69, 3.4, 155, "RWD", 12, 15, 4, false,
                true, true, 12.9, 2.8, 5.0, false,
                "https://www.motortrend.com/uploads/sites/5/2021/01/2021_Porsche_Taycan_2.jpeg?fit=around%7C875:492.1875",
                "https://i.insider.com/5f36af5fe89ebf001f04496b?width=1136&format=jpeg",
                "Highs: Incredible and repeatable acceleration, drives a lot like a Porsche sports car, can charge quickly.\n" +
                "\n" +
                "Lows: A pain to get in and out of, missing some traditional EV traits, exorbitant price.\n" +
                "\n" +
                "Verdict: The Taycan takes everything good about electric performance cars and amplifies it.");
        electricVehicleStorage.saveElectricVehicle(porscheTaycan);

        ElectricVehicle teslaThree = new ElectricVehicle("Tesla", "Model 3 SR+", "Aldo Raine", "Sedan", 39900.00, false,
                725, 263, 133, 5.3, 140, "RWD", 5.5, 21, 5, true,
                true, true, 18, 5, 5.0, true,
                "https://upload.wikimedia.org/wikipedia/commons/9/91/2019_Tesla_Model_3_Performance_AWD_Front.jpg",
                "https://cdn.mos.cms.futurecdn.net/yX7odtjFCfE9fZZpDtsda6.jpg",
                "Tesla Model 3 Standard Range +  There are four main versions of the Model 3 -- the standard Model 3, the SR+, the Long Range, and the Model 3 Performance.\n" +
                "\n" +
                "So what are all of the possibilities for the Model 3? The two main options? Well, while it sounds like some companies have more to offer than others, the company behind the Model 3 and Model X are both clearly not making it very expensive. Musk told CNBC in February:\n" +
                "\n" +
                "Every new generation of the Model 3 is going to be a little smaller, a little faster, a little sharper and, perhaps most importantly, a little thinner. There's no question that our product line-up is coming along fine, and we're doing very well. It just doesn't seem like that many people are getting this right now. At some point, it's just getting to the point that the Model 3 is one of the most important aspects of our future product.\n" +
                "\n" +
                "He continued:\n" +
                "\n" +
                "The next one will probably be the new Model X, but it will be the first and will be even higher. The only thing we're really aware of is the fact that the Model X was just built as a box for the Model S, which is very different from the box we have now. That's kind of the way that things changed in the past. Now we're working very, very closely with OEMs and manufacturers to make sure that");
        electricVehicleStorage.saveElectricVehicle(teslaThree);

        ElectricVehicle teslaSPlaid = new ElectricVehicle("Tesla", "Model S Plaid", "Bridget Von Hammersmark", "Sedan", 129990.00, false,
                725, 396, 101, 1.99, 200, "AWD", 6.5, 27, 5, true,
                true, true, 25, 3, 5.0, true,
                "https://i.insider.com/605ce29e106eb50019d05a89?width=700",
                "https://motoring.pxcrush.net/motoring/general/editorial/tesla-model-s-2021.jpg?width=1024",
                "With the longest range and quickest acceleration of any electric vehicle in production, Model S Plaid is the highest performing sedan ever built.\n" +
                "\n" +
                "With up to 412-miles of estimated driving range—depending upon model—the S can easily be used for long drives, and the 1020-hp Plaid version can deliver supercar acceleration while seating four adults. The Model S is also practical, with a large rear cargo area and a secondary front-trunk for extra space.");
        electricVehicleStorage.saveElectricVehicle(teslaSPlaid);

        ElectricVehicle teslaX = new ElectricVehicle("Tesla", "Model X LR", "Calvin Candie", "Crossover", 94990.00, false,
                725, 360, 96, 3.8, 155, "AWD", 12, 22, 7, true,
                true, true, 83, 5, 5.0, true,
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/screen-shot-2021-01-27-at-6-16-08-pm-1611789398.png?crop=0.534xw:0.691xh;0.234xw,0.110xh&resize=640:*",
                "https://i.guim.co.uk/img/media/202f28f9d64bcbf12340369c1dfc91c306bc3d49/122_245_1666_999/master/1666.jpg?width=1200&height=900&quality=85&auto=format&fit=crop&s=c80bca7e348e480a531673976412f90c",
                "Tesla Model X – The Tesla Model X is a 'premium' electric vehicle delivered at a premium price. Tesla's low profit margin, lower fuel cost, greater comfort, low cost vehicle manufacturing facilities and low mass production prices have propelled it to the top of US electric vehicle sales in 2021. Its low cost to ownership (LEOV) system has resulted in its high end, affordable Model X being considered the single most affordable luxury electric vehicle crossover under construction for the electric vehicles market.\n" +
                "\n" +
                "The Model X is powered by an NV Energy Model X (formerly dubbed the EV2) and boasts a powerful, battery operated, and battery operated technology that delivers greater reliability and efficiency.");
        electricVehicleStorage.saveElectricVehicle((teslaX));

        ElectricVehicle teslaY = new ElectricVehicle("Tesla", "Model Y LR", "Marquis Warren", "Crossover", 53990.00, false,
                725, 326, 121, 4.8, 135, "AWD", 10, 40, 5, true,
                true, true, 71, 5, 5.0, true,
                "https://www.tesla.com/assets/img/my_fb_s.jpg",
                "https://cdn.motor1.com/images/mgl/Bjw4A/s1/tesla-model-y.jpg",
                "Tesla Model Y: 'To Buy, or Not to Buy?\n" +
                "\n" +
                "But there's way more than just a simple answer to the question of whether to buy or not to buy a Tesla Model Y, and to do that, you need to consider what is already possible here. It's easy to see why this is: Tesla has a much more sophisticated and ambitious plan to drive the market. But what's less obvious is just when — because if the Model Y, like most things, is priced so high, that is, until Tesla is forced to sell you a new Model 3, it'll be just fine.\n" +
                "\n" +
                "To put both the Tesla Model Y as a driver-free Tesla Model 3 into the equation, to be a Model 3, or to become an electric driving luxury, it will be Tesla (or not Tesla), and the Model Y will be one of their very own. And so far we've been able to build models that make the cars we love driving more comfortable for use in public or business areas, like in public transit. But, when we find ourselves stranded in a vehicle where there is no Tesla, or a Tesla Model and we need to turn off the car, like a passenger in a car for an entire trip — like with my current Tesla Model Y, the most likely scenario is that we will have to move. In that case, we'll be forced to pay to maintain our Tesla Model Y's ability to reach into its windshield or floor to power itself.");
        electricVehicleStorage.saveElectricVehicle(teslaY);

        ElectricVehicle volksIdFour = new ElectricVehicle("Volkswagen", "ID.4", 44495.00, true,
                725, 250, 99, 5.7, 112, "AWD", 7.5, 38, 5, false,
                true, true, 30, 0, 4.5, false,
                "https://techcrunch.com/wp-content/uploads/2021/03/vw-Large-12562-2021ID.4ProSwithGradientPackage.jpg?w=730&crop=1");
        electricVehicleStorage.saveElectricVehicle(volksIdFour);

        ElectricVehicle volvoXcForty = new ElectricVehicle("Volvo", "XC40 Recharge", 53990.00, true,
                725, 208, 80, 4.3, 112, "AWD", 11, 40, 5, false,
                true, true, 20, 5, 5.0, true,
                "https://cdn.motor1.com/images/mgl/A8zbL/s1/volvo-xc40-recharge-2020.webp");
        electricVehicleStorage.saveElectricVehicle(volvoXcForty);

        ElectricVehicle audiA6Etron = new ElectricVehicle("Audi", "A6 e-tron", 80000.00, true,
                725, 400, 80, 5.1, 125, "AWD", 10, 30, 5, false,
                true, false, 29.5, 3, 4.5, false,
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/audi-a6-e-tron-concept-113-1618585274.jpg?crop=0.739xw:0.494xh;0.0369xw,0.346xh&resize=1200:*");
        electricVehicleStorage.saveElectricVehicle(audiA6Etron);

        ElectricVehicle bmwIFour = new ElectricVehicle("BMW", "I4", 56395.00, true,
                725, 300, 90, 5.7, 118, "RWD", 8.75, 30, 5, false,
                true, true, 16.6, 0, 4.5, true,
                "https://www.cnet.com/a/img/-fC9r7EA4SUrpAJVm211h2aGZ7I=/940x0/2020/02/28/4f5e69fe-2497-494c-b738-24f864561236/bmw-i4-concept-003.jpg");
        electricVehicleStorage.saveElectricVehicle(bmwIFour);

        ElectricVehicle bmwIX = new ElectricVehicle("BMW", "IX", 84194.00, true,
                725, 300, 85, 4.6, 124, "AWD", 11, 35, 5, false,
                true, true, 27.4, 0, 4.5, true,
                "https://cdn.motor1.com/images/mgl/Kj0qM/s1/bmw-ix.jpg");
        electricVehicleStorage.saveElectricVehicle(bmwIX);

        ElectricVehicle bollingerBTwo = new ElectricVehicle("Bollinger", "B2", 125000.00, true,
                725, 200, 70, 4.5, 100, "AWD", 10, 75, 4, false,
                false, false, 86, 8.0, 4.0, false,
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/bollinger-b2-201-1607721643.jpg");
        electricVehicleStorage.saveElectricVehicle(bollingerBTwo);

        ElectricVehicle caddyLyriq = new ElectricVehicle("Cadillac", "Lyriq", 59995.00, true,
                725, 300, 80, 4.3, 130, "RWD", 6, 35, 7, true,
                true, true, 12.6, 0, 4.5, false,
                "https://i0.wp.com/electrek.co/wp-content/uploads/sites/3/2021/04/Cadillac-Lyriq-2.jpg?ssl=1");
        electricVehicleStorage.saveElectricVehicle(caddyLyriq);

        ElectricVehicle fordLightning = new ElectricVehicle("Ford", "F-150 Lightning", 42000.00, true,
                725, 230, 75, 4.5, 100, "AWD", 8, 44, 5, true,
                true, true, 80, 14.1, 5.0, true,
                "https://cdn.motor1.com/images/mgl/3yeZp/s1/2022-ford-f-150-lightning-side-view.webp");
        electricVehicleStorage.saveElectricVehicle(fordLightning);

        ElectricVehicle genesisGEighty = new ElectricVehicle("Genesis", "G80", 50000.00, true,
                725, 310, 90, 4.8, 100, "e-AWD", 9, 22, 5, false,
                true, false, 13.1, 0, 4.5, true,
                "https://www.motortrend.com/uploads/sites/5/2020/03/2021-Genesis-G80-4.jpg");
        electricVehicleStorage.saveElectricVehicle(genesisGEighty);

        ElectricVehicle gmcHummer = new ElectricVehicle("GMC", "Hummer EV", 79995.00, true,
                725, 350, 75, 3.0, 100, "AWD", 12, 30, 5, true,
                true, false, 80, 11.3, 4.5, true,
                "https://www.motortrend.com/uploads/sites/5/2020/10/2022-GMC-Hummer-EV-03.jpg");
        electricVehicleStorage.saveElectricVehicle(gmcHummer);

        ElectricVehicle hyundaiIoniqFive = new ElectricVehicle("Hyundai", "Ioniq 5", 45000.00, true,
                725, 225, 125, 5.2, 115, "AWD", 7.75, 18, 5, false,
                true, false, 18.8, 0.85, 4.5, true,
                "https://www.topgear.com/sites/default/files/images/news-article/2021/02/fa6aac51e8f8f99b67802fbec8432e04/ioniq5kvs_4.jpg");
        electricVehicleStorage.saveElectricVehicle(hyundaiIoniqFive);

        ElectricVehicle jeepMagneto = new ElectricVehicle("Jeep", "Wrangler Magneto", 52500.00, true,
                725, 200, 95, 6.8, 120, "AWD", 9, 45, 4, false,
                true, false, 17, 0, 4.0, false,
                "https://www.motortrend.com/uploads/sites/5/2021/03/Jeep-Magneto-1.jpg?fit=around%7C875:492");
        electricVehicleStorage.saveElectricVehicle(jeepMagneto);

        ElectricVehicle kiaEvSix = new ElectricVehicle("Kia", "EV6", 45000.00, true,
                725, 270, 110, 5.2, 115, "RWD", 7, 18, 5, false,
                true, false, 28, 0, 4.5, true,
                "https://cimg0.ibsrv.net/ibimg/hgm/1920x1080-1/100/786/2022-kia-ev6_100786824.jpg");
        electricVehicleStorage.saveElectricVehicle(kiaEvSix);

        ElectricVehicle mercedesEqa = new ElectricVehicle("Mercedes-Benz", "EQA", 57000.00, true,
                725, 250, 100, 7.0, 99, "AWD", 7.25, 35, 5, false,
                true, false, 12, 0, 4.5, true,
                "https://s.yimg.com/os/creatr-uploaded-images/2021-01/99601910-5b08-11eb-abff-1193b560fe7f");
        electricVehicleStorage.saveElectricVehicle(mercedesEqa);

        ElectricVehicle nissaAriya = new ElectricVehicle("Nissan", "Ariya", 40000.00, true,
                725, 300, 105, 7.5, 99, "FWD", 10, 31, 5, true,
                true, false, 16.5, 0, 4.5, false,
                "https://www.cnet.com/a/img/u8T28wvt1gBqp47Rm_6jxBeia08=/1200x675/2021/03/19/0bb10fed-d925-47c0-ba90-a4b42837b7a3/ogi-nissan.jpg");
        electricVehicleStorage.saveElectricVehicle(nissaAriya);

        ElectricVehicle rivianROneT = new ElectricVehicle("Rivian", "R1T", 73000.00, true,
                725, 300, 80, 3.0, 100, "AWD", 10, 35, 5, true,
                true, true, 57, 11.0, 4.5, false,
                "https://cdn.motor1.com/images/mgl/B37xA/s3/rivian-r1t-c-2020-jeff-johnson.jpg");
        electricVehicleStorage.saveElectricVehicle(rivianROneT);

        ElectricVehicle teslaCybertruck = new ElectricVehicle("Tesla", "Cybertruck", 70000.00, false,
                725, 500, 90, 3.0, 130, "AWD", 10, 44, 6, true,
                true, true, 90, 10.0, 5.0, true,
                "https://i.gaw.to/content/photos/45/28/452817-le-tesla-cybertruck-ne-sera-finalement-pas-pret-avant-2022.jpeg?460x287");
        electricVehicleStorage.saveElectricVehicle(teslaCybertruck);

        ElectricVehicle teslaRoadsterTwo = new ElectricVehicle("Tesla", "Roadster 2", 200000.00, false,
                725, 620, 90, 1.9, 250, "AWD", 8, 44, 4, true,
                true, true, 15, 4.0, 5.0, true,
                "https://cdn.vox-cdn.com/thumbor/HTcou-2jE-vt33LaXJN_tmmN4pY=/0x0:3840x2160/1400x933/filters:focal(1562x816:2176x1430):no_upscale()/cdn.vox-cdn.com/uploads/chorus_image/image/57642853/Roadster_Front_58.0.jpg");
        electricVehicleStorage.saveElectricVehicle(teslaRoadsterTwo);


    }
}
