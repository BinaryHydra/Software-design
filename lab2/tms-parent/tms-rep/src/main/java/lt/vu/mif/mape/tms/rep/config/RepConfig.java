package lt.vu.mif.mape.tms.rep.config;

import lt.vu.mif.mape.tms.rep.CommentRep;
import lt.vu.mif.mape.tms.rep.TaskRep;
import lt.vu.mif.mape.tms.rep.impl.MemoryCommentRep;
import lt.vu.mif.mape.tms.rep.impl.MemoryTaskRep;
import lt.vu.mif.mape.tms.rep.UserRep;
import lt.vu.mif.mape.tms.rep.impl.MemoryUserRep;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepConfig {

    @Bean
    TaskRep myTaskRep() {
        return new MemoryTaskRep();
    }

    @Bean
    UserRep myUserRep() {
        return new MemoryUserRep();
    }

    @Bean
    CommentRep myCommentRep() {
        return new MemoryCommentRep();
    }
}