/*
 Testing User Registration
📌 Problem:
Create a UserRegistration class with:
registerUser(String username, String email, String password).
Throws IllegalArgumentException for invalid inputs.
✅ Write JUnit tests to verify valid and invalid user registrations.
 */
package com.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
    // Regular expression for validating email format
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    // Method to register a user
    public String registerUser(String username, String email, String password) {
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty");
        }
        if (email == null || !Pattern.matches(EMAIL_REGEX, email)) {
            throw new IllegalArgumentException("Invalid email format");
        }
        if (password == null || password.length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters long");
        }
        return "User registered successfully";
    }
}
