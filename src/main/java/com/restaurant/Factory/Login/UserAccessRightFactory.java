package com.restaurant.Factory.Login;

import com.restaurant.Domain.Login.UserAccessRight;

public class UserAccessRightFactory {
    public static UserAccessRight getUserAccessRight(String title, String username){
        return new UserAccessRight.Builder().title(title)
                .username(username)
                .build();
    }
}
