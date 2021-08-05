package org.wcci.transportationev.project.storage;

import org.springframework.data.repository.CrudRepository;
import org.wcci.transportationev.project.resources.Review;

public interface ReviewRepository extends CrudRepository<Review, Long> {
    
}
