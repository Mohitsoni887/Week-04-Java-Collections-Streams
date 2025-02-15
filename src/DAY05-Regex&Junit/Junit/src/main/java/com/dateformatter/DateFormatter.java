/*
Testing Date Formatter
📌 Problem:
Create a DateFormatter class with:
formatDate(String inputDate): Converts yyyy-MM-dd format to dd-MM-yyyy.
✅ Write JUnit test cases for valid and invalid dates.

 */
package com.dateformatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatter {
    // Convert yyyy-MM-dd to dd-MM-yyyy format
    public String formatDate(String inputDate) {
        try {
            DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

            LocalDate date = LocalDate.parse(inputDate, inputFormatter);
            return date.format(outputFormatter);
        } catch (DateTimeParseException e) {
            return "Invalid Date Format";
        }
    }
}
