package spring_mvc_unveiled.customer;


import spring_mvc_unveiled.customer.other_beans.AnotherCustomerController;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serial;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@WebServlet(value = "/customer/*", name = "customerAppServlet", loadOnStartup = 1, initParams = {
        @WebInitParam(name = "contextClass", value = "spring_mvc_unveiled.customer.CustomerAppServlet.CustomerAppApplicationContext")
})
public class CustomerAppServlet extends DispatcherServlet {
    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.service(request, response);
    }

    public CustomerAppServlet() {
/*
        If you remove the Servlet initial parameters "contextClass" above,
        and uncomment below line, it will work the same
*/

//        setContextClass(CustomerAppApplicationContext.class);
    }

    static class CustomerAppApplicationContext extends AnnotationConfigWebApplicationContext {
        public CustomerAppApplicationContext() {
            this.scan("spring_mvc_unveiled.customer.config","spring_mvc_unveiled.customer.controller");
            this.register(AnotherCustomerController.class);
        }
    }
}
