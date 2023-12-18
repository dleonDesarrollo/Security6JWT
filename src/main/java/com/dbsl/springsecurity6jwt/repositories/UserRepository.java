package com.dbsl.springsecurity6jwt.repositories;

import com.dbsl.springsecurity6jwt.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
