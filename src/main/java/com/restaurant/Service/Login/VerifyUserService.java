package com.restaurant.Service.Login;

import com.restaurant.Domain.Login.VerifyUser;
import com.restaurant.Service.MainInterfaceService;

import java.util.Set;

public interface VerifyUserService extends MainInterfaceService<VerifyUser, String> {
    Set<VerifyUser> getAll();
}
