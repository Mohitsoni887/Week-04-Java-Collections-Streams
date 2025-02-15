package testingfilehandling;

import com.filehandling.FileProcessor;
import org.junit.jupiter.api.*;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FileProcessorTest {
    private static final String TEST_FILE = "testfile.txt";
    private FileProcessor fileProcessor;

    @BeforeEach
    void setUp() {
        fileProcessor = new FileProcessor();
    }

    @AfterEach
    void tearDown() {
        File file = new File(TEST_FILE);
        if (file.exists()) {
            file.delete(); // Clean up after tests
        }
    }

    @Test
    void testWriteAndReadFromFile() throws IOException {
        String content = "Hello, File Handling!";
        fileProcessor.writeToFile(TEST_FILE, content);

        String readContent = fileProcessor.readFromFile(TEST_FILE);
        assertEquals(content, readContent, "Content read should match the written content.");
    }

    @Test
    void testFileExistsAfterWriting() throws IOException {
        fileProcessor.writeToFile(TEST_FILE, "Sample Content");
        File file = new File(TEST_FILE);
        assertTrue(file.exists(), "File should exist after writing.");
    }

    @Test
    void testIOExceptionWhenFileDoesNotExist() {
        Exception exception = assertThrows(IOException.class, () -> fileProcessor.readFromFile("nonexistent.txt"));
        assertTrue(exception.getMessage().contains("nonexistent.txt"), "Exception message should mention the missing file.");
    }
}
