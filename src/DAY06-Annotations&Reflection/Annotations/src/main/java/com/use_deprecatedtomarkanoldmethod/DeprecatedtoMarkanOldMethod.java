/*
Use @Deprecated to Mark an Old Method
✅ Problem Statement:
Create a class LegacyAPI with an old method oldFeature(), which should not be used anymore. Instead, introduce a new method newFeature().
🔹 Steps to Follow:
Define a class LegacyAPI.
Mark oldFeature() as @Deprecated.
Call both methods and observe the warning.
*/
package com.use_deprecatedtomarkanoldmethod;

// Legacy API class
// Legacy API class
class LegacyAPI {

    @Deprecated(since = "1.2", forRemoval = true)
    void oldFeature() {
        System.out.println("This is the old feature (deprecated).");
    }

    // New recommended method
    void newFeature() {
        System.out.println("This is the new and improved feature!");
    }
}


// Main class to test
public class DeprecatedtoMarkanOldMethod {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();

        api.oldFeature();  // ⚠️ Compiler warning: Deprecated method
        api.newFeature();  // ✅ Recommended method
    }
}
