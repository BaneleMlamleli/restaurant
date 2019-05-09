package com.restaurant.Repository.Login;

import com.restaurant.Domain.Login.RegisterNewUserTest;
import com.restaurant.Repository.MainInterfaceTest;

import java.util.Set;

public interface RegisterNewUserRepositoryTest extends MainInterfaceTest<RegisterNewUserTest, String> {
    Set<RegisterNewUserTest> getAll();
}