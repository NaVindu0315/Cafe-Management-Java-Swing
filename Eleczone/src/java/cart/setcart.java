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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
        String item1name = request.getParameter("itemname1") != null ? request.getParameter("itemname1") : "";
        String item2name = request.getParameter("itemname2") != null ? request.getParameter("itemname2") : "";
        String item3name = request.getParameter("itemname3") != null ? request.getParameter("itemname3") : "";
        
        //to get item count
         Integer item1 = parseInteger(request.getParameter("itemcount1"), 0);
         Integer item2 = parseInteger(request.getParameter("itemcount2"), 0);
         Integer item3 = parseInteger(request.getParameter("itemcount3"), 0);
         
         Integer item1total = 249000 * item1;
         Integer item2total = 219000 * item2;
         Integer item3total = 315000 * item3;
         
         Integer Total = item1total + item2total+ item3total;
         
         
         
         ///to check values 
         System.out.println("Item name           Qty            Total");
         System.out.println(item1name+"         "+item1 +"     "+item1total);
         System.out.println(item2name+"         "+item2 +"     "+item2total);
         System.out.println(item3name+"         "+item3 +"     "+item3total);
         System.out.println("                                  "+Total);
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
