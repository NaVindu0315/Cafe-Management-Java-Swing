
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
        
        ///for item2
        Cookie ckitemname2 = new Cookie("ckitemname2", "");
        ckitemname2.setMaxAge(0);
        response.addCookie(ckitemname2);
        
        Cookie ckitem2 = new Cookie("ckitem2", "");
        ckitem2.setMaxAge(0);
        response.addCookie(ckitem2);
        
        Cookie ckitemtotal2 = new Cookie("ckitemtotal2", "");
        ckitemtotal2.setMaxAge(0);
        response.addCookie(ckitemtotal2);
        
        //for 3rd item
        Cookie ckitemname3 = new Cookie("ckitemname3", "");
        ckitemname3.setMaxAge(0);
        response.addCookie(ckitemname3);
        
        Cookie ckitem3 = new Cookie("ckitem3", "");
        ckitem3.setMaxAge(0);
        response.addCookie(ckitem3);
        
        Cookie ckitemtotal3 = new Cookie("ckitemtotal3", "");
        ckitemtotal3.setMaxAge(0);
        response.addCookie(ckitemtotal3);
        
        response.sendRedirect("listings.jsp");
        
    }

   
   

}
