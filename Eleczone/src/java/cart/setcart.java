/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cart;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author Acer
 */
@WebServlet(name = "setcart", urlPatterns = {"/setcart"})
public class setcart extends HttpServlet {

   
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
        
        ///to get item name
        String item1name = request.getParameter("itemname1") != null ? request.getParameter("itemname1") : "empty";
        String item2name = request.getParameter("itemname2") != null ? request.getParameter("itemname2") : "empty";
        String item3name = request.getParameter("itemname3") != null ? request.getParameter("itemname3") : "empty";
         //to get item count
         Integer item1 = parseInteger(request.getParameter("itemcount1"), 0);
         Integer item2 = parseInteger(request.getParameter("itemcount2"), 0);
         Integer item3 = parseInteger(request.getParameter("itemcount3"), 0);
         
         Integer item1total = 249000 * item1;
         Integer item2total = 219000 * item2;
         Integer item3total = 315000 * item3;
         
         Integer Total = item1total + item2total+ item3total;
         
         ///using sessions
       /*  HttpSession session = request.getSession();
         
         session.setAttribute("item1name",item1name);
         session.setAttribute("item2name",item2name);
         session.setAttribute("item3name",item3name);
         
         session.setAttribute("item1",item1);
         session.setAttribute("item2",item2);
         session.setAttribute("item3",item3);
         
         session.setAttribute("item1total",item1total);
         session.setAttribute("item2total",item2total);
         session.setAttribute("item3total",item3total);
         
         session.setAttribute("Total",Total);
         String sessionId = session.getId();
         response.sendRedirect("displaycart?sessionId=" + sessionId);
         //
      */
         
         
         //cookies
         ///for item names
         Cookie ckitemname1 = new Cookie("ckitemname1",item1name);
         Cookie ckitemname2 = new Cookie("ckitemname2",item2name);
         Cookie ckitemname3 = new Cookie("ckitemname3",item3name);
         
         ///item quantity
         Cookie ckitem1 = new Cookie("ckitem1", String.valueOf(item1));
         Cookie ckitem2 = new Cookie("ckitem2", String.valueOf(item2));
         Cookie ckitem3 = new Cookie("ckitem3", String.valueOf(item3));
         ///item total
         Cookie ckitemtotal1 = new Cookie("ckitemtotal1",String.valueOf(item1total));
         Cookie ckitemtotal2 = new Cookie("ckitemtotal2",String.valueOf(item2total));
         Cookie ckitemtotal3 = new Cookie("ckitemtotal3",String.valueOf(item3total));
         //total
         Cookie cktotal = new Cookie("cktotal",String.valueOf(Total));
         ///to set the age 
         ckitemname1.setMaxAge(365*24*60*60);
         ckitemname2.setMaxAge(365*24*60*60);
         ckitemname3.setMaxAge(365*24*60*60);
         ckitem1.setMaxAge(365*24*60*60);
         ckitem2.setMaxAge(365*24*60*60);
         ckitem3.setMaxAge(365*24*60*60);
         ckitemtotal1.setMaxAge(365*24*60*60);
         ckitemtotal2.setMaxAge(365*24*60*60);
         ckitemtotal3.setMaxAge(365*24*60*60);
         cktotal.setMaxAge(365*24*60*60);
         ///to set cookies
         //1
         response.addCookie(ckitemname1);
         //2
         response.addCookie(ckitemname2);
         //3
         response.addCookie(ckitemname3);
         //4
         response.addCookie(ckitem1);
         //5
          response.addCookie(ckitem2);
         //6
          response.addCookie(ckitem3);
         //7
          response.addCookie(ckitemtotal1);
         //8
         response.addCookie(ckitemtotal2);
         //9
         response.addCookie(ckitemtotal3);
         //10
         response.addCookie(cktotal);
         
         //navigate to display cart
         response.sendRedirect("displaycart");


         
         
        // response.sendRedirect("displaycart");
         
         
         
         
         
         
         ///to check values 
         /*System.out.println("Item name           Qty            Total");
         System.out.println(item1name+"         "+item1 +"     "+item1total);
         System.out.println(item2name+"         "+item2 +"     "+item2total);
         System.out.println(item3name+"         "+item3 +"     "+item3total);
         System.out.println("                                  "+Total);*/
         /*
         System.out.println("number");
         System.out.println(item1);
         System.out.println(item2);
         System.out.println(item3);
         System.out.println("item name");
         System.out.println(item1name);
         System.out.println(item2name);
         System.out.println(item3name);
         */
                 /*
                  ckitemname1
         ckitemname2
         ckitemname3
         ckitem1
         ckitem2
         ckitem3
         ckitemtotal1
         ckitemtotal2
         ckitemtotal3
         cktotal
                 */
        
        
    }
    
    ///for null check and assigning values
    
    private static Integer parseInteger(String value, int defaultValue) {
    if (value == null || value.isEmpty()) {
        return defaultValue;
    }
    try {
        return Integer.parseInt(value);
    } catch (NumberFormatException e) {
        // Handle potential conversion errors (e.g., invalid format)
        // You could log the error or return a different default value
        return defaultValue;
    }
}

   

}
