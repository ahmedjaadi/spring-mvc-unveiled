package spring_mvc_unveiled.customer.config;

import spring_mvc_unveiled.customer.interceptor.BalanceInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
public class CustomerWebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
/*
        the path pattern is relative to the DispatcherServlet root path
        in this case /customer
*/
        registry.addInterceptor(new BalanceInterceptor()).addPathPatterns("/**");
    }
}
