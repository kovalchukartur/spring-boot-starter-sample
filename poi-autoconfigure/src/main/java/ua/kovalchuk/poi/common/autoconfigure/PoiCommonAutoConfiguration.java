package ua.kovalchuk.poi.common.autoconfigure;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import ua.kovalchuk.poi.common.FileReader;

@AutoConfiguration
@ConditionalOnClass(FileReader.class)
public class PoiCommonAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    FileReader fileReader() {
        return new FileReader();
    }
}
