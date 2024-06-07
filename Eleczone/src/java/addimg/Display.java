/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addimg;

import dbcon.DBConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Acer
 */
@WebServlet(name = "Display", urlPatterns = {"/Display"})
public class Display extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    }

   
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
         //to catch the image id 
       
        
        
        //to fetch data from the db
        
        Statement pst = null;
        Connection conn = null;
        
        int imdId=0;
        String imgFileName= null;
        
        String pic1 =null;
        String pic2 = null;
        String pic3 = null;
        
        try
     {
         String qry ="select * from elec";
         conn =DBConnection.initializeDatabase();
         pst = conn.createStatement();
         
         ResultSet rs = pst.executeQuery(qry);
         
         while(rs.next())
         {
             if(rs.getInt("no")==1)
             {
                
                 pic1=rs.getString("name");
                 System.out.println("name"+pic1);
               
             }
             else if (rs.getInt("no")==2)
             {
                 pic2=rs.getString("name");
             }
             else if(rs.getInt("no")==3)
             {
                 pic3=rs.getString("name");
             }
         }
         
         
         
         pst.close();
         conn.close();
         
     }
     catch(Exception e)
     {
         System.out.print(e);
     }
        
        
        request.setAttribute("pic1", pic1);
        request.setAttribute("pic2", pic2);
        request.setAttribute("pic3", pic3);
        request.getRequestDispatcher("newdisplay.jsp").forward(request, response);
        
    }


}
