package org.wcci.transportationev.project.storage;

import org.springframework.data.repository.CrudRepository;
import org.wcci.transportationev.project.resources.Year;

public interface YearRepository extends CrudRepository<Year, Long> {
}
