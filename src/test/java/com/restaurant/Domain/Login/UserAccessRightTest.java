package com.restaurant.Domain.Login;

public class UserAccessRightTest {
    private String title;
    private String username;

    private UserAccessRightTest(UserAccessRightTest userAccessRightTest){

    }

    private UserAccessRightTest(Builder builder){
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

        public Builder title(String title){
            this.title = title;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public UserAccessRightTest build(){
            return new UserAccessRightTest(this);
        }
    }
}
