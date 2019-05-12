package com.restaurant.Service.Login;

import com.restaurant.Domain.Login.UserAccessRight;
import com.restaurant.Service.MainInterfaceService;

import java.util.Set;

public interface UserAccessRightService extends MainInterfaceService<UserAccessRight, String> {
        Set<UserAccessRight> getAll();
}
