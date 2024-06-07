/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addimg;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import dbcon.DBConnection;
import java.io.FileOutputStream;
import java.io.InputStream;
import javax.servlet.annotation.MultipartConfig;

/**
 *
 * @author Acer
 */
@MultipartConfig
@WebServlet(name = "item1", urlPatterns = {"/item1"})
public class item1 extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       //to get the file name of the picture
        Part file = request.getPart("image");
        
        String imageFileName=file.getSubmittedFileName();
       // System.out.println("Selected file name" +imageFileName);
        String uploadPath="F:/other projects/Java-Image-and-Cart/Eleczone/web/elecimages/"+imageFileName;
        System.out.println(uploadPath);
        //request.getRequestDispatcher("second.jsp").forward(request, response);
        //to save the file to selected directory
        FileOutputStream fos = new FileOutputStream(uploadPath);
        InputStream is = file.getInputStream();
        try{
        byte[] data = new byte[is.available()];
        is.read(data);
        fos.write(data);
        fos.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        //************ for jdbc
     
        //my method
        
        PreparedStatement pst = null;
        Connection conn = null;
        
        try
     {
         String qry = "update elec set name = ? where no=1";
         conn =DBConnection.initializeDatabase();
         pst = conn.prepareStatement(qry);
         pst.setString(1, imageFileName);
         request.getRequestDispatcher("newdisplay.jsp").forward(request, response);
         
         pst.executeUpdate();
         pst.close();
         conn.close();
         
     }
     catch(Exception e)
     {
         System.out.print(e);
     }
        
    }



}
