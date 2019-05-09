package com.restaurant.Repository.Implementation.LoginImplementation;

import com.restaurant.Domain.Login.RegisterNewUserTest;
import com.restaurant.Repository.Login.RegisterNewUserRepositoryTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RegisterNewUserImplementationTest implements RegisterNewUserRepositoryTest {

    private static RegisterNewUserImplementationTest registerNewUserImplementationTest = null;
    private Map<RegisterNewUserTest, String> registerNewUserStringMap;

    private RegisterNewUserImplementationTest(){
        registerNewUserStringMap = new HashMap<>();
    }

    public static RegisterNewUserRepositoryTest getRepository(){
        if ( registerNewUserImplementationTest == null){
            registerNewUserImplementationTest = new RegisterNewUserImplementationTest();
        }
        return registerNewUserImplementationTest;
    }

    @Override
    public Set<RegisterNewUserTest> getAll() {
        return null;
    }

    @Override
    public RegisterNewUserTest create(RegisterNewUserTest registerNewUser) {
        return null;
    }

    @Override
    public RegisterNewUserTest read(String s) {
        return null;
    }

    @Override
    public RegisterNewUserTest update(RegisterNewUserTest registerNewUser) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
