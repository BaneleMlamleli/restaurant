package com.restaurant.Repository;

import com.restaurant.Domain.RegisterNewUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterNewUserRepository extends JpaRepository<RegisterNewUser, Integer> {
}