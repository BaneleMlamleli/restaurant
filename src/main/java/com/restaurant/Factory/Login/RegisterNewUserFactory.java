package com.restaurant.Factory.Login;

import com.restaurant.Domain.Login.RegisterNewUser;

public class RegisterNewUserFactory {
    public static RegisterNewUser getRegisterUser(String title, String name, String surname, String password){
        return new RegisterNewUser.Builder().title(title)
                .name(name)
                .surname(surname)
                .password(password)
                .build();
    }
}
