/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        Cookie[] cookies = request.getCookies();
if (cookies != null) {
    for (Cookie cookie : cookies) {
        // Clear the cookie
        cookie.setMaxAge(0);

        // Optionally, set the path and domain to match the original cookie
        // (important for proper deletion across paths/domains)
      /*  cookie.setPath(cookie.getPath());  // Assuming the original path is used
        // cookie.setDomain(cookie.getDomain());  // Uncomment if needed for specific domain

        // Add the modified cookie back to the response*/
        response.addCookie(cookie);
      request.getRequestDispatcher("listings.jsp").forward(request, response);
    }
}

    }

 

}
