package com.restaurant.Domain.Login;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserAccessRight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String username;

//    private UserAccessRight(UserAccessRight userAccessRight){
//
//    }

    private UserAccessRight(UserAccessRight.Builder builder){
        this.title = builder.title;
        this.username = builder.username;
    }

    public String getTitle() {
        return title;
    }

    public String getUsername() {
        return username;
    }

    public static class Builder {
        private String title;
        private String username;

        public UserAccessRight.Builder title(String title){
            this.title = title;
            return this;
        }

        public UserAccessRight.Builder username(String username) {
            this.username = username;
            return this;
        }

        public UserAccessRight build(){
            return new UserAccessRight(this);
        }

        public Builder copy(UserAccessRight savedUserAccessRight) {
            this.title = savedUserAccessRight.title;
            this.username = savedUserAccessRight.username;
            return this;
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "title='" + title + '\'' +
                    ", username='" + username + '\'' +
                    '}';
        }
    }
}
