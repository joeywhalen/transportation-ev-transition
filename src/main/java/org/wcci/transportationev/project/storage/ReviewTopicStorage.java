package org.wcci.transportationev.project.storage;

import org.springframework.stereotype.Service;
import org.wcci.transportationev.project.resources.ReviewTopic;

@Service
public class ReviewTopicStorage {

    private ReviewTopicRepository reviewTopicRepository;

    public ReviewTopicStorage(ReviewTopicRepository reviewTopicRepository) {
        this.reviewTopicRepository = reviewTopicRepository;
    }

    public ReviewTopic retrieveReviewTopicById(Long id) {
        return reviewTopicRepository.findById(id).get();
    }

    public Iterable<ReviewTopic> retrieveAllReviewTopics() {
        return reviewTopicRepository.findAll();
    }

    public void saveReviewTopic(ReviewTopic reviewTopicToSave) {
        reviewTopicRepository.save(reviewTopicToSave);
    }
}
