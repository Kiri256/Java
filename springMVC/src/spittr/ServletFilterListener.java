package spittr;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.Registration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class ServletFilterListener implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        Registration.Dynamic servlet= servletContext.addServlet(
                "servlet",ServletFilterListener.class);
        servlet.addMapping("");
    }


}
