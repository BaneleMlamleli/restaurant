package com.restaurant.Repository.Login;

import com.restaurant.Domain.Login.RegisterNewUser;
import com.restaurant.Repository.MainInterface;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface RegisterNewUserRepository extends JpaRepository<RegisterNewUser, String> {//MainInterface<RegisterNewUser, String> {
//    Set<RegisterNewUser> getAll();
}