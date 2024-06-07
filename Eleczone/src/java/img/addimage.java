/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package img;

//import com.mysql.jdbc.Connection;
import java.sql.*;
//import java.sql.Connection;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import dbcon.DBConnection;


/**
 *
 * @author Acer
 */
@MultipartConfig
@WebServlet(name = "addimage", urlPatterns = {"/addimage"})
public class addimage extends HttpServlet {

    
    

    

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        //to get the file name of the picture
        Part file = request.getPart("image");
        
        String imageFileName=file.getSubmittedFileName();
       // System.out.println("Selected file name" +imageFileName);
        String uploadPath="F:/other projects/Java-Image-and-Cart/Eleczone/web/images/"+imageFileName;
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
        /*Connection connection = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/image_tutorial", "", "");
           // PreparedStatement stmt;
           PreparedStatement stmt = connection.prepareStatement("insert into image(imagefilename) values(?)");

           // String query ="insert into image(imagefilename) values(?)";
            //stmt.connection.prepareStatement(query);
            stmt.setString(1, imageFileName);
            int rows = stmt.executeUpdate();
            if(rows>0)
            {
                   System.out.println("Added succesfully");
            }
            else
            {
                System.out.println("failed to upload");
            }
            
        }
        catch(Exception e)
        {
               System.out.println(e);
        }
        */
        //my method
        
        PreparedStatement pst = null;
        Connection conn = null;
        
        try
     {
         String qry ="insert into image(imagefilename) values(?)";
         conn =DBConnection.initializeDatabase();
         pst = conn.prepareStatement(qry);
         pst.setString(1, imageFileName);
         
         
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

  


