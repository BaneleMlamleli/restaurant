package com.restaurant.Repository.Login;

import com.restaurant.Domain.Login.UserAccessRightTest;
import com.restaurant.Repository.MainInterfaceTest;

import java.util.Set;

public interface UserAccessRightRepositoryTest extends MainInterfaceTest<UserAccessRightTest, String> {
    Set<UserAccessRightTest> getAll();
}
