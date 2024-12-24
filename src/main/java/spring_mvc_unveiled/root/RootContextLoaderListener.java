package spring_mvc_unveiled.root;

import jakarta.servlet.annotation.WebListener;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

/**
 * {@link org.springframework.web.context.ContextLoaderListener ContextLoaderListener} is
 * a {@link jakarta.servlet.ServletContextListener ServletContextListener } that loads the root {@link org.springframework.web.context.WebApplicationContext WebApplicationContext }.
 * The root application context is the parent of all WebApplicationContexts
 * created by {@link org.springframework.web.servlet.DispatcherServlet DispatcherServlet} instances
 */
@WebListener
public class RootContextLoaderListener extends ContextLoaderListener {

    /**
     * Here we are using the overloaded constructor to directly pass an instance of
     * {@link org.springframework.web.context.WebApplicationContext WebApplicationContext}.
     * Alternatively, we could add the following in the web.xml <pre> {@code  <context-param>
     *        <param-name>contextClass</param-name>
     *        <param-value>spring_mvc_unveiled.root.RootApplicationContext</param-value>
     *    </context-param> }</pre>
     */
    public RootContextLoaderListener() {
        super(createContext());
    }

    private static AnnotationConfigWebApplicationContext createContext() {
        var context = new AnnotationConfigWebApplicationContext();
        context.register(RootApplicationContextConfig.class);
        return context;
    }
}
