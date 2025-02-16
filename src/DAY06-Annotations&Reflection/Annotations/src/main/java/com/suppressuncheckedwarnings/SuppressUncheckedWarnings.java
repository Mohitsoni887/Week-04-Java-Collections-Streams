/*
Suppress Unchecked Warnings
✅ Problem Statement:
Create an ArrayList without generics and use @SuppressWarnings("unchecked") to hide compilation warnings.
*/
package com.suppressuncheckedwarnings;
import java.util.ArrayList;

public class SuppressUncheckedWarnings {

    @SuppressWarnings("unchecked")  // Suppresses unchecked type warnings
    public static void main(String[] args) {
        // Creating an ArrayList without generics (Raw Type)
        ArrayList list = new ArrayList();

        list.add("Hello");
        list.add(100);  // Mixing types (not type-safe)

        // Retrieving values (requires explicit casting)
        String str = (String) list.get(0);
        System.out.println(str);

        // This can cause runtime issues if casting is incorrect
        // int num = (Integer) list.get(1); // ✅ Correct usage
        // int num = (Integer) list.get(0); // ❌ Throws ClassCastException
    }
}
