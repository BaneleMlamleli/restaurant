package com.restaurant.Service.Login;

import com.restaurant.Domain.DatabaseCon.DatabaseConnection;
import com.restaurant.Domain.Login.RegisterNewUser;
import com.restaurant.Service.MainInterfaceService;

import java.util.Set;

public interface RegisterNewUserService extends MainInterfaceService<RegisterNewUser, String> {
    Set<RegisterNewUser> getAll();
}
