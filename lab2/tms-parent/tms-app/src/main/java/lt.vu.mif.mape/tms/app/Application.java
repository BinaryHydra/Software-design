package lt.vu.mif.mape.tms.app;

import lt.vu.mif.mape.tms.rep.config.RepConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("config")
public class Application {

	public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(ModelConfig.class);
        ctx.register(RepConfig.class);
		SpringApplication.run(Application.class, args);
	}
}
