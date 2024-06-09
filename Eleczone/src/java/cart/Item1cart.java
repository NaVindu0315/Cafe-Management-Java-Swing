
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
@WebServlet(name = "Item1cart", urlPatterns = {"/Item1cart"})
public class Item1cart extends HttpServlet {


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
        String item1name = request.getParameter("itemname1");
        Integer item1 = Integer.parseInt(request.getParameter("itemcount1"));
        Integer item1total = 249000 * item1;
        
        Cookie ckitemname1 = new Cookie("ckitemname1",item1name);
        Cookie ckitem1 = new Cookie("ckitem1", String.valueOf(item1));
        Cookie ckitemtotal1 = new Cookie("ckitemtotal1",String.valueOf(item1total));
        
        ckitemname1.setMaxAge(365*24*60*60);
        ckitem1.setMaxAge(365*24*60*60);
        ckitemtotal1.setMaxAge(365*24*60*60);
        response.addCookie(ckitemname1);
        response.addCookie(ckitem1);
        response.addCookie(ckitemtotal1);
        response.sendRedirect("displaycart");
    }



}
