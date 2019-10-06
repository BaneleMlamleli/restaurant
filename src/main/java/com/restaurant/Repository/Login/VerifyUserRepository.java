package com.restaurant.Repository.Login;

import com.restaurant.Domain.Login.VerifyUser;
import com.restaurant.Repository.MainInterface;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface VerifyUserRepository extends JpaRepository<VerifyUser, String> {//MainInterface<VerifyUser, String> {
//    Set<VerifyUser> getAll();
}
