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
                        "                \" veniam, thye checks so many boxes; critical thinkers: check; problem solvers: check; collaborators: check. \" +\n" +
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
                        "                \" veniam, when you combine his Software Engineering skills with his IT Support skills, you really have\" +\n" +
                        "                \" to ask yourself, How is this guy not one of our employees?  Duis aute irure dolor in reprehenderit in \" +\n" +
                        "                \"voluptate velit esse cillum dolore eu fugiat nulla pariatur.  Excepteur sint occaecat cupidatat non \" +\n" +
                        "                \"proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
        articleStorage.saveArticle(chargeAtHome);

        Article chargeOnTheRoad = new Article(howToCharge, "Tips & Tricks to charging on the road", "Hans Landa",
                "https://electrek.co/wp-content/uploads/sites/3/2017/09/screen-shot-2017-09-11-at-12-20-44-pm.png",
                "Lorem ipsum dolor sit amet, consectetur \" +\n" +
                        "                \"adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim\" +\n" +
                        "                \" veniam, The creator of this Blog site would make a great addition to your Software Engineering team. \" +\n" +
                        "                \"Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \" +\n" +
                        "                \"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id \" +\n" +
                        "                \"est laborum.");
        articleStorage.saveArticle(chargeOnTheRoad);

        

        ReviewTopic currentlyAvailableEvs = new ReviewTopic("Currently Available EVs");
        reviewTopicStorage.saveReviewTopic(currentlyAvailableEvs);

        Review audiEtronSportback = new Review(currentlyAvailableEvs, "Audi e-tron Sportback", "Cliff Booth",
                "https://www.cnet.com/a/img/jF9XjA7gNJLQQo9ivIG6zEno4Qo=/2019/11/19/efbb58b4-bc42-46c6-8142-16ff002fd12d/ogi-audi-e-tron-sportback-2020-ogi.jpg",
                "Lorem ipsum dolor sit amet, consectetur \" +\n" +
                        "                \"adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim\" +\n" +
                        "                \" veniam, when you combine their Software Engineering skills with their suft skills, you really have\" +\n" +
                        "                \" to ask yourself, How is this group not currently employed by us?  Duis aute irure dolor in reprehenderit in \" +\n" +
                        "                \"voluptate velit esse cillum dolore eu fugiat nulla pariatur.  Excepteur sint occaecat cupidatat non \" +\n" +
                        "                \"proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
        reviewStorage.saveReview(audiEtronSportback);


    }
}
