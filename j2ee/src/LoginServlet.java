import jakarta.servlet.GenericServlet;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class LoginServlet extends HttpServlet implements Servlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name=req.getParameter("name");
        String password=req.getParameter("password");

        System.out.println("name"+name);
        System.out.println("password"+password);

        if("1".equals(name)&&"1".equals(password)) {
            req.getRequestDispatcher("success.html").forward(req,resp);
        }
        else{
            resp.sendRedirect("fail.html");

        }
    }

}
