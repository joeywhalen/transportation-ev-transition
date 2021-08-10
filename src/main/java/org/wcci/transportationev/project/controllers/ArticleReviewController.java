package org.wcci.transportationev.project.controllers;

import org.springframework.web.bind.annotation.*;
import org.wcci.transportationev.project.resources.Article;
import org.wcci.transportationev.project.resources.ArticleTopic;
import org.wcci.transportationev.project.resources.Review;
import org.wcci.transportationev.project.resources.ReviewTopic;
import org.wcci.transportationev.project.storage.ArticleStorage;
import org.wcci.transportationev.project.storage.ArticleTopicStorage;
import org.wcci.transportationev.project.storage.ReviewStorage;
import org.wcci.transportationev.project.storage.ReviewTopicStorage;

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

    //GET http://localhost:8080/api/reviewTopics
    @GetMapping("/api/reviewTopics")
    public Iterable<ReviewTopic> retrieveAllReviewTopics() {
        return reviewTopicStorage.retrieveAllReviewTopics();
    }
    
    //GET http://localhost:8080/api/articleTopics/1
    @GetMapping("/api/articleTopics/{id}")
    public ArticleTopic retrieveArticleTopicById(@PathVariable Long id) {
        return articleTopicStorage.retrieveArticleTopicById(id);
    }

    //GET http://localhost:8080/api/reviewTopics/10
    @GetMapping("/api/reviewTopics/{id}")
    public ReviewTopic retrieveReviewTopicById(@PathVariable Long id) {
        return reviewTopicStorage.retrieveReviewTopicById(id);
    }

    //GET http://localhost:8080/api/articleTopics/1/articles
    @GetMapping("/api/articleTopics/{id}/articles")
    public Iterable<Article> retrieveAllArticlesInTopic(@PathVariable Long id) {
        return articleTopicStorage.retrieveArticleTopicById(id).getArticles();
    }

    //GET http://localhost:8080/api/reviewTopics/10/reviews
    @GetMapping("/api/reviewTopics/{id}/reviews")
    public Iterable<Review> retrieveAllReviewsInTopic(@PathVariable Long id) {
        return reviewTopicStorage.retrieveReviewTopicById(id).getReviews();
    }

    //GET http://localhost:8080/api/articleTopics/4/articles/5
    @GetMapping("/api/articleTopics/{id}/articles/{articleId}")
    public Article retrieveArticleById(@PathVariable Long id, @PathVariable Long articleId) {
        return articleStorage.retrieveArticleById(articleId);
    }

    //GET http://localhost:8080/api/reviewTopics/10/reviews/24
    @GetMapping("/api/reviewTopics/{id}/reviews/{reviewId}")
    public Review retrieveReviewById(@PathVariable Long id, @PathVariable Long reviewId) {
        return reviewStorage.retrieveReviewById(reviewId);
    }

    //PATCH http://localhost:8080/api/articleTopics/7/articles/9/comments
    @PatchMapping("/api/articleTopics/{id}/articles/{articleId}/{comments}")
    public Article addNewArticleComment(@PathVariable Long id, @PathVariable Long articleId, @RequestBody String newArticleComment) {
        Article articleToChange = articleStorage.retrieveArticleById(articleId);
        articleToChange.addArticleComment(newArticleComment);
        articleStorage.saveArticle(articleToChange);
        return articleToChange;
    }

    //PATCH http://localhost:8080/api/reviewTopics/29/reviews/35/comments
    @PatchMapping("/api/reviewTopics/{id}/reviews/{reviewId}/comments")
    public Review addNewReviewComment(@PathVariable Long id, @PathVariable Long reviewId, @RequestBody String newReviewComment) {
        Review reviewToChange = reviewStorage.retrieveReviewById(reviewId);
        reviewToChange.addReviewComment(newReviewComment);
        reviewStorage.saveReview(reviewToChange);
        return reviewToChange;
    }
    
}
