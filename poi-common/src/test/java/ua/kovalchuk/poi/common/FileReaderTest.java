package ua.kovalchuk.poi.common;

import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;


class FileReaderTest {

    private final FileReader fileReader = new FileReader();

    @Test
    void printToLog() {
        assertDoesNotThrow(() -> fileReader.printToLog(getTestExcel().getFile()));
    }

    @Test
    void testPrintToLog() {
        assertDoesNotThrow(() -> fileReader.printToLog(getTestExcel().getInputStream()));
    }

    private ClassPathResource getTestExcel() {
        return new ClassPathResource("test.xlsx");
    }
}