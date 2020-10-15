package wrx.rb.demo.postprocessor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean(initMethod = "manInit",destroyMethod = "manDestroy")
    public Man getMan () {
        return new Man();
    }

    @Bean(initMethod = "cupInit",destroyMethod = "cupDestroy")
    public Cup getCup () {
        return new Cup();
    }

    @Bean(initMethod = "waterInit",destroyMethod = "waterDestroy")
    public Water getWater () {
        return new Water();
    }

}
