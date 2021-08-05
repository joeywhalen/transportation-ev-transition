package org.wcci.transportationev.project.resources;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
public class Article {

    @Id
    @GeneratedValue
    private Long id;
    private String articleTitle;
    private String authorName;

    @ManyToOne
    private ArticleTopic articleTopic;

    @Lob
    private String articleContent;

    @Lob
    @ElementCollection
    private Collection<String> articleComments;

    protected Article() {

    }

    public Article(ArticleTopic articleTopic, String articleTitle, String authorName, String articleContent,
                   String... articleComments) {
        this.articleTopic = articleTopic;
        this.articleTitle = articleTitle;
        this.authorName = authorName;
        this.articleContent = articleContent;
        this.articleComments = Set.of(articleComments);
    }
}
