package org.wcci.transportationev.project.resources;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class ArticleTopic {

    @Id
    @GeneratedValue
    private Long id;
    private String articleTopicTitle;

    @OneToMany(mappedBy = "articleTopic")
    private Collection<Article> articles;

    protected ArticleTopic() {

    }

    public ArticleTopic(String articleTopicTitle) {
        this.articleTopicTitle = articleTopicTitle;
    }

    public Long getId() {
        return id;
    }

    public String getArticleTopicTitle() {
        return articleTopicTitle;
    }

    public Collection<Article> getArticles() {
        return articles;
    }
}
