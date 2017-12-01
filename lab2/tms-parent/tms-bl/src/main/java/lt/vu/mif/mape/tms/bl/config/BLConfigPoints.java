package lt.vu.mif.mape.tms.bl.config;

import lt.vu.mif.mape.tms.bl.VelocityCalculator;
import lt.vu.mif.mape.tms.bl.impl.PointVelocityCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BLConfigPoints {

    @Bean
    VelocityCalculator velocityCalculator(){
        return new PointVelocityCalculator();
    }

}
