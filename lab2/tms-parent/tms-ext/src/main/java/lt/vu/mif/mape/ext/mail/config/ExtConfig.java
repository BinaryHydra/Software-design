package lt.vu.mif.mape.ext.mail.config;

import lt.vu.mif.mape.ext.mail.SimpleMailService;
import lt.vu.mif.mape.ext.mail.MailSender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExtConfig {

    @Bean
    MailSender mailSender(){
        return new SimpleMailService();
    }
}
