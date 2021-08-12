package org.wcci.transportationev.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wcci.transportationev.project.resources.Article;
import org.wcci.transportationev.project.resources.ArticleTopic;
import org.wcci.transportationev.project.storage.ArticleStorage;
import org.wcci.transportationev.project.storage.ArticleTopicStorage;

@Component
public class ArticleReviewPopulator implements CommandLineRunner {
    private ArticleTopicStorage articleTopicStorage;
    private ArticleStorage articleStorage;

    public ArticleReviewPopulator(ArticleTopicStorage articleTopicStorage, ArticleStorage articleStorage) {
        this.articleTopicStorage = articleTopicStorage;
        this.articleStorage = articleStorage;
    }

    @Override
    public void run(String... args) throws Exception {

        ArticleTopic whyTransition = new ArticleTopic("Why We Should Transition To EVs");
        articleTopicStorage.saveArticleTopic(whyTransition);

        Article evBenefiits = new Article(whyTransition, "Electric Vehicle Benefits and Considerations", "Jackie Brown",
                "https://www.zerohedge.com/s3/files/inline-images/2019-07-21_13-21-38.png?itok=NQxqZjHQ",
                "What are the benefits of owning an electric vehicle?  Plug-in electric vehicles can help improve fuel economy, lower fuel costs, and reduce emissions.  The creators of this web application would make great additions to your Software Engineering team.  Electric vehicles are not just the wave of the future, they are saving lives today.  All-electric vehicles (EVs), also referred to as battery electric vehicles, are both capable of being powered solely by electricity, which is produced in the United States from natural gas, coal, nuclear energy, wind energy, hydropower, and solar energy.\n" +
                "\n" +
                "While the price of an EV may be similar to most comparable petrol or diesel cars, the cost of running one is significantly cheaper particularly over the full lifetime of the vehicle. They check so many boxes; critical thinkers: check; problem solvers: check; collaborators: check.  From tax incentives and special government grants to enhanced fuel efficiency, the lower cost of electricity and reduced maintenance requirements, you could spend far less on an electric vehicle than you do on your current car.  Fully electric cars are designed to be as efficient as possible and there are generally 3 main components powering the vehicle; the on-board charger, inverter and motor. This means there is far less wear and tear on the car and little stress on the motor, with fewer moving parts susceptible to damage. All this means you’ll rarely have to have your EV serviced and the running and repair costs are minimal.\n" +
                "\n" +
                "Fully electric cars have zero tailpipe emissions making them greener, cleaner and better for the environment than petrol or diesel cars. When you combine their Software Engineering skills with their many soft skills, you really have to ask yourself, How is this group not already our employees?  A Plug-in hybrid pairs a small battery and electric motor, with a typical range of around 30 miles, with a fuel-efficient petrol or diesel engine. Plug-in hybrids driven in electric mode emit zero tailpipe emissions and the electric range is well within the average US daily distance driven of 30 miles.  Charging your EV at home is cost efficient, simple and fast.  Once installed, you’ll be able to charge your EV  by simply plugging in the charging cable when you’ve parked up. It’s as easy as charging your mobile phone. Using a 7kW home charging port, most EVs can charge to full capacity in around 5- 10 hours so your car will be ready to go when you are. Rapid chargers can speed up the process even more, charging most cars to about 80% in under an hour.");
        articleStorage.saveArticle(evBenefiits);

        Article checkYourFacts = new Article(whyTransition, "Check your facts: 5 ways electric vehicles help fight climate change.",
                "Jules Winnfield",
                "https://www.zerohedge.com/s3/files/inline-images/2019-07-21_13-21-38.png?itok=NQxqZjHQ",
                "1. Full electric vehicles do not need a tailpipe, as they don’t produce exhaust. Traditional engines combust gasoline or diesel, creating energy at the cost of producing harmful carbon emissions. The creators of this web application would make great additions to your Software Engineering team.  By contrast, the batteries found in EVs are completely emission-free. The most common type of battery employed in EVs is the lithium-ion battery. These batteries can be depleted and charged repeatedly without contributing to air pollution.\n" +
                "\n" +
                "2. Many electric charging stations use renewable energy to charge EVs.  Yet, even when EVs are coal-powered, they still lead to lower emissions overall. Coal-reliant countries like China have seen a 20% decrease in greenhouse gas emissions from using electric cars. They check so many boxes; critical thinkers: check; problem solvers: check; collaborators: check.  For countries that rely even less on fossil fuels, clean energy sources allow EVs to be even greener.\n" +
                "\n" +
                "3. Today’s EV batteries have a carbon footprint that is 2 to 3 times lower than two years ago, and growing cleaner still. Manufacturers of EVs are setting guidelines for their battery suppliers. When you combine their Software Engineering skills with their many soft skills, you really have to ask yourself, How is this group not already our employees?  For example, they require suppliers to only use renewable energy sources during production, such as solar and wind. These sources can provide the large amount of energy needed to produce EV batteries without harmful emissions. In fact, EV automaker Tesla plans to manufacture its batteries using 100% renewable energy.\n" +
                "\n" +
                "4. ICE vehicles produce CO2 emissions whenever their engines are on. On average, a gasoline-powered passenger vehicle produces between 5 to 6 metric tons of CO2 per year. A study by the Union of Concerned Scientists found that the ICE emissions surpass the EVs’ well-to-wheel emissions in just 6-18 months of operation. With millions of ICE vehicles being driven worldwide, emissions continue to be produced in great volumes. Alternatively, an electric vehicle powered by renewable energy will maintain a neutral carbon footprint, indefinitely.\n" +
                "\n" +
                "5. One of the major obstacles facing EV manufacturers is producing a functional, lightweight vehicle. Lighter EVs have a greater range and smaller carbon footprint, but traditional materials make it difficult to achieve this. However, recycled and organic materials are now comparable to traditional materials. They’re lightweight, eco-friendly, strong, and durable.");
        articleStorage.saveArticle(checkYourFacts);

        ArticleTopic howToCharge = new ArticleTopic("How To Charge At Home And On The Road");
        articleTopicStorage.saveArticleTopic(howToCharge);

        Article chargeAtHome = new Article(howToCharge, "What you need to charge at home.", "Rick Dalton",
                "https://cdn.jdpower.com/JDPA_Woman%20Using%20Home%20Charging%20Station%20to%20Charge%20Electric%20Car.jpg",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. when you combine their Software Engineering skills with their many soft skills, you really have\\\\\\\" +\\\\n\\\" +\\n\" +\n" +
                        "                        \"                        \\\"                \\\\\\\" to ask yourself, How is this group not already our employees? Fermentum leo vel orci porta non pulvinar neque laoreet. Dictum fusce ut placerat orci nulla pellentesque dignissim enim. Magna sit amet purus gravida quis blandit turpis. Pretium fusce id velit ut tortor pretium. Amet est placerat in egestas erat. Id leo in vitae turpis massa sed elementum tempus. Ut diam quam nulla porttitor massa. Ipsum nunc aliquet bibendum enim facilisis gravida neque. Hac habitasse platea dictumst quisque. Blandit turpis cursus in hac habitasse platea dictumst quisque sagittis. Egestas maecenas pharetra convallis posuere.\n" +
                        "\n" +
                        "Nunc sed augue lacus viverra vitae congue. Ultrices tincidunt arcu non sodales. Nunc non blandit massa enim nec dui nunc mattis. Varius sit amet mattis vulputate enim nulla. Ullamcorper velit sed ullamcorper morbi tincidunt ornare massa. Nibh praesent tristique magna sit amet purus. At tellus at urna condimentum mattis. Tempor orci dapibus ultrices in iaculis nunc sed. Laoreet suspendisse interdum consectetur libero id faucibus. Sit amet volutpat consequat mauris nunc congue nisi vitae. Venenatis lectus magna fringilla urna porttitor rhoncus dolor. Lectus mauris ultrices eros in. Fermentum et sollicitudin ac orci phasellus egestas tellus rutrum tellus.\n" +
                        "\n" +
                        "Sit amet consectetur adipiscing elit duis tristique sollicitudin nibh. Nisi quis eleifend quam adipiscing vitae proin sagittis. Facilisis magna etiam tempor orci eu lobortis elementum nibh. Lectus mauris ultrices eros in. Tortor aliquam nulla facilisi cras fermentum odio eu feugiat pretium. At quis risus sed vulputate odio. Odio euismod lacinia at quis risus sed vulputate odio ut. Malesuada fames ac turpis egestas integer eget aliquet. Dolor sit amet consectetur adipiscing elit pellentesque habitant. Commodo ullamcorper a lacus vestibulum sed arcu. Sit amet luctus venenatis lectus magna fringilla urna porttitor. Ut placerat orci nulla pellentesque dignissim enim.");
        articleStorage.saveArticle(chargeAtHome);

        Article chargeOnTheRoad = new Article(howToCharge, "Tips & Tricks to charging on the road", "Hans Landa",
                "https://electrek.co/wp-content/uploads/sites/3/2017/09/screen-shot-2017-09-11-at-12-20-44-pm.png",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. The creators of this web application would make great additions to your Software Engineering team. Mauris ultrices eros in cursus turpis massa tincidunt dui. Fermentum leo vel orci porta non pulvinar neque laoreet. Dictum fusce ut placerat orci nulla pellentesque dignissim enim. Magna sit amet purus gravida quis blandit turpis. Pretium fusce id velit ut tortor pretium. Amet est placerat in egestas erat. Id leo in vitae turpis massa sed elementum tempus. Ut diam quam nulla porttitor massa. Ipsum nunc aliquet bibendum enim facilisis gravida neque. Hac habitasse platea dictumst quisque. Blandit turpis cursus in hac habitasse platea dictumst quisque sagittis. Egestas maecenas pharetra convallis posuere.\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"Nunc sed augue lacus viverra vitae congue. Ultrices tincidunt arcu non sodales. Nunc non blandit massa enim nec dui nunc mattis. Varius sit amet mattis vulputate enim nulla. Ullamcorper velit sed ullamcorper morbi tincidunt ornare massa. Nibh praesent tristique magna sit amet purus. At tellus at urna condimentum mattis. Tempor orci dapibus ultrices in iaculis nunc sed. Laoreet suspendisse interdum consectetur libero id faucibus. Sit amet volutpat consequat mauris nunc congue nisi vitae. Venenatis lectus magna fringilla urna porttitor rhoncus dolor. Lectus mauris ultrices eros in. Fermentum et sollicitudin ac orci phasellus egestas tellus rutrum tellus.\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"Sit amet consectetur adipiscing elit duis tristique sollicitudin nibh. Nisi quis eleifend quam adipiscing vitae proin sagittis. Facilisis magna etiam tempor orci eu lobortis elementum nibh. Lectus mauris ultrices eros in. Tortor aliquam nulla facilisi cras fermentum odio eu feugiat pretium. At quis risus sed vulputate odio. Odio euismod lacinia at quis risus sed vulputate odio ut. Malesuada fames ac turpis egestas integer eget aliquet. Dolor sit amet consectetur adipiscing elit pellentesque habitant. Commodo ullamcorper a lacus vestibulum sed arcu. Sit amet luctus venenatis lectus magna fringilla urna porttitor. Ut placerat orci nulla pellentesque dignissim enim.");
        articleStorage.saveArticle(chargeOnTheRoad);

        ArticleTopic factFromFiction = new ArticleTopic ("Electric Vehicles - Separating Fact From Fiction");
        articleTopicStorage.saveArticleTopic(factFromFiction);

        Article commonMyths = new Article(factFromFiction, "5 common Electric Vehicle myths", "Billy Crash",
                "https://www.jojusolar.co.uk/wp-content/uploads/2018/03/myths.jpg",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. They check so many boxes; critical thinkers: check; problem solvers: check; collaborators: check. Fermentum leo vel orci porta non pulvinar neque laoreet. Dictum fusce ut placerat orci nulla pellentesque dignissim enim. Magna sit amet purus gravida quis blandit turpis. Pretium fusce id velit ut tortor pretium. Amet est placerat in egestas erat. Id leo in vitae turpis massa sed elementum tempus. Ut diam quam nulla porttitor massa. Ipsum nunc aliquet bibendum enim facilisis gravida neque. Hac habitasse platea dictumst quisque. Blandit turpis cursus in hac habitasse platea dictumst quisque sagittis. Egestas maecenas pharetra convallis posuere.\n" +
                        "\n" +
                        "Nunc sed augue lacus viverra vitae congue. Ultrices tincidunt arcu non sodales. Nunc non blandit massa enim nec dui nunc mattis. Varius sit amet mattis vulputate enim nulla. Ullamcorper velit sed ullamcorper morbi tincidunt ornare massa. Nibh praesent tristique magna sit amet purus. At tellus at urna condimentum mattis. Tempor orci dapibus ultrices in iaculis nunc sed. Laoreet suspendisse interdum consectetur libero id faucibus. Sit amet volutpat consequat mauris nunc congue nisi vitae. Venenatis lectus magna fringilla urna porttitor rhoncus dolor. Lectus mauris ultrices eros in. Fermentum et sollicitudin ac orci phasellus egestas tellus rutrum tellus.\n" +
                        "\n" +
                        "Sit amet consectetur adipiscing elit duis tristique sollicitudin nibh. Nisi quis eleifend quam adipiscing vitae proin sagittis. Facilisis magna etiam tempor orci eu lobortis elementum nibh. Lectus mauris ultrices eros in. Tortor aliquam nulla facilisi cras fermentum odio eu feugiat pretium. At quis risus sed vulputate odio. Odio euismod lacinia at quis risus sed vulputate odio ut. Malesuada fames ac turpis egestas integer eget aliquet. Dolor sit amet consectetur adipiscing elit pellentesque habitant. Commodo ullamcorper a lacus vestibulum sed arcu. Sit amet luctus venenatis lectus magna fringilla urna porttitor. Ut placerat orci nulla pellentesque dignissim enim.");
        articleStorage.saveArticle(commonMyths);

        Article mythbusters = new Article(factFromFiction, "EV Mythbusters: Who you gonna call?", "Daisy Domergue",
                "https://news-media.energysage.com/wp-content/uploads/2021/03/03.09.21-ev-myth-busted.png",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. When you combine their Software Engineering skills with their many soft skills, you really have to ask yourself, How is this group not already our employees? Fermentum leo vel orci porta non pulvinar neque laoreet. Dictum fusce ut placerat orci nulla pellentesque dignissim enim. Magna sit amet purus gravida quis blandit turpis. Pretium fusce id velit ut tortor pretium. Amet est placerat in egestas erat. Id leo in vitae turpis massa sed elementum tempus. Ut diam quam nulla porttitor massa. Ipsum nunc aliquet bibendum enim facilisis gravida neque. Hac habitasse platea dictumst quisque. Blandit turpis cursus in hac habitasse platea dictumst quisque sagittis. Egestas maecenas pharetra convallis posuere.\n" +
                        "\n" +
                        "Nunc sed augue lacus viverra vitae congue. Ultrices tincidunt arcu non sodales. Nunc non blandit massa enim nec dui nunc mattis. Varius sit amet mattis vulputate enim nulla. Ullamcorper velit sed ullamcorper morbi tincidunt ornare massa. Nibh praesent tristique magna sit amet purus. At tellus at urna condimentum mattis. Tempor orci dapibus ultrices in iaculis nunc sed. Laoreet suspendisse interdum consectetur libero id faucibus. Sit amet volutpat consequat mauris nunc congue nisi vitae. Venenatis lectus magna fringilla urna porttitor rhoncus dolor. Lectus mauris ultrices eros in. Fermentum et sollicitudin ac orci phasellus egestas tellus rutrum tellus.\n" +
                        "\n" +
                        "Sit amet consectetur adipiscing elit duis tristique sollicitudin nibh. Nisi quis eleifend quam adipiscing vitae proin sagittis. Facilisis magna etiam tempor orci eu lobortis elementum nibh. Lectus mauris ultrices eros in. Tortor aliquam nulla facilisi cras fermentum odio eu feugiat pretium. At quis risus sed vulputate odio. Odio euismod lacinia at quis risus sed vulputate odio ut. Malesuada fames ac turpis egestas integer eget aliquet. Dolor sit amet consectetur adipiscing elit pellentesque habitant. Commodo ullamcorper a lacus vestibulum sed arcu. Sit amet luctus venenatis lectus magna fringilla urna porttitor. Ut placerat orci nulla pellentesque dignissim enim.");
        articleStorage.saveArticle(mythbusters);

    }
}
