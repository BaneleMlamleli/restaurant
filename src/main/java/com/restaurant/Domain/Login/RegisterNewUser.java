package com.restaurant.Domain.Login;

public class RegisterNewUser {
    private String title;
    private String name;
    private String surname;
    private String password;

    private RegisterNewUser(RegisterNewUser registerNewUser){

    }

    private RegisterNewUser(Builder builder){
        this.title = builder.title;
        this.name = builder.name;
        this.surname = builder.surname;
        this.password = builder.password;
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPassword() {
        return password;
    }

    public static class Builder {
        private String title;
        private String name;
        private String surname;
        private String password;

        public Builder title(String title){
            this.title = title;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public RegisterNewUser build(){
            return new RegisterNewUser(this);
        }
    }
}