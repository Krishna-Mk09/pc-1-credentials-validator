package com.jap.validator;

public class CredentialsValidatorImpl {
    // A method that takes two parameters and returns a string.
    public String validateUser(String name, String password) {
        CredentialsValidator validator = (userId, password1) -> {
            if (userId.equalsIgnoreCase("admin") && (password1.equalsIgnoreCase("1234"))) {
                return "valid user";
            } else {
                return "invalid user";
            }
        };
        return validator.validator(name, password);
    }
}

