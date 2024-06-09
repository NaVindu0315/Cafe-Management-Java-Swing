
package cart;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Acer
 */
@WebServlet(name = "clearcart", urlPatterns = {"/clearcart"})
public class clearcart extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cookie ckitemname1 = new Cookie("ckitemname1", "");
        ckitemname1.setMaxAge(0);
        response.addCookie(ckitemname1);
        
        Cookie ckitem1 = new Cookie("ckitem1", "");
        ckitem1.setMaxAge(0);
        response.addCookie(ckitem1);
        
        Cookie ckitemtotal1 = new Cookie("ckitemtotal1", "");
        ckitemtotal1.setMaxAge(0);
        response.addCookie(ckitemtotal1);
        
        response.sendRedirect("listings.jsp");
        
    }

   
   

}
