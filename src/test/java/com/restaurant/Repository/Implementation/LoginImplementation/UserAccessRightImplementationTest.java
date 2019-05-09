package com.restaurant.Repository.Implementation.LoginImplementation;

import com.restaurant.Domain.Login.UserAccessRightTest;
import com.restaurant.Repository.Login.UserAccessRightRepositoryTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UserAccessRightImplementationTest implements UserAccessRightRepositoryTest {
    private static UserAccessRightImplementationTest userAccessRightImplementationTest = null;
    private Map<UserAccessRightTest, String> userAccessRightStringMap;

    private UserAccessRightImplementationTest(){
        userAccessRightStringMap = new HashMap<>();
    }

    public static UserAccessRightRepositoryTest getRepository(){
        if ( userAccessRightImplementationTest == null){
            userAccessRightImplementationTest = new UserAccessRightImplementationTest();
        }
        return userAccessRightImplementationTest;
    }

    @Override
    public Set<UserAccessRightTest> getAll() {
        return null;
    }

    @Override
    public UserAccessRightTest create(UserAccessRightTest userAccessRightTest) {
        return null;
    }

    @Override
    public UserAccessRightTest read(String s) {
        return null;
    }

    @Override
    public UserAccessRightTest update(UserAccessRightTest userAccessRightTest) {
        return null;
    }

    @Override
    public void delete(String s) {
        userAccessRightStringMap.remove(s);

    }
}
