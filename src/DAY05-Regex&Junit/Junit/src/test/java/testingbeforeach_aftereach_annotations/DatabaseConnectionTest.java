package testingbeforeach_aftereach_annotations;
import com.beforeach_aftereach_annotations.DatabaseConnection;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class DatabaseConnectionTest {
    private DatabaseConnection databaseConnection;

    @BeforeEach
    public void setUp() {
        databaseConnection = new DatabaseConnection();
        databaseConnection.connect();
    }

    @AfterEach
    public void tearDown() {
        databaseConnection.disconnect();
    }

    @Test
    public void testConnectionIsActiveAfterSetup() {
        assertTrue(databaseConnection.isConnected(), "Database should be connected in @BeforeEach setup");
    }

    @Test
    public void testConnectionClosureAfterTeardown() {
        databaseConnection.disconnect();
        assertFalse(databaseConnection.isConnected(), "Database should be disconnected after calling disconnect()");
    }
}
