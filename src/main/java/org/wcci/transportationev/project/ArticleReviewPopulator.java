package org.wcci.transportationev.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wcci.transportationev.project.resources.Article;
import org.wcci.transportationev.project.resources.ArticleTopic;
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

        
    }
}
