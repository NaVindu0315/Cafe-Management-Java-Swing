
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
@WebServlet(name = "Item2cart", urlPatterns = {"/Item2cart"})
public class Item2cart extends HttpServlet {

 
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
        String item2name = request.getParameter("itemname2");
        Integer item2 = Integer.parseInt(request.getParameter("itemcount2"));
        Integer item2total = 219000 * item2;
        
        Cookie ckitemname2 = new Cookie("ckitemname2",item2name);
        Cookie ckitem2 = new Cookie("ckitem2", String.valueOf(item2));
        Cookie ckitemtotal2 = new Cookie("ckitemtotal2",String.valueOf(item2total));
        
        ckitemname2.setMaxAge(365*24*60*60);
        ckitem2.setMaxAge(365*24*60*60);
        ckitemtotal2.setMaxAge(365*24*60*60);
        response.addCookie(ckitemname2);
        response.addCookie(ckitem2);
        response.addCookie(ckitemtotal2);
        response.sendRedirect("displaycart");
    }

   
  

}
