

@RestController
public class ArticleReviewController {

    private ArticleTopicStorage articleTopicStorage;
    private ArticleStorage articleStorage;
    private ReviewTopicStorage reviewTopicStorage;
    private ReviewStorage reviewStorage;

    public ArticleReviewController(ArticleTopicStorage articleTopicStorage, ArticleStorage articleStorage, 
                        ReviewTopicStorage reviewTopicStorage, ReviewStorage reviewStorage) {
        this.articleTopicStorage = articleTopicStorage;
        this.articleStorage = articleStorage;
        this.reviewTopicStorage = reviewTopicStorage;
        this.reviewStorage = reviewStorage;
    }

    //GET http://localhost:8080/api/articleTopics
    @GetMapping("/api/articleTopics")
    public Iterable<ArticleTopic> retrieveAllArticleTopics() {
        return articleTopicStorage.retrieveAllArticleTopics();
    }
    
    //GET http://localhost:8080/api/articleTopics/1
    @GetMapping("/api/articleTopics/{id}")
    public ArticleTopic retrieveArticleTopicById(@PathVariable Long id) {
        return articleTopicStorage.retrieveArticleTopicById(id);
    }

    
}
