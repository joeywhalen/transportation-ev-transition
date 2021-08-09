

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

    //GET http://localhost:8080/api/articleTopics/1/articles
    @GetMapping("/api/articleTopics/{id}/articles")
    public Iterable<Article> retrieveAllArticlesInTopic(@PathVariable Long id) {
        return articleTopicStorage.retrieveArticleTopicById(id).getArticles();
    }

    //GET http://localhost:8080/api/articleTopics/4/articles/5
    @GetMapping("/api/articleTopics/{id}/articles/{articleId}")
    public Article retrieveArticleById(@PathVariable Long id, @PathVariable Long articleId) {
        return articleStorage.findById(articleId).get();
    }

    //PATCH http://localhost:8080/api/articleTopics/7/articles/9/comments
    @PatchMapping("/api/articleTopics/{id}/articles/{articleId/comments}")
    public Article addNewArticleComment(@PathVariable Long id, @PathVariable Long articleId, @RequestBody String newArticleComment) {
        Article articleToChange = articleStorage.findById(articleId).get();
        articleToChange.addArticleComment(newArticleComment);
        articleStorage.saveArticle(articleToChange);
        return articleToChange;
    }

    
}
