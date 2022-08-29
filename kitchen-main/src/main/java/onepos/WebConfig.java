package onepos;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
    	System.out.println("======================================TESTSETSETAT");
        registry.addMapping("/**").
        allowedOrigins("*")
        .allowedMethods("OPTIONS", "GET", "POST", "PUT", "DELETE");
    }
}