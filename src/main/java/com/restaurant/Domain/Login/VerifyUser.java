package com.restaurant.Domain.Login;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VerifyUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String username;
    private String password;

    private VerifyUser(VerifyUser verifyUser){

    }

    private VerifyUser(VerifyUser.Builder builder){
        this.title = builder.title;
        this.username = builder.username;
        this.password = builder.password;
    }

    public String getTitle() {
        return title;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public static class Builder {
        private String title;
        private String username;
        private String password;

        public VerifyUser.Builder title(String title){
            this.title = title;
            return this;
        }

        public VerifyUser.Builder username(String username) {
            this.username = username;
            return this;
        }

        public VerifyUser.Builder password(String password){
            this.password = password;
            return this;
        }

        public VerifyUser build(){
            return new VerifyUser(this);
        }

        public Object copy(VerifyUser saved) {
            this.title = saved.title;
            this.username = saved.username;
            this.password = saved.password;
            return  this;
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "title='" + title + '\'' +
                    ", username='" + username + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
    }
}
