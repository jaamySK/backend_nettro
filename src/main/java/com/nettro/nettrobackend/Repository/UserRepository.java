package com.nettro.nettrobackend.Repository;


import com.nettro.nettrobackend.Data.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer>
{

}
