package ua.kovalchuk.poi.common.autoconfigure;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ua.kovalchuk.poi.common.FileReader;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class PoiCommonAutoConfigurationTest {

    private final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

    @Test
    void fileReader() {
        context.register(PoiCommonAutoConfiguration.class);
        context.refresh();

        assertNotNull(context.getBean(FileReader.class));
    }
}