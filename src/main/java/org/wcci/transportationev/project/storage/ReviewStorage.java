package org.wcci.transportationev.project.storage;

import org.springframework.stereotype.Service;
import org.wcci.transportationev.project.resources.Review;

@Service
public class ReviewStorage {

    private ReviewRepository reviewRepository;

    public ReviewStorage(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public Review retrieveReviewById(Long id) {
        return reviewRepository.findById(id).get();
    }

    public Iterable<Review> retrieveAllReviews() {
        return reviewRepository.findAll();
    }

    public void saveReview(Review reviewToSave) {
        reviewRepository.save(reviewToSave);
    }
}
