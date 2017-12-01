package lt.vu.mif.mape.tms.bl.config;

import lt.vu.mif.mape.tms.bl.VelocityCalculator;
import lt.vu.mif.mape.tms.bl.impl.PercentageVelocityCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BLConfigPercentage {

    @Bean
    VelocityCalculator velocityCalculator(){
        return new PercentageVelocityCalculator();
    }

}
