package com.restaurant.Domain.Login;

public class VerifyUserTest {
    private String title;
    private String username;
    private String password;

    private VerifyUserTest(VerifyUserTest verifyUserTest){

    }

    private VerifyUserTest(Builder builder){
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

        public Builder title(String title){
            this.title = title;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder password(String password){
            this.password = password;
            return this;
        }

        public VerifyUserTest build(){
            return new VerifyUserTest(this);
        }
    }
}
