package com.restaurant.Repository.Login;

import com.restaurant.Domain.Login.UserAccessRight;
import com.restaurant.Repository.MainInterface;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface UserAccessRightRepository extends JpaRepository<UserAccessRight, String> {//MainInterface<UserAccessRight, String> {
//    Set<UserAccessRight> getAll();
}
