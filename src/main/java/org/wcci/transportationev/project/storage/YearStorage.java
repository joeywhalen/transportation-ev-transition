package org.wcci.transportationev.project.storage;

import org.springframework.stereotype.Service;
import org.wcci.transportationev.project.resources.Year;

@Service
public class YearStorage {
    private YearRepository yearRepo;

    public YearStorage(YearRepository yearRepo){
        this.yearRepo = yearRepo;
    }

    public Iterable<Year> retrieveAllYears(){
        return yearRepo.findAll();
    }

    public Year retrieveYearById(Long Id){
        return yearRepo.findById().get();
    }

    public void saveYear(Year yearToSave){
        yearRepo.save(yearToSave);
    }
}
