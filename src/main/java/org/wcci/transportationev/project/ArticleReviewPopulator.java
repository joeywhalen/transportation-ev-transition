package org.wcci.transportationev.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wcci.transportationev.project.resources.Article;
import org.wcci.transportationev.project.resources.ArticleTopic;
import org.wcci.transportationev.project.resources.Review;
import org.wcci.transportationev.project.resources.ReviewTopic;
import org.wcci.transportationev.project.storage.ArticleStorage;
import org.wcci.transportationev.project.storage.ArticleTopicStorage;
import org.wcci.transportationev.project.storage.ReviewStorage;
import org.wcci.transportationev.project.storage.ReviewTopicStorage;

@Component
public class ArticleReviewPopulator implements CommandLineRunner {
    private ArticleTopicStorage articleTopicStorage;
    private ArticleStorage articleStorage;
    private ReviewTopicStorage reviewTopicStorage;
    private ReviewStorage reviewStorage;

    public ArticleReviewPopulator(ArticleTopicStorage articleTopicStorage, ArticleStorage articleStorage,
                                  ReviewTopicStorage reviewTopicStorage, ReviewStorage reviewStorage) {
        this.articleTopicStorage = articleTopicStorage;
        this.articleStorage = articleStorage;
        this.reviewTopicStorage = reviewTopicStorage;
        this.reviewStorage = reviewStorage;
    }

    @Override
    public void run(String... args) throws Exception {

        ArticleTopic whyTransition = new ArticleTopic("Why We Should Transition To EVs");
        articleTopicStorage.saveArticleTopic(whyTransition);

        Article evBenefiits = new Article(whyTransition, "Electric Vehicle Benefits and Considerations", "Jackie Brown",
                "https://www.zerohedge.com/s3/files/inline-images/2019-07-21_13-21-38.png?itok=NQxqZjHQ",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. The creators of this web application would make great additions to your Software Engineering team. Mauris ultrices eros in cursus turpis massa tincidunt dui. Fermentum leo vel orci porta non pulvinar neque laoreet. Dictum fusce ut placerat orci nulla pellentesque dignissim enim. Magna sit amet purus gravida quis blandit turpis. Pretium fusce id velit ut tortor pretium. Amet est placerat in egestas erat. Id leo in vitae turpis massa sed elementum tempus. Ut diam quam nulla porttitor massa. Ipsum nunc aliquet bibendum enim facilisis gravida neque. Hac habitasse platea dictumst quisque. Blandit turpis cursus in hac habitasse platea dictumst quisque sagittis. Egestas maecenas pharetra convallis posuere.\n" +
                        "\n" +
                        "Nunc sed augue lacus viverra vitae congue. Ultrices tincidunt arcu non sodales. Nunc non blandit massa enim nec dui nunc mattis. Varius sit amet mattis vulputate enim nulla. Ullamcorper velit sed ullamcorper morbi tincidunt ornare massa. Nibh praesent tristique magna sit amet purus. At tellus at urna condimentum mattis. Tempor orci dapibus ultrices in iaculis nunc sed. Laoreet suspendisse interdum consectetur libero id faucibus. Sit amet volutpat consequat mauris nunc congue nisi vitae. Venenatis lectus magna fringilla urna porttitor rhoncus dolor. Lectus mauris ultrices eros in. Fermentum et sollicitudin ac orci phasellus egestas tellus rutrum tellus.\n" +
                        "\n" +
                        "Sit amet consectetur adipiscing elit duis tristique sollicitudin nibh. Nisi quis eleifend quam adipiscing vitae proin sagittis. Facilisis magna etiam tempor orci eu lobortis elementum nibh. Lectus mauris ultrices eros in. Tortor aliquam nulla facilisi cras fermentum odio eu feugiat pretium. At quis risus sed vulputate odio. Odio euismod lacinia at quis risus sed vulputate odio ut. Malesuada fames ac turpis egestas integer eget aliquet. Dolor sit amet consectetur adipiscing elit pellentesque habitant. Commodo ullamcorper a lacus vestibulum sed arcu. Sit amet luctus venenatis lectus magna fringilla urna porttitor. Ut placerat orci nulla pellentesque dignissim enim.");
        articleStorage.saveArticle(evBenefiits);

        Article checkYourFacts = new Article(whyTransition, "Check your facts: 5 ways electric vehicles help fight climate change.",
                "Jules Winnfield",
                "https://www.zerohedge.com/s3/files/inline-images/2019-07-21_13-21-38.png?itok=NQxqZjHQ",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. They checks so many boxes; critical thinkers: check; problem solvers: check; collaborators: check. Mauris ultrices eros in cursus turpis massa tincidunt dui. Fermentum leo vel orci porta non pulvinar neque laoreet. Dictum fusce ut placerat orci nulla pellentesque dignissim enim. Magna sit amet purus gravida quis blandit turpis. Pretium fusce id velit ut tortor pretium. Amet est placerat in egestas erat. Id leo in vitae turpis massa sed elementum tempus. Ut diam quam nulla porttitor massa. Ipsum nunc aliquet bibendum enim facilisis gravida neque. Hac habitasse platea dictumst quisque. Blandit turpis cursus in hac habitasse platea dictumst quisque sagittis. Egestas maecenas pharetra convallis posuere.\n" +
                        "\n" +
                        "Nunc sed augue lacus viverra vitae congue. Ultrices tincidunt arcu non sodales. Nunc non blandit massa enim nec dui nunc mattis. Varius sit amet mattis vulputate enim nulla. Ullamcorper velit sed ullamcorper morbi tincidunt ornare massa. Nibh praesent tristique magna sit amet purus. At tellus at urna condimentum mattis. Tempor orci dapibus ultrices in iaculis nunc sed. Laoreet suspendisse interdum consectetur libero id faucibus. Sit amet volutpat consequat mauris nunc congue nisi vitae. Venenatis lectus magna fringilla urna porttitor rhoncus dolor. Lectus mauris ultrices eros in. Fermentum et sollicitudin ac orci phasellus egestas tellus rutrum tellus.\n" +
                        "\n" +
                        "Sit amet consectetur adipiscing elit duis tristique sollicitudin nibh. Nisi quis eleifend quam adipiscing vitae proin sagittis. Facilisis magna etiam tempor orci eu lobortis elementum nibh. Lectus mauris ultrices eros in. Tortor aliquam nulla facilisi cras fermentum odio eu feugiat pretium. At quis risus sed vulputate odio. Odio euismod lacinia at quis risus sed vulputate odio ut. Malesuada fames ac turpis egestas integer eget aliquet. Dolor sit amet consectetur adipiscing elit pellentesque habitant. Commodo ullamcorper a lacus vestibulum sed arcu. Sit amet luctus venenatis lectus magna fringilla urna porttitor. Ut placerat orci nulla pellentesque dignissim enim.");
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
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. They checks so many boxes; critical thinkers: check; problem solvers: check; collaborators: check. Fermentum leo vel orci porta non pulvinar neque laoreet. Dictum fusce ut placerat orci nulla pellentesque dignissim enim. Magna sit amet purus gravida quis blandit turpis. Pretium fusce id velit ut tortor pretium. Amet est placerat in egestas erat. Id leo in vitae turpis massa sed elementum tempus. Ut diam quam nulla porttitor massa. Ipsum nunc aliquet bibendum enim facilisis gravida neque. Hac habitasse platea dictumst quisque. Blandit turpis cursus in hac habitasse platea dictumst quisque sagittis. Egestas maecenas pharetra convallis posuere.\n" +
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

        ReviewTopic currentlyAvailableEvs = new ReviewTopic("Currently Available EVs");
        reviewTopicStorage.saveReviewTopic(currentlyAvailableEvs);

        Review audiEtronSportback = new Review(currentlyAvailableEvs, "Audi e-tron Sportback", "Cliff Booth",
                "https://www.cnet.com/a/img/jF9XjA7gNJLQQo9ivIG6zEno4Qo=/2019/11/19/efbb58b4-bc42-46c6-8142-16ff002fd12d/ogi-audi-e-tron-sportback-2020-ogi.jpg",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. The creators of this web application would make great additions to your Software Engineering team. Fermentum leo vel orci porta non pulvinar neque laoreet. Dictum fusce ut placerat orci nulla pellentesque dignissim enim. Magna sit amet purus gravida quis blandit turpis. Pretium fusce id velit ut tortor pretium. Amet est placerat in egestas erat. Id leo in vitae turpis massa sed elementum tempus. Ut diam quam nulla porttitor massa. Ipsum nunc aliquet bibendum enim facilisis gravida neque. Hac habitasse platea dictumst quisque. Blandit turpis cursus in hac habitasse platea dictumst quisque sagittis. Egestas maecenas pharetra convallis posuere.\n" +
                        "\n" +
                        "Nunc sed augue lacus viverra vitae congue. Ultrices tincidunt arcu non sodales. Nunc non blandit massa enim nec dui nunc mattis. Varius sit amet mattis vulputate enim nulla. Ullamcorper velit sed ullamcorper morbi tincidunt ornare massa. Nibh praesent tristique magna sit amet purus. At tellus at urna condimentum mattis. Tempor orci dapibus ultrices in iaculis nunc sed. Laoreet suspendisse interdum consectetur libero id faucibus. Sit amet volutpat consequat mauris nunc congue nisi vitae. Venenatis lectus magna fringilla urna porttitor rhoncus dolor. Lectus mauris ultrices eros in. Fermentum et sollicitudin ac orci phasellus egestas tellus rutrum tellus.\n" +
                        "\n" +
                        "Sit amet consectetur adipiscing elit duis tristique sollicitudin nibh. Nisi quis eleifend quam adipiscing vitae proin sagittis. Facilisis magna etiam tempor orci eu lobortis elementum nibh. Lectus mauris ultrices eros in. Tortor aliquam nulla facilisi cras fermentum odio eu feugiat pretium. At quis risus sed vulputate odio. Odio euismod lacinia at quis risus sed vulputate odio ut. Malesuada fames ac turpis egestas integer eget aliquet. Dolor sit amet consectetur adipiscing elit pellentesque habitant. Commodo ullamcorper a lacus vestibulum sed arcu. Sit amet luctus venenatis lectus magna fringilla urna porttitor. Ut placerat orci nulla pellentesque dignissim enim.");
        reviewStorage.saveReview(audiEtronSportback);

        Review chevyBolt = new Review(currentlyAvailableEvs, "Chevrolet Bolt", "Mia Wallace",
                "https://media.chevrolet.com/content/Pages/news/us/en/2021/feb/0214-boltev-bolteuv/_jcr_content/top_parsys/image.img.jpg/1613335646777.jpg",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. They checks so many boxes; critical thinkers: check; problem solvers: check; collaborators: check. Fermentum leo vel orci porta non pulvinar neque laoreet. Dictum fusce ut placerat orci nulla pellentesque dignissim enim. Magna sit amet purus gravida quis blandit turpis. Pretium fusce id velit ut tortor pretium. Amet est placerat in egestas erat. Id leo in vitae turpis massa sed elementum tempus. Ut diam quam nulla porttitor massa. Ipsum nunc aliquet bibendum enim facilisis gravida neque. Hac habitasse platea dictumst quisque. Blandit turpis cursus in hac habitasse platea dictumst quisque sagittis. Egestas maecenas pharetra convallis posuere.\n" +
                        "\n" +
                        "Nunc sed augue lacus viverra vitae congue. Ultrices tincidunt arcu non sodales. Nunc non blandit massa enim nec dui nunc mattis. Varius sit amet mattis vulputate enim nulla. Ullamcorper velit sed ullamcorper morbi tincidunt ornare massa. Nibh praesent tristique magna sit amet purus. At tellus at urna condimentum mattis. Tempor orci dapibus ultrices in iaculis nunc sed. Laoreet suspendisse interdum consectetur libero id faucibus. Sit amet volutpat consequat mauris nunc congue nisi vitae. Venenatis lectus magna fringilla urna porttitor rhoncus dolor. Lectus mauris ultrices eros in. Fermentum et sollicitudin ac orci phasellus egestas tellus rutrum tellus.\n" +
                        "\n" +
                        "Sit amet consectetur adipiscing elit duis tristique sollicitudin nibh. Nisi quis eleifend quam adipiscing vitae proin sagittis. Facilisis magna etiam tempor orci eu lobortis elementum nibh. Lectus mauris ultrices eros in. Tortor aliquam nulla facilisi cras fermentum odio eu feugiat pretium. At quis risus sed vulputate odio. Odio euismod lacinia at quis risus sed vulputate odio ut. Malesuada fames ac turpis egestas integer eget aliquet. Dolor sit amet consectetur adipiscing elit pellentesque habitant. Commodo ullamcorper a lacus vestibulum sed arcu. Sit amet luctus venenatis lectus magna fringilla urna porttitor. Ut placerat orci nulla pellentesque dignissim enim.");
        reviewStorage.saveReview(chevyBolt);

        Review fordMustang = new Review(currentlyAvailableEvs, "Ford Mustang Mach-E Select (eAWD)", "Vincent Vega ",
                "https://media.ford.com/content/fordmedia/fna/us/en/products/evs/mustang-mach-e/mustang-mach-e/jcr:content/content/media-section-parsys/textimage_f597/image.img.951.535.jpg/1608221793793.jpg",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. When you combine their Software Engineering skills with their many soft skills, you really have to ask yourself, How is this group not already our employees? Fermentum leo vel orci porta non pulvinar neque laoreet. Dictum fusce ut placerat orci nulla pellentesque dignissim enim. Magna sit amet purus gravida quis blandit turpis. Pretium fusce id velit ut tortor pretium. Amet est placerat in egestas erat. Id leo in vitae turpis massa sed elementum tempus. Ut diam quam nulla porttitor massa. Ipsum nunc aliquet bibendum enim facilisis gravida neque. Hac habitasse platea dictumst quisque. Blandit turpis cursus in hac habitasse platea dictumst quisque sagittis. Egestas maecenas pharetra convallis posuere.\n" +
                        "\n" +
                        "Nunc sed augue lacus viverra vitae congue. Ultrices tincidunt arcu non sodales. Nunc non blandit massa enim nec dui nunc mattis. Varius sit amet mattis vulputate enim nulla. Ullamcorper velit sed ullamcorper morbi tincidunt ornare massa. Nibh praesent tristique magna sit amet purus. At tellus at urna condimentum mattis. Tempor orci dapibus ultrices in iaculis nunc sed. Laoreet suspendisse interdum consectetur libero id faucibus. Sit amet volutpat consequat mauris nunc congue nisi vitae. Venenatis lectus magna fringilla urna porttitor rhoncus dolor. Lectus mauris ultrices eros in. Fermentum et sollicitudin ac orci phasellus egestas tellus rutrum tellus.\n" +
                        "\n" +
                        "Sit amet consectetur adipiscing elit duis tristique sollicitudin nibh. Nisi quis eleifend quam adipiscing vitae proin sagittis. Facilisis magna etiam tempor orci eu lobortis elementum nibh. Lectus mauris ultrices eros in. Tortor aliquam nulla facilisi cras fermentum odio eu feugiat pretium. At quis risus sed vulputate odio. Odio euismod lacinia at quis risus sed vulputate odio ut. Malesuada fames ac turpis egestas integer eget aliquet. Dolor sit amet consectetur adipiscing elit pellentesque habitant. Commodo ullamcorper a lacus vestibulum sed arcu. Sit amet luctus venenatis lectus magna fringilla urna porttitor. Ut placerat orci nulla pellentesque dignissim enim.");
        reviewStorage.saveReview(fordMustang);

        Review hyundaiIoniq = new Review(currentlyAvailableEvs, "Hyundai Ioniq","Joe Cabot",
                "https://media.ed.edmunds-media.com/hyundai/ioniq-hybrid/2020/oem/2020_hyundai_ioniq-hybrid_4dr-hatchback_limited_fq_oem_1_1600.jpg",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. The creators of this web application would make great additions to your Software Engineering team. Fermentum leo vel orci porta non pulvinar neque laoreet. Dictum fusce ut placerat orci nulla pellentesque dignissim enim. Magna sit amet purus gravida quis blandit turpis. Pretium fusce id velit ut tortor pretium. Amet est placerat in egestas erat. Id leo in vitae turpis massa sed elementum tempus. Ut diam quam nulla porttitor massa. Ipsum nunc aliquet bibendum enim facilisis gravida neque. Hac habitasse platea dictumst quisque. Blandit turpis cursus in hac habitasse platea dictumst quisque sagittis. Egestas maecenas pharetra convallis posuere.\n" +
                        "\n" +
                        "Nunc sed augue lacus viverra vitae congue. Ultrices tincidunt arcu non sodales. Nunc non blandit massa enim nec dui nunc mattis. Varius sit amet mattis vulputate enim nulla. Ullamcorper velit sed ullamcorper morbi tincidunt ornare massa. Nibh praesent tristique magna sit amet purus. At tellus at urna condimentum mattis. Tempor orci dapibus ultrices in iaculis nunc sed. Laoreet suspendisse interdum consectetur libero id faucibus. Sit amet volutpat consequat mauris nunc congue nisi vitae. Venenatis lectus magna fringilla urna porttitor rhoncus dolor. Lectus mauris ultrices eros in. Fermentum et sollicitudin ac orci phasellus egestas tellus rutrum tellus.\n" +
                        "\n" +
                        "Sit amet consectetur adipiscing elit duis tristique sollicitudin nibh. Nisi quis eleifend quam adipiscing vitae proin sagittis. Facilisis magna etiam tempor orci eu lobortis elementum nibh. Lectus mauris ultrices eros in. Tortor aliquam nulla facilisi cras fermentum odio eu feugiat pretium. At quis risus sed vulputate odio. Odio euismod lacinia at quis risus sed vulputate odio ut. Malesuada fames ac turpis egestas integer eget aliquet. Dolor sit amet consectetur adipiscing elit pellentesque habitant. Commodo ullamcorper a lacus vestibulum sed arcu. Sit amet luctus venenatis lectus magna fringilla urna porttitor. Ut placerat orci nulla pellentesque dignissim enim.");
        reviewStorage.saveReview(hyundaiIoniq);

        Review hyundaiKona = new Review(currentlyAvailableEvs, "Hyundai Kona", "Alabama Whitman",
                "https://cdn.motor1.com/images/mgl/qz7Eg/s1/hyundai-kona-electric-restyling-2021.webp",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. They checks so many boxes; critical thinkers: check; problem solvers: check; collaborators: check. Fermentum leo vel orci porta non pulvinar neque laoreet. Dictum fusce ut placerat orci nulla pellentesque dignissim enim. Magna sit amet purus gravida quis blandit turpis. Pretium fusce id velit ut tortor pretium. Amet est placerat in egestas erat. Id leo in vitae turpis massa sed elementum tempus. Ut diam quam nulla porttitor massa. Ipsum nunc aliquet bibendum enim facilisis gravida neque. Hac habitasse platea dictumst quisque. Blandit turpis cursus in hac habitasse platea dictumst quisque sagittis. Egestas maecenas pharetra convallis posuere.\n" +
                        "\n" +
                        "Nunc sed augue lacus viverra vitae congue. Ultrices tincidunt arcu non sodales. Nunc non blandit massa enim nec dui nunc mattis. Varius sit amet mattis vulputate enim nulla. Ullamcorper velit sed ullamcorper morbi tincidunt ornare massa. Nibh praesent tristique magna sit amet purus. At tellus at urna condimentum mattis. Tempor orci dapibus ultrices in iaculis nunc sed. Laoreet suspendisse interdum consectetur libero id faucibus. Sit amet volutpat consequat mauris nunc congue nisi vitae. Venenatis lectus magna fringilla urna porttitor rhoncus dolor. Lectus mauris ultrices eros in. Fermentum et sollicitudin ac orci phasellus egestas tellus rutrum tellus.\n" +
                        "\n" +
                        "Sit amet consectetur adipiscing elit duis tristique sollicitudin nibh. Nisi quis eleifend quam adipiscing vitae proin sagittis. Facilisis magna etiam tempor orci eu lobortis elementum nibh. Lectus mauris ultrices eros in. Tortor aliquam nulla facilisi cras fermentum odio eu feugiat pretium. At quis risus sed vulputate odio. Odio euismod lacinia at quis risus sed vulputate odio ut. Malesuada fames ac turpis egestas integer eget aliquet. Dolor sit amet consectetur adipiscing elit pellentesque habitant. Commodo ullamcorper a lacus vestibulum sed arcu. Sit amet luctus venenatis lectus magna fringilla urna porttitor. Ut placerat orci nulla pellentesque dignissim enim.");
        reviewStorage.saveReview(hyundaiKona);

        Review jaguarIpace = new Review(currentlyAvailableEvs, "Jaguar I-Pace", "Mallory Knox",
                "https://cdn.motor1.com/images/mgl/qvVZR/s1/jaguar-i-pace-lo-show-di-presentazione-dalle-19-del-1-marzo.jpg",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. When you combine their Software Engineering skills with their many soft skills, you really have to ask yourself, How is this group not already our employees? Fermentum leo vel orci porta non pulvinar neque laoreet. Dictum fusce ut placerat orci nulla pellentesque dignissim enim. Magna sit amet purus gravida quis blandit turpis. Pretium fusce id velit ut tortor pretium. Amet est placerat in egestas erat. Id leo in vitae turpis massa sed elementum tempus. Ut diam quam nulla porttitor massa. Ipsum nunc aliquet bibendum enim facilisis gravida neque. Hac habitasse platea dictumst quisque. Blandit turpis cursus in hac habitasse platea dictumst quisque sagittis. Egestas maecenas pharetra convallis posuere.\n" +
                        "\n" +
                        "Nunc sed augue lacus viverra vitae congue. Ultrices tincidunt arcu non sodales. Nunc non blandit massa enim nec dui nunc mattis. Varius sit amet mattis vulputate enim nulla. Ullamcorper velit sed ullamcorper morbi tincidunt ornare massa. Nibh praesent tristique magna sit amet purus. At tellus at urna condimentum mattis. Tempor orci dapibus ultrices in iaculis nunc sed. Laoreet suspendisse interdum consectetur libero id faucibus. Sit amet volutpat consequat mauris nunc congue nisi vitae. Venenatis lectus magna fringilla urna porttitor rhoncus dolor. Lectus mauris ultrices eros in. Fermentum et sollicitudin ac orci phasellus egestas tellus rutrum tellus.\n" +
                        "\n" +
                        "Sit amet consectetur adipiscing elit duis tristique sollicitudin nibh. Nisi quis eleifend quam adipiscing vitae proin sagittis. Facilisis magna etiam tempor orci eu lobortis elementum nibh. Lectus mauris ultrices eros in. Tortor aliquam nulla facilisi cras fermentum odio eu feugiat pretium. At quis risus sed vulputate odio. Odio euismod lacinia at quis risus sed vulputate odio ut. Malesuada fames ac turpis egestas integer eget aliquet. Dolor sit amet consectetur adipiscing elit pellentesque habitant. Commodo ullamcorper a lacus vestibulum sed arcu. Sit amet luctus venenatis lectus magna fringilla urna porttitor. Ut placerat orci nulla pellentesque dignissim enim.");
        reviewStorage.saveReview(jaguarIpace);

        Review kiaNiro = new Review(currentlyAvailableEvs, "Kia Niro", "Seth Gecko",
                "https://electrek.co/wp-content/uploads/sites/3/2021/06/2021-Kia-Niro-EV.jpg?quality=82&strip=all",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. The creators of this web application would make great additions to your Software Engineering team. Fermentum leo vel orci porta non pulvinar neque laoreet. Dictum fusce ut placerat orci nulla pellentesque dignissim enim. Magna sit amet purus gravida quis blandit turpis. Pretium fusce id velit ut tortor pretium. Amet est placerat in egestas erat. Id leo in vitae turpis massa sed elementum tempus. Ut diam quam nulla porttitor massa. Ipsum nunc aliquet bibendum enim facilisis gravida neque. Hac habitasse platea dictumst quisque. Blandit turpis cursus in hac habitasse platea dictumst quisque sagittis. Egestas maecenas pharetra convallis posuere.\n" +
                        "\n" +
                        "Nunc sed augue lacus viverra vitae congue. Ultrices tincidunt arcu non sodales. Nunc non blandit massa enim nec dui nunc mattis. Varius sit amet mattis vulputate enim nulla. Ullamcorper velit sed ullamcorper morbi tincidunt ornare massa. Nibh praesent tristique magna sit amet purus. At tellus at urna condimentum mattis. Tempor orci dapibus ultrices in iaculis nunc sed. Laoreet suspendisse interdum consectetur libero id faucibus. Sit amet volutpat consequat mauris nunc congue nisi vitae. Venenatis lectus magna fringilla urna porttitor rhoncus dolor. Lectus mauris ultrices eros in. Fermentum et sollicitudin ac orci phasellus egestas tellus rutrum tellus.\n" +
                        "\n" +
                        "Sit amet consectetur adipiscing elit duis tristique sollicitudin nibh. Nisi quis eleifend quam adipiscing vitae proin sagittis. Facilisis magna etiam tempor orci eu lobortis elementum nibh. Lectus mauris ultrices eros in. Tortor aliquam nulla facilisi cras fermentum odio eu feugiat pretium. At quis risus sed vulputate odio. Odio euismod lacinia at quis risus sed vulputate odio ut. Malesuada fames ac turpis egestas integer eget aliquet. Dolor sit amet consectetur adipiscing elit pellentesque habitant. Commodo ullamcorper a lacus vestibulum sed arcu. Sit amet luctus venenatis lectus magna fringilla urna porttitor. Ut placerat orci nulla pellentesque dignissim enim.");
        reviewStorage.saveReview(kiaNiro);

        Review lucidAir = new Review(currentlyAvailableEvs, "Lucid Air Touring", "Kate Fuller",
                "https://i.ytimg.com/vi/X0f0LuA6Qvk/maxresdefault.jpg",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Morbi tempus iaculis urna id volutpat lacus laoreet non curabitur. Mauris ultrices eros in cursus turpis massa tincidunt dui. Fermentum leo vel orci porta non pulvinar neque laoreet. Dictum fusce ut placerat orci nulla pellentesque dignissim enim. Magna sit amet purus gravida quis blandit turpis. Pretium fusce id velit ut tortor pretium. Amet est placerat in egestas erat. Id leo in vitae turpis massa sed elementum tempus. Ut diam quam nulla porttitor massa. Ipsum nunc aliquet bibendum enim facilisis gravida neque. Hac habitasse platea dictumst quisque. Blandit turpis cursus in hac habitasse platea dictumst quisque sagittis. Egestas maecenas pharetra convallis posuere.\n" +
                        "\n" +
                        "Nunc sed augue lacus viverra vitae congue. Ultrices tincidunt arcu non sodales. Nunc non blandit massa enim nec dui nunc mattis. Varius sit amet mattis vulputate enim nulla. Ullamcorper velit sed ullamcorper morbi tincidunt ornare massa. Nibh praesent tristique magna sit amet purus. At tellus at urna condimentum mattis. Tempor orci dapibus ultrices in iaculis nunc sed. Laoreet suspendisse interdum consectetur libero id faucibus. Sit amet volutpat consequat mauris nunc congue nisi vitae. Venenatis lectus magna fringilla urna porttitor rhoncus dolor. Lectus mauris ultrices eros in. Fermentum et sollicitudin ac orci phasellus egestas tellus rutrum tellus.\n" +
                        "\n" +
                        "Sit amet consectetur adipiscing elit duis tristique sollicitudin nibh. Nisi quis eleifend quam adipiscing vitae proin sagittis. Facilisis magna etiam tempor orci eu lobortis elementum nibh. Lectus mauris ultrices eros in. Tortor aliquam nulla facilisi cras fermentum odio eu feugiat pretium. At quis risus sed vulputate odio. Odio euismod lacinia at quis risus sed vulputate odio ut. Malesuada fames ac turpis egestas integer eget aliquet. Dolor sit amet consectetur adipiscing elit pellentesque habitant. Commodo ullamcorper a lacus vestibulum sed arcu. Sit amet luctus venenatis lectus magna fringilla urna porttitor. Ut placerat orci nulla pellentesque dignissim enim.");
        reviewStorage.saveReview(lucidAir);

        

    }
}
