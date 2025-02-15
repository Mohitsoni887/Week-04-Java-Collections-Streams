package testingdateformatter;

import com.dateformatter.DateFormatter;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {
    private DateFormatter dateFormatter;

    @BeforeEach
    void setUp() {
        dateFormatter = new DateFormatter();
    }

    @Test
    void testValidDateFormatting() {
        assertEquals("25-12-2023", dateFormatter.formatDate("2023-12-25"), "Expected '25-12-2023'");
        assertEquals("01-01-2000", dateFormatter.formatDate("2000-01-01"), "Expected '01-01-2000'");
    }

    @Test
    void testInvalidDateFormatting() {
        assertEquals("Invalid Date Format", dateFormatter.formatDate("25-12-2023"), "Expected 'Invalid Date Format'");
        assertEquals("Invalid Date Format", dateFormatter.formatDate("2023/12/25"), "Expected 'Invalid Date Format'");
        assertEquals("Invalid Date Format", dateFormatter.formatDate("abcd-ef-gh"), "Expected 'Invalid Date Format'");
        assertEquals("Invalid Date Format", dateFormatter.formatDate(""), "Expected 'Invalid Date Format'");
    }

    @Test
    void testNullDateInput() {
        assertEquals("Invalid Date Format", dateFormatter.formatDate(null), "Expected 'Invalid Date Format'");
    }
}
