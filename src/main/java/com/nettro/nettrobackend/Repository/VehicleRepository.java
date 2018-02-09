package com.nettro.nettrobackend.Repository;

import com.nettro.nettrobackend.Data.User;
import com.nettro.nettrobackend.Data.Vehicle;
import org.springframework.data.repository.CrudRepository;

public interface VehicleRepository extends CrudRepository<Vehicle,Integer>
{

}
