
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
@WebServlet(name = "Item3cart", urlPatterns = {"/Item3cart"})
public class Item3cart extends HttpServlet {

 
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
       
        response.setContentType("text/html");
        String item3name = request.getParameter("itemname3");
        Integer item3 = Integer.parseInt(request.getParameter("itemcount3"));
        Integer item3total = 315000 * item3;
        
        Cookie ckitemname3 = new Cookie("ckitemname3",item3name);
        Cookie ckitem3 = new Cookie("ckitem3", String.valueOf(item3));
        Cookie ckitemtotal3 = new Cookie("ckitemtotal3",String.valueOf(item3total));
        
        ckitemname3.setMaxAge(365*24*60*60);
        ckitem3.setMaxAge(365*24*60*60);
        ckitemtotal3.setMaxAge(365*24*60*60);
        response.addCookie(ckitemname3);
        response.addCookie(ckitem3);
        response.addCookie(ckitemtotal3);
        response.sendRedirect("displaycart");
        
    }

 
 

}
