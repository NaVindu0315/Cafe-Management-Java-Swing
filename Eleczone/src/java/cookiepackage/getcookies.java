
package cookiepackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author Acer
 */
@WebServlet(name = "getcookies", urlPatterns = {"/getcookies"})
public class getcookies extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        String uname = request.getParameter("username");
        String itmname = request.getParameter("itemname");
        //System.out.println(uname);
        //System.out.println(itmname);.
        //to set values to cookie
        Cookie cref1 = new Cookie("cuname",uname);
        Cookie cref2 = new Cookie("citemname",itmname);
        //to set the age of the cookie
        cref1.setMaxAge(365*24*60*60);
        cref2.setMaxAge(365*24*60*60);
        //adding cookies
        response.addCookie(cref1);
        response.addCookie(cref2);
        
        RequestDispatcher rq = request.getRequestDispatcher("displaycookies");
        rq.forward(request, response);
        
        
        
        
        
        
    }

  
 
}
