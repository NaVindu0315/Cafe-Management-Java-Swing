
package cookiepackage;

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
@WebServlet(name = "displaycookies", urlPatterns = {"/displaycookies"})
public class displaycookies extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Cookie arr[] = request.getCookies();
        out.print("<h1>user name "+arr[1].getValue()+"</h1>");
        out.print("<h1>item name "+arr[2].getValue()+"</h1>");
        System.out.println(arr[0].getValue());
        System.out.println(arr[1].getValue());
        out.close();
        
        
        
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }



}
