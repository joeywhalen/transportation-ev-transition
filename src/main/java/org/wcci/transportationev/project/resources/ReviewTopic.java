package org.wcci.transportationev.project.resources;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class ReviewTopic {

    @Id
    @GeneratedValue
    private Long id;
    private String reviewTopicTitle;

    @OneToMany(mappedBy = "reviewTopic")
    private Collection<Review> reviews;

    protected ReviewTopic() {

    }

    public ReviewTopic(String reviewTopicTitle) {
        this.reviewTopicTitle = reviewTopicTitle;
    }

    public Long getId() {
        return id;
    }

    public String getReviewTopicTitle() {
        return reviewTopicTitle;
    }

    public Collection<Review> getReviews() {
        return reviews;
    }
}
