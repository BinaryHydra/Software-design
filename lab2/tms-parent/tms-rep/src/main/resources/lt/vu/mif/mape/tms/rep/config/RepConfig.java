package lt.vu.mif.mape.tms.rep.config;

import lt.vu.mif.mape.rep.task.TaskRep;
import lt.vu.mif.mape.rep.task.imp.MockTaskRep;
import lt.vu.mif.mape.rep.user.UserRep;
import lt.vu.mif.mape.rep.user.imp.MockUserRep;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepConfig {

    @Bean
    TaskRep myTaskRep() {
        return new MockTaskRep();
    }

    @Bean
    UserRep myUserRep() {
        return new MockUserRep();
    }
}