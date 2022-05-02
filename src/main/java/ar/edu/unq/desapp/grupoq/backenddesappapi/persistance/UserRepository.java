package ar.edu.unq.desapp.grupoq.backenddesappapi.persistance;

import ar.edu.unq.desapp.grupoq.backenddesappapi.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    Boolean existsByEmail(String email);
    User findByEmail(String email);
}