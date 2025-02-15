package testingstringutilitymethods;

import com.stringutilitymethods.StringUtils; // Import the correct StringUtils
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    // Create an instance of the custom StringUtils class
    StringUtils stringUtils = new StringUtils();

    @Test
    public void reverseTest() {
        assertEquals("dcba", stringUtils.reverse("abcd"), "Reversing 'abcd' should return 'dcba'");
        assertEquals("", stringUtils.reverse(""), "Reversing an empty string should return an empty string");
        assertNull(stringUtils.reverse(null), "Reversing null should return null");
    }

    @Test
    public void isPalindromeTest() { // Fixed method name (lowercase 'i')
        assertTrue(stringUtils.isPalindrome("madam"), "'madam' should be a palindrome");
        assertTrue(stringUtils.isPalindrome("racecar"), "'racecar' should be a palindrome");
        assertFalse(stringUtils.isPalindrome("Hello"), "'Hello' should not be a palindrome");
        assertTrue(stringUtils.isPalindrome(""), "An empty string should be considered a palindrome");
        assertFalse(stringUtils.isPalindrome(null), "Null should not be considered a palindrome");
    }

    @Test
    public void toUppercaseTest() {
        assertEquals("HELLO", stringUtils.toUpperCase("hello"), "Converting 'hello' to uppercase should return 'HELLO'");
        assertEquals("JAVA", stringUtils.toUpperCase("java"), "Converting 'java' to uppercase should return 'JAVA'");
        assertEquals("", stringUtils.toUpperCase(""), "Converting an empty string should return an empty string");
        assertNull(stringUtils.toUpperCase(null), "Converting null should return null");
    }
}
