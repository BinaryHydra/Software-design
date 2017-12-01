package lt.vu.mif.mape.tms.model.config;

import lt.vu.mif.mape.tms.model.factory.TMSFactory;
import lt.vu.mif.mape.tms.model.factory.impl.InnerUserTMSFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelConfig {

    @Bean
    TMSFactory tmsFactory() {
        return new InnerUserTMSFactory();
    }
}