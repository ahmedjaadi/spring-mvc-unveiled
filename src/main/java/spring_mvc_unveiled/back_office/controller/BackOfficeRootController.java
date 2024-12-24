package spring_mvc_unveiled.back_office.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping // No path is specified here, the root path /back_office will come here
public class BackOfficeRootController {
    @GetMapping
    public String root() {
        return """
                Hello world!, I am a Spring MVC app, I swear No Spring Boot
                Back office requests""";
    }
}
