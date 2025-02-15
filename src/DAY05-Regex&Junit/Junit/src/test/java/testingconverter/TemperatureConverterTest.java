package testingconverter;

import com.converter.TemperatureConverter;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    private TemperatureConverter converter;

    @BeforeEach
    void setUp() {
        converter = new TemperatureConverter();
    }

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0), 0.001, "0°C should be 32°F");
        assertEquals(212.0, converter.celsiusToFahrenheit(100), 0.001, "100°C should be 212°F");
        assertEquals(-40.0, converter.celsiusToFahrenheit(-40), 0.001, "-40°C should be -40°F");
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0.0, converter.fahrenheitToCelsius(32), 0.001, "32°F should be 0°C");
        assertEquals(100.0, converter.fahrenheitToCelsius(212), 0.001, "212°F should be 100°C");
        assertEquals(-40.0, converter.fahrenheitToCelsius(-40), 0.001, "-40°F should be -40°C");
    }
}
