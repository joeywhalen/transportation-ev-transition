package org.wcci.transportationev.project.storage;

import org.springframework.stereotype.Service;
import org.wcci.transportationev.project.resources.IceVehicle;

@Service
public class IceVehicleStorage {

    private IceVehicleRepository iceVehicleRepo;

    public IceVehicleStorage(IceVehicleRepository iceVehicleRepo) {
        this.iceVehicleRepo = iceVehicleRepo;
    }

    public IceVehicle retrieveIceVehicleById(Long id){
        return iceVehicleRepo.findById(id).get();
    }

    public void saveIceVehicle(IceVehicle iceVehicleToSave){
        iceVehicleRepo.save(iceVehicleToSave);
    }

    public Iterable<IceVehicle> retrieveIceVehiclesByModelId(Long modelId){
        return iceVehicleRepo.findAllByModelId(modelId);
    }
}
