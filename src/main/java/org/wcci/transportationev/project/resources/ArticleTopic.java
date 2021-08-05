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
    private String topicTitle;

    @OneToMany(mappedBy = "topic")
    private Collection<Article> articles;

    protected ArticleTopic() {

    }

    public ArticleTopic(String topicTitle) {
        this.topicTitle = topicTitle;
    }

    public Long getId() {
        return id;
    }

    public String getTopicTitle() {
        return topicTitle;
    }

    public Collection<Article> getArticles() {
        return articles;
    }
}
