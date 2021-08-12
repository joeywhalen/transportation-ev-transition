package org.wcci.transportationev.project.storage;

import org.springframework.stereotype.Service;
import org.wcci.transportationev.project.resources.IceVehicle;

import java.util.Collection;

@Service
public class IceVehicleStorage {

    private IceVehicleRepository iceVehicleRepo;

    public IceVehicleStorage(IceVehicleRepository iceVehicleRepo) {
        this.iceVehicleRepo = iceVehicleRepo;
    }

    public IceVehicle retrieveIceVehicleById(Long id) {
        return iceVehicleRepo.findById(id).get();
    }

    public void saveIceVehicle(IceVehicle iceVehicleToSave) {
        iceVehicleRepo.save(iceVehicleToSave);
    }

    public Collection<IceVehicle> retrieveIceVehiclesByModelId(Long modelId) {

        Iterable<IceVehicle> vehicles = iceVehicleRepo.findAll();

        Collection<IceVehicle> vehiclesToReturn = null;

        for (IceVehicle vehicle : vehicles) {

            if (vehicle.getModel().getId() == modelId) {
                vehiclesToReturn.add(vehicle);
            }
        }
        return vehiclesToReturn;
    }


}
