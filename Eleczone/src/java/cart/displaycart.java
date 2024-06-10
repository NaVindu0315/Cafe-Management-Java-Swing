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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Acer
 */
@WebServlet(name = "displaycart", urlPatterns = {"/displaycart"})
public class displaycart extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
      
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        
        //session
        /*
        HttpSession session = request.getSession();
        String item1name = (String) session.getAttribute("item1name");
        String item2name = (String) session.getAttribute("item2name");
        String item3name = (String) session.getAttribute("item3name");
        
        int item1 = (int) session.getAttribute("item1");
        int item2 = (int) session.getAttribute("item2");
        int item3 = (int) session.getAttribute("item3");
        
        int item1total = (int) session.getAttribute("item1total");
        int item2total = (int) session.getAttribute("item2total");
        int item3total = (int) session.getAttribute("item3total");
        
        int Total = (int)session.getAttribute("Total");
        
        System.out.println("item 1 ="+item1name);
        System.out.println("item 2 ="+item2name);
        System.out.println("item 3 ="+item3name);
        
        System.out.println("item 1 count ="+item1);
        System.out.println("item 2 count ="+item2);
        System.out.println("item 3 count ="+item3);
        
        System.out.println("item 1 total ="+item1total);
        System.out.println("item 2 total ="+item2total);
        System.out.println("item 3 total ="+item3total);
        
        System.out.println("Total ="+Total);
        */
        
        //to cookies
        String item1name = "";
        String item2name = "";
        String item3name = "";
        String item1 = "";
        String item2 = "";
        String item3 = "";
       /* String item1total = "";
        String item2total = "";
        String item3total = ""; */
        double item1total = 0.0;
        double item2total = 0.0;
        double item3total = 0.0; 
        String Total = "";
        String total1 = "";
        String total2 = "";
        String total3= "";
        
        double totaltoal = item1total + item2total+ item3total;
        
        Cookie[] cookies = request.getCookies();
        
        if (cookies!= null) {
    for (Cookie cookie : cookies) {
        if (cookie.getName().equals("ckitemname1")) {
            item1name = cookie.getValue();
        } else if (cookie.getName().equals("ckitemname2")) {
            item2name = cookie.getValue();
        } else if (cookie.getName().equals("ckitemname3")) {
            item3name = cookie.getValue();
        } else if (cookie.getName().equals("ckitem1")) {
            item1 = cookie.getValue();
        } else if (cookie.getName().equals("ckitem2")) {
            item2 = cookie.getValue();
        } else if (cookie.getName().equals("ckitem3")) {
            item3 = cookie.getValue();
        } 
         else if (cookie.getName().equals("ckitemtotal1")) {
    item1total = cookie.getValue()!= null? Double.parseDouble(cookie.getValue()) : 0.0;
    total1=cookie.getValue();
    
} else if (cookie.getName().equals("ckitemtotal2")) {
    item2total = cookie.getValue()!= null? Double.parseDouble(cookie.getValue()) : 0.0;
    total2=cookie.getValue();
} else if (cookie.getName().equals("ckitemtotal3")) {
    item3total = cookie.getValue()!= null? Double.parseDouble(cookie.getValue()) : 0.0;
    total3=cookie.getValue();
        /*else if (cookie.getName().equals("ckitemtotal1")) {
            item1total = cookie.getValue();
        } else if (cookie.getName().equals("ckitemtotal2")) {
            item2total = cookie.getValue();
        } else if (cookie.getName().equals("ckitemtotal3")) {
            item3total = cookie.getValue();
        }*/
        
        
        
        
}else if (cookie.getName().equals("cktotal")) {
            Total = cookie.getValue();
        }
    }
    
    System.out.println("item 1 ="+item1name);
        System.out.println("item 2 ="+item2name);
        System.out.println("item 3 ="+item3name);
        
        System.out.println("item 1 count ="+item1);
        System.out.println("item 2 count ="+item2);
        System.out.println("item 3 count ="+item3);
        
        System.out.println("item 1 total ="+item1total);
        System.out.println("item 2 total ="+item2total);
        System.out.println("item 3 total ="+item3total);
        
        System.out.println("Total ="+(item1total+item2total+item3total));
     /*   out.print("<h1 align='center'> Pako");
        out.print("</h1>");
        
        out.print("<div align='center'>");
        out.print("<h2>");
        out.print("<table align=>");
        out.print("  <tr>");
        out.print("    <td>Column 1</td>");
    out.print("    <td>Column 2</td>");
    out.print("    <td>Column 3</td>");
    out.print("  </tr>");
    out.print("  <tr>");
    out.print("    <td>Data 1</td>");
    out.print("    <td>Data 2</td>");
    out.print("    <td>Data 3</td>");
    out.print("  </tr>");
    out.print("  <tr>");
    out.print("    <td>Data 4</td>");
    out.print("    <td>Data 5</td>");
    out.print("    <td>Data 6</td>");
    out.print("  </tr>");
    out.print("  <tr>");
    out.print("    <td>Data 7</td>");
    out.print("    <td>Data 8</td>");   
    out.print("    <td>Data 9</td>");   
    out.print("  </tr>");
    out.print("</table>");
    out.print("</h2>");
    out.print("</div>");*/
                out.print("<!DOCTYPE html>");
out.print("<html>");
out.print("<head>");
out.print("<title>Cart</title>");
out.print("</head>");
out.print("<body>");

out.print("<h1 style='text-align: center;'> Shopping cart </h1>");

out.print("<div align='center'>");
out.print("<h2>");
out.print("<table>");
out.write("  <tr>");
out.write("    <td style='width: 150px; height: 70px;'>  Item</td>");  // Increased width and height for data cells
out.write("    <td style='width: 150px; height: 70px;'>Count</td>");
out.write("    <td style='width: 150px; height: 70px;'>Total</td>");
out.write("  </tr>");
out.write("  <tr>");
out.write("    <td style='width: 150px; height: 70px;'>"+item1name+"</td>");  // Increased width and height for data cells
out.write("    <td style='width: 150px; height: 70px;'>"+item1+"</td>");
out.write("    <td style='width: 150px; height: 70px;'>"+total1+"</td>");
out.write("  </tr>");
out.write("  <tr>");
out.write("    <td style='width: 150px; height: 70px;'>"+item2name+"</td>");
out.write("    <td style='width: 150px; height: 70px;'>"+item2+"</td>");
out.write("    <td style='width: 150px; height: 70px;'>"+total2+"</td>");
out.write("  </tr>");
out.write("  <tr>");
out.write("    <td style='width: 150px; height: 70px;'>"+item3name+"</td>");
out.write("    <td style='width: 150px; height: 70px;'>"+item3+"</td>");
out.write("    <td style='width: 150px; height: 70px;'>"+total3+"</td>");
out.write("  </tr>");

out.write("  <tr>");
out.write("    <td style='width: 150px; height: 70px;'></td>");
out.write("    <td style='width: 150px; height: 70px;'>Total</td>");
out.write("    <td style='width: 150px; height: 70px;'>"+(item1total+item2total+item3total)+ "</td>");
out.write("  </tr>");
out.print("</table>");
out.print("</h2>");
out.print("</div>");


out.print("<div align='center'>");
out.print("  <form action='clearcart' method='post'>");
out.print("    <input type='submit' value='Pay Now'>");
out.print("  </form>");
out.print("</div>");


out.print("</body>");
out.print("</html>");
     
     

       /* Cookie arr[] = request.getCookies();
        out.print("<h1 align='center'> Pako");
        out.print("</h1>");
        System.out.println("new list");
        System.out.println("1 name 1");
        System.out.println(arr[1].getValue());
        System.out.println("2 name 2");
        System.out.println(arr[2].getValue());
        System.out.println("3 name 3");
        System.out.println(arr[3].getValue());
        System.out.println("4 item 1 count");
        System.out.println(arr[4].getValue());
        System.out.println("5 item 2 count");
        System.out.println(arr[5].getValue());
        System.out.println("6 item 3 count");
        System.out.println(arr[6].getValue());
        System.out.println("7 item 1 total");
        System.out.println(arr[7].getValue());
        System.out.println("8 item 2 total");
        System.out.println(arr[8].getValue());
        System.out.println("9 item 3 total");
        System.out.println(arr[9].getValue());
        System.out.println("10 tota;");
        System.out.println(arr[10].getValue());
        System.out.println("end of list");*/
    }
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }



}
