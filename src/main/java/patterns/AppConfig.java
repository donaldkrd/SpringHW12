package patterns;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import patterns.model.TaskFactoryImpl;

@Configuration
public class AppConfig {
    @Bean
    public TaskFactoryImpl taskFactory(){
        return new TaskFactoryImpl();
    }
}
