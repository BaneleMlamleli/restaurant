package com.restaurant.Factory.Login;

import com.restaurant.Domain.Login.VerifyUser;

public class VerifyUserFactory {
    public static VerifyUser getUserAccessRight(String title, String username, String password){
        return new VerifyUser.Builder().title(title)
                .username(username)
                .password(password)
                .build();
    }
}
