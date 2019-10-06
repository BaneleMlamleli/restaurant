package com.restaurant.Domain.Login;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RegisterNewUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String name;
    private String surname;
    private String password;

    private RegisterNewUser(RegisterNewUser registerNewUser){
    }

    private RegisterNewUser(Builder builder){
        this.id = builder.id;
        this.title = builder.title;
        this.name = builder.name;
        this.surname = builder.surname;
        this.password = builder.password;
    }

    public int getId() {
        return id;
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
        private int id;
        private String title;
        private String name;
        private String surname;
        private String password;

        public Builder id(int id){
            this.id = id;
            return this;
        }

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

        public Object copy(RegisterNewUser savedRegisteredNewUser) {
            this.id = savedRegisteredNewUser.id;
            this.name = savedRegisteredNewUser.name;
            this.surname = savedRegisteredNewUser.surname;
            this.title = savedRegisteredNewUser.title;
            this.password = savedRegisteredNewUser.password;
            return this;
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "id=" + id +
                    ", title='" + title + '\'' +
                    ", name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
    }
}
