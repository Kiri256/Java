import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Date;


public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        try{
            response.getWriter().println("<h1>Hello Servlet!</h1>");
            response.getWriter().println(new Date());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
