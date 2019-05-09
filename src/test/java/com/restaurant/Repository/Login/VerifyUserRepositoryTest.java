package com.restaurant.Repository.Login;

import com.restaurant.Domain.Login.VerifyUserTest;
import com.restaurant.Repository.MainInterfaceTest;

import java.util.Set;

public interface VerifyUserRepositoryTest extends MainInterfaceTest<VerifyUserTest, String> {
    Set<VerifyUserTest> getAll();
}
