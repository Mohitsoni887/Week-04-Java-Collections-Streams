package com.extractallemailaddressesfromatext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Sample text
        String text = "mohitsoni9886921@gmail.com and ms9886921@gmail.com";

        // Extract emails from the text
        List<String> emailAddresses = ExtractAllEmailAddressesExample.extractEmails(text);

        // Print extracted emails
        for (String email : emailAddresses) {
            System.out.println(email);
        }
    }
}
