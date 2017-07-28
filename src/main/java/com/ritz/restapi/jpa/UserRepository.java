package com.ritz.restapi.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ritz.restapi.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
        User findByEmail(String email);
}
