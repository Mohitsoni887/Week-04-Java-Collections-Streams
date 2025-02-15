package testingperformancetesting;

import com.performancetesting.PerformanceUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

class PerformanceUtilsTest {

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS) // Fail test if it takes more than 2 seconds
    void testLongRunningTaskTimeout() {
        assertEquals("Task Completed", PerformanceUtils.longRunningTask(), "Task should complete in less than 2 seconds");
    }
}
