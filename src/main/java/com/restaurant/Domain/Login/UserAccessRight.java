package com.restaurant.Domain.Login;

public class UserAccessRight {
    private String title;
    private String username;

    private UserAccessRight(UserAccessRight userAccessRight){

    }

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
    }
}
