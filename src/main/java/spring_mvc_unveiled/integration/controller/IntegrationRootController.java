package spring_mvc_unveiled.integration.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
    This controller is scanned by the integrationAppServlet-servlet.xml
    config file, that is why it is handled by integrationAppServlet, a
    {@link org.springframework.web.servlet.DispatcherServlet DispatcherServlet}
    registered in the web.xml file
**/
@RestController
@RequestMapping // No path is specified here, the root path /integration will come here
public class IntegrationRootController {
    @GetMapping
    public String root() {
        return "Integration with third parties";
    }

}
