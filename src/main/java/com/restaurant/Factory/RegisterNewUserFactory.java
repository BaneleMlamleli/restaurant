package com.restaurant.Factory;

import com.restaurant.Domain.RegisterNewUser;

public class RegisterNewUserFactory {
    public static RegisterNewUser getRegisterUser(String title, String name, String surname, String emailAddress, String password){
        return new RegisterNewUser.Builder().title(title)
                .name(name)
                .surname(surname)
                .emailAddress(emailAddress)
                .password(password)
                .build();
    }
}
