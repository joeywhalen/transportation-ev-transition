package org.wcci.transportationev.project.resources;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
public class Review {

    @Id
    @GeneratedValue
    private Long id;
    private String reviewTitle;
    private String authorName;
    @Lob
    private String imageUrl;

    @ManyToOne
    @JsonIgnore
    private ReviewTopic reviewTopic;

    @Lob
    private String reviewContent;

    @Lob
    @ElementCollection
    private Collection<String> reviewComments;

    protected Review() {

    }

    public Review(ReviewTopic reviewTopic, String reviewTitle, String authorName, String imageUrl,
                  String reviewContent, String... reviewComments) {
        this.reviewTopic = reviewTopic;
        this.reviewTitle = reviewTitle;
        this.authorName = authorName;
        this.imageUrl = imageUrl;
        this.reviewContent = reviewContent;
        this.reviewComments = Set.of(reviewComments);
    }

    public Long getId() {
        return id;
    }

    public String getReviewTitle() {
        return reviewTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public ReviewTopic getReviewTopic() {
        return reviewTopic;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public Iterable<String> getReviewComments() {
        return reviewComments;
    }

    public void addReviewComment(String newReviewComment) {
        this.reviewComments.add(newReviewComment);
    }
}
