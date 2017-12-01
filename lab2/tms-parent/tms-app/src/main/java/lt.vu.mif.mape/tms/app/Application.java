package lt.vu.mif.mape.tms.app;

import lt.vu.mif.mape.ext.mail.config.ExtConfig;
import lt.vu.mif.mape.tms.bl.config.BLConfigPercentage;
import lt.vu.mif.mape.tms.config.FacadeConfig;
import lt.vu.mif.mape.tms.model.config.ModelConfig;
import lt.vu.mif.mape.tms.rep.config.RepConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"lt.vu.mif.mape"})
public class Application {

	public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(ModelConfig.class);
        ctx.register(RepConfig.class);
        ctx.register(FacadeConfig.class);
        ctx.register(BLConfigPercentage.class);
        ctx.register(ExtConfig.class);
		SpringApplication.run(Application.class, args);
	}
}
