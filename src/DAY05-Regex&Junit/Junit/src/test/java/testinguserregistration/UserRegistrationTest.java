package testinguserregistration;

import com.userregistration.UserRegistration;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {
    private UserRegistration userRegistration;

    @BeforeEach
    void setUp() {
        userRegistration = new UserRegistration();
    }

    @Test
    void testValidUserRegistration() {
        assertEquals("User registered successfully", userRegistration.registerUser("JohnDoe", "john@example.com", "Password123"), "Valid user registration should succeed");
    }

    @Test
    void testInvalidUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("", "john@example.com", "Password123"));
        assertEquals("Username cannot be empty", exception.getMessage());
    }

    @Test
    void testInvalidEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("JohnDoe", "invalid-email", "Password123"));
        assertEquals("Invalid email format", exception.getMessage());
    }

    @Test
    void testShortPassword() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("JohnDoe", "john@example.com", "pass"));
        assertEquals("Password must be at least 8 characters long", exception.getMessage());
    }

    @Test
    void testNullInputs() {
        Exception exception1 = assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser(null, "john@example.com", "Password123"));
        assertEquals("Username cannot be empty", exception1.getMessage());

        Exception exception2 = assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("JohnDoe", null, "Password123"));
        assertEquals("Invalid email format", exception2.getMessage());

        Exception exception3 = assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("JohnDoe", "john@example.com", null));
        assertEquals("Password must be at least 8 characters long", exception3.getMessage());
    }
}
