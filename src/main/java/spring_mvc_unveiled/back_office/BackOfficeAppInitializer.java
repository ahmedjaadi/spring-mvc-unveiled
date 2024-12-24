package spring_mvc_unveiled.back_office;

import spring_mvc_unveiled.back_office.config.BackOfficeWebConfig;
import jakarta.servlet.ServletContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class BackOfficeAppInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) {
        var webApplicationContext = new AnnotationConfigWebApplicationContext();
        webApplicationContext.register(BackOfficeWebConfig.class);
        var dispatcherServlet = new DispatcherServlet(webApplicationContext);
        var dispatcher = servletContext.addServlet("backOfficeAppServlet", dispatcherServlet);
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/back_office/*");
    }
}
