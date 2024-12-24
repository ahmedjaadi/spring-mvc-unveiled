package spring_mvc_unveiled.back_office.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "spring_mvc_unveiled.back_office.controller")
@Configuration
public class BackOfficeWebConfig {
}
