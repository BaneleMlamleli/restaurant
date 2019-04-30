package com.restaurant.Repository.Login;

import com.restaurant.Domain.Login.UserAccessRight;
import com.restaurant.Repository.MainInterface;

import java.util.Set;

public interface UserAccessRightRepository extends MainInterface<UserAccessRight, String> {
    Set<UserAccessRight> getAll();
}
