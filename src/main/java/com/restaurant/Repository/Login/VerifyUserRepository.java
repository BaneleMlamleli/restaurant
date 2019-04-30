package com.restaurant.Repository.Login;

import com.restaurant.Domain.Login.VerifyUser;
import com.restaurant.Repository.MainInterface;

import java.util.Set;

public interface VerifyUserRepository extends MainInterface<VerifyUser, String> {
    Set<VerifyUser> getAll();
}
