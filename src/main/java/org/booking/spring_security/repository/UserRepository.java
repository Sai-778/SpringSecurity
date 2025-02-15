package org.booking.spring_security.repository;

import org.booking.spring_security.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(String username);

}
