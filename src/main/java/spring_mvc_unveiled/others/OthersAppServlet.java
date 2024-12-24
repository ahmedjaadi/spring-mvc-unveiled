package spring_mvc_unveiled.others;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * {@link org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer AbstractAnnotationConfigDispatcherServletInitializer }
 * is a convenient class Spring provides to simplify initialization of {@link org.springframework.web.servlet.DispatcherServlet  DispatcherServlet }
 * from Java config classes, you can also provide config classes for the root {@link org.springframework.web.context.WebApplicationContext  WebApplicationContext }
 */
public class OthersAppServlet extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    public String[] getServletMappings() {
        return new String[]{"/others"};
    }

    @Override
    public Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    /*
     * Since this method returns an empty array, a DispatcherServlet will be created
     * whose WebApplicationContext has no application beans.
     * You can override this by supplying a list of your own config classes.
     */
    public Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }
}
