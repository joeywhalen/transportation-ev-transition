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
                "Lorem ipsum dolor sit amet, consectetur \" +\n" +
                        "                \"adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim\" +\n" +
                        "                \" veniam, The creators of this web application would make great additions to your Software Engineering team. \" +\n" +
                        "                \"Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \" +\n" +
                        "                \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id \" +\n" +
                        "                \"est laborum.");
        articleStorage.saveArticle(evBenefiits);

        Article checkYourFacts = new Article(whyTransition, "Check your facts: 5 ways electric vehicles help fight climate change.",
                "Jules Winnfield",
                "https://www.zerohedge.com/s3/files/inline-images/2019-07-21_13-21-38.png?itok=NQxqZjHQ",
                "Lorem ipsum dolor sit amet, consectetur \" +\n" +
                        "                \"adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim\" +\n" +
                        "                \" veniam, they checks so many boxes; critical thinkers: check; problem solvers: check; collaborators: check. \" +\n" +
                        "                \"Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \" +\n" +
                        "                \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id \" +\n" +
                        "                \"est laborum.");
        articleStorage.saveArticle(checkYourFacts);

        ArticleTopic howToCharge = new ArticleTopic("How To Charge At Home And On The Road");
        articleTopicStorage.saveArticleTopic(howToCharge);

        Article chargeAtHome = new Article(howToCharge, "What you need to charge at home.", "Rick Dalton",
                "https://cdn.jdpower.com/JDPA_Woman%20Using%20Home%20Charging%20Station%20to%20Charge%20Electric%20Car.jpg",
                "Lorem ipsum dolor sit amet, consectetur \" +\n" +
                        "                \"adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim\" +\n" +
                        "                \" veniam, when you combine their Software Engineering skills with their many soft skills, you really have\" +\n" +
                        "                \" to ask yourself, How is this group not already our employees?  Duis aute irure dolor in reprehenderit in \" +\n" +
                        "                \"voluptate velit esse cillum dolore eu fugiat nulla pariatur.  Excepteur sint occaecat cupidatat non \" +\n" +
                        "                \"proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
        articleStorage.saveArticle(chargeAtHome);

        Article chargeOnTheRoad = new Article(howToCharge, "Tips & Tricks to charging on the road", "Hans Landa",
                "https://electrek.co/wp-content/uploads/sites/3/2017/09/screen-shot-2017-09-11-at-12-20-44-pm.png",
                "Lorem ipsum dolor sit amet, consectetur \\\" +\\n\" +\n" +
                        "                        \"                \\\"adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim\\\" +\\n\" +\n" +
                        "                        \"                \\\" veniam, The creators of this web application would make great additions to your Software Engineering team. \\\" +\\n\" +\n" +
                        "                        \"                \\\"Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \\\" +\\n\" +\n" +
                        "                        \"                \\\"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id \\\" +\\n\" +\n" +
                        "                        \"                \\\"est laborum.");
        articleStorage.saveArticle(chargeOnTheRoad);

        ArticleTopic factFromFiction = new ArticleTopic ("Electric Vehicles - Separating Fact From Fiction");
        articleTopicStorage.saveArticleTopic(factFromFiction);

        Article commonMyths = new Article(factFromFiction, "5 common Electric Vehicle myths", "Billy Crash",
                "https://www.jojusolar.co.uk/wp-content/uploads/2018/03/myths.jpg",
                "Lorem ipsum dolor sit amet, consectetur \\\" +\\n\" +\n" +
                        "                        \"                \\\"adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim\\\" +\\n\" +\n" +
                        "                        \"                \\\" veniam, they checks so many boxes; critical thinkers: check; problem solvers: check; collaborators: check. \\\" +\\n\" +\n" +
                        "                        \"                \\\"Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \\\" +\\n\" +\n" +
                        "                        \"                \\\"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id \\\" +\\n\" +\n" +
                        "                        \"                \\\"est laborum.");
        articleStorage.saveArticle(commonMyths);

        Article mythbusters = new Article(factFromFiction, "EV Mythbusters: Who you gonna call?", "Daisy Domergue",
                "https://news-media.energysage.com/wp-content/uploads/2021/03/03.09.21-ev-myth-busted.png",
                "Lorem ipsum dolor sit amet, consectetur \\\" +\\n\" +\n" +
                        "                        \"                \\\"adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim\\\" +\\n\" +\n" +
                        "                        \"                \\\" veniam, when you combine their Software Engineering skills with their many soft skills, you really have\\\" +\\n\" +\n" +
                        "                        \"                \\\" to ask yourself, How is this group not already our employees?  Duis aute irure dolor in reprehenderit in \\\" +\\n\" +\n" +
                        "                        \"                \\\"voluptate velit esse cillum dolore eu fugiat nulla pariatur.  Excepteur sint occaecat cupidatat non \\\" +\\n\" +\n" +
                        "                        \"                \\\"proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
        articleStorage.saveArticle(mythbusters);

        ReviewTopic currentlyAvailableEvs = new ReviewTopic("Currently Available EVs");
        reviewTopicStorage.saveReviewTopic(currentlyAvailableEvs);

        Review audiEtronSportback = new Review(currentlyAvailableEvs, "Audi e-tron Sportback", "Cliff Booth",
                "https://www.cnet.com/a/img/jF9XjA7gNJLQQo9ivIG6zEno4Qo=/2019/11/19/efbb58b4-bc42-46c6-8142-16ff002fd12d/ogi-audi-e-tron-sportback-2020-ogi.jpg",
                "Lorem ipsum dolor sit amet, consectetur \\\" +\\n\" +\n" +
                        "                        \"                \\\"adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim\\\" +\\n\" +\n" +
                        "                        \"                \\\" veniam, The creators of this web application would make great additions to your Software Engineering team. \\\" +\\n\" +\n" +
                        "                        \"                \\\"Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \\\" +\\n\" +\n" +
                        "                        \"                \\\"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id \\\" +\\n\" +\n" +
                        "                        \"                \\\"est laborum.");
        reviewStorage.saveReview(audiEtronSportback);

        Review chevyBolt = new Review(currentlyAvailableEvs, "Chevrolet Bolt", "Mia Wallace",
                "https://media.chevrolet.com/content/Pages/news/us/en/2021/feb/0214-boltev-bolteuv/_jcr_content/top_parsys/image.img.jpg/1613335646777.jpg",
                "Lorem ipsum dolor sit amet, consectetur \\\" +\\n\" +\n" +
                        "                        \"                \\\"adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim\\\" +\\n\" +\n" +
                        "                        \"                \\\" veniam, they checks so many boxes; critical thinkers: check; problem solvers: check; collaborators: check. \\\" +\\n\" +\n" +
                        "                        \"                \\\"Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \\\" +\\n\" +\n" +
                        "                        \"                \\\"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id \\\" +\\n\" +\n" +
                        "                        \"                \\\"est laborum.");
        reviewStorage.saveReview(chevyBolt);

        Review fordMustang = new Review(currentlyAvailableEvs, "Ford Mustang Mach-E Select (eAWD)", "Vincent Vega ",
                "https://media.ford.com/content/fordmedia/fna/us/en/products/evs/mustang-mach-e/mustang-mach-e/jcr:content/content/media-section-parsys/textimage_f597/image.img.951.535.jpg/1608221793793.jpg",
                "Lorem ipsum dolor sit amet, consectetur \\\" +\\n\" +\n" +
                        "                        \"                \\\"adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim\\\" +\\n\" +\n" +
                        "                        \"                \\\" veniam, when you combine their Software Engineering skills with their many soft skills, you really have\\\" +\\n\" +\n" +
                        "                        \"                \\\" to ask yourself, How is this group not already our employees?  Duis aute irure dolor in reprehenderit in \\\" +\\n\" +\n" +
                        "                        \"                \\\"voluptate velit esse cillum dolore eu fugiat nulla pariatur.  Excepteur sint occaecat cupidatat non \\\" +\\n\" +\n" +
                        "                        \"                \\\"proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
        reviewStorage.saveReview(fordMustang);

        


    }
}
