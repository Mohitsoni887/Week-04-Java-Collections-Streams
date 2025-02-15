/*
Testing Password Strength Validator
📌 Problem:
Create a PasswordValidator class with:
Password must have at least 8 characters, one uppercase letter, and one digit.
✅ Write JUnit tests for valid and invalid passwords.

 */
package com.security;

public class PasswordValidator {
    // Method to validate password
    public boolean isValidPassword(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }
        boolean hasUpperCase = false;
        boolean hasDigit = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            }
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }

        return hasUpperCase && hasDigit;
    }
}
