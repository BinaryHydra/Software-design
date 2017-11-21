import lt.vu.mif.mape.model.message.MessageFactory;
import lt.vu.mif.mape.model.message.impl.TextMessageFactory;
import lt.vu.mif.mape.model.task.TaskFactory;
import lt.vu.mif.mape.model.task.impl.SimpleTaskFactory;
import lt.vu.mif.mape.model.user.UserFactory;
import lt.vu.mif.mape.model.user.impl.SimpleUserFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelConfig {

    @Bean
    MessageFactory messageFactory() {
        return new TextMessageFactory();
    }

    @Bean
    TaskFactory taskFactory() {
        return new SimpleTaskFactory();
    }

    @Bean
    UserFactory userFactory() {
        return new SimpleUserFactory();
    }
}