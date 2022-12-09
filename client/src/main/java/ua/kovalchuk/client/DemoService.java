package ua.kovalchuk.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import ua.kovalchuk.poi.common.FileReader;

@Service
public class DemoService {

    @Bean
    public CommandLineRunner run(FileReader fileReader) {
        System.err.println("Run CommandLineRunner");
        return args -> {
            fileReader.printToLog(new ClassPathResource("test.xlsx").getInputStream());
        };
    }
}
