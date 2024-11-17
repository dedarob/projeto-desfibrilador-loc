package com.primelides.desfribilador.repositories;

import com.primelides.desfribilador.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
