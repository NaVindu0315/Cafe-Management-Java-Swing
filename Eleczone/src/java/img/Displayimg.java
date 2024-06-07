/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package img;

import java.sql.*;
import dbcon.DBConnection;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.DispatcherType;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Acer
 */
@WebServlet(name = "Displayimg", urlPatterns = {"/Displayimg"})
public class Displayimg extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

 

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //to catch the image id 
        String imageId = request.getParameter("imageId"); 
        int id = Integer.parseInt(imageId);
        System.out.println(imageId);
        
        
        //to fetch data from the db
        
        Statement pst = null;
        Connection conn = null;
        
        int imdId=0;
        String imgFileName= null;
        
        try
     {
         String qry ="select * from image";
         conn =DBConnection.initializeDatabase();
         pst = conn.createStatement();
         
         ResultSet rs = pst.executeQuery(qry);
         
         while(rs.next())
         {
             if(rs.getInt("imageid")==id)
             {
                 imdId=rs.getInt("imageid");
                 imgFileName=rs.getString("imagefilename");
                // System.out.println("name" + imgFileName);
             }
             else
             {
             }
         }
         
         
         
         pst.close();
         conn.close();
         
     }
     catch(Exception e)
     {
         System.out.print(e);
     }
        
        //RequestDispatcher rd;
        request.setAttribute("id",String.valueOf(imdId) );
        request.setAttribute("img", imgFileName);
        request.getRequestDispatcher("displayimage.jsp").forward(request, response);
        
    }
        
        
        
    }

  


