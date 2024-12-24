package spring_mvc_unveiled.customer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 This controller is scanned by the {@link  spring_mvc_unveiled.customer.CustomerAppServlet.CustomerAppApplicationContext CustomerAppApplicationContext}
 class, that is why it is handled by customerAppServlet, a
 {@link org.springframework.web.servlet.DispatcherServlet DispatcherServlet}
 registered by the {@link jakarta.servlet.annotation.WebServlet  @WebServlet } annotation
 **/
@RestController
@RequestMapping// No path is specified here, the root path /customer will come here
public class CustomerRootController {

    @GetMapping
    public String root() {
        return "All customer requests come handled by this controller";
    }

}
