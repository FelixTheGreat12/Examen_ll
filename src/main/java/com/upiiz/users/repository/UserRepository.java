package com.upiiz.users.repository;

import com.upiiz.users.entities.UserEntities;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntities, Long> {

}
