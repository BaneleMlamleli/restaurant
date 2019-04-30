package com.restaurant.Repository.Login;

import com.restaurant.Domain.Login.RegisterNewUser;
import com.restaurant.Repository.MainInterface;

import java.util.Set;

public interface RegisterNewUserRepository extends MainInterface<RegisterNewUser, String> {
    Set<RegisterNewUser> getAll();
}