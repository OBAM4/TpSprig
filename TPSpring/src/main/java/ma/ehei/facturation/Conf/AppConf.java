package ma.ehei.facturation.Conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan(basePackages = "ma.ehei")
@PropertySource("classpath:app.properties")

public class AppConf {
    
}
