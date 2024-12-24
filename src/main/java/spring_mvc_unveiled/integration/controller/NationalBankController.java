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
/*
 This Path is relative to the root path /integration
 Requests to paths /integration/nb/* will be handled here
*/
@RequestMapping("nb")
class NationalBankController {
    @GetMapping
    public String nationalBank() {
        return "National Bank integration will be handled here";
    }
}
