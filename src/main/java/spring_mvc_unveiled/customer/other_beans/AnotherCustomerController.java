package spring_mvc_unveiled.customer.other_beans;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("another")
public class AnotherCustomerController {
    @GetMapping
    public String anotherHandler() {
        return "another";
    }
}
