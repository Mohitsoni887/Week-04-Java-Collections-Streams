/*
Testing String Utility Methods
Problem:
Create a StringUtils class with the following methods:
reverse(String str): Returns the reverse of a given string.
isPalindrome(String str): Returns true if the string is a palindrome.
toUpperCase(String str): Converts a string to uppercase.
Write JUnit test cases to verify that these methods work correctly.
 */
package com.stringutilitymethods;

public class StringUtils {
    // Method to reverse a string
    public String reverse(String string) {
        if (string == null)
            return null;
        return new StringBuilder(string).reverse().toString();
    }

    // Method to check if a string is a palindrome
    public boolean isPalindrome(String string) {
        if (string == null)
            return false;
        return string.equals(reverse(string));
    }

    // Method to convert a string to uppercase
    public String toUpperCase(String string) {
        if (string == null)
            return null;
        return string.toUpperCase();
    }
}

