package testingsecurity;

import com.security.PasswordValidator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {
    private PasswordValidator passwordValidator;

    @BeforeEach
    void setUp() {
        passwordValidator = new PasswordValidator();
    }

    @Test
    void testValidPassword() {
        assertTrue(passwordValidator.isValidPassword("StrongPass1"), "Password should be valid.");
    }

    @Test
    void testShortPassword() {
        assertFalse(passwordValidator.isValidPassword("Abc1"), "Password should be invalid due to length.");
    }

    @Test
    void testMissingUppercase() {
        assertFalse(passwordValidator.isValidPassword("password123"), "Password should be invalid due to missing uppercase letter.");
    }

    @Test
    void testMissingDigit() {
        assertFalse(passwordValidator.isValidPassword("PasswordNoDigit"), "Password should be invalid due to missing digit.");
    }

    @Test
    void testNullPassword() {
        assertFalse(passwordValidator.isValidPassword(null), "Null password should be invalid.");
    }

    @Test
    void testEmptyPassword() {
        assertFalse(passwordValidator.isValidPassword(""), "Empty password should be invalid.");
    }
}
