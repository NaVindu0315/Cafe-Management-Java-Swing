/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package img;

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
      
        System.out.println("test");
        Part file = request.getPart("image");
        
        String imageFileName=file.getSubmittedFileName();
        System.out.println("Selected file name" +imageFileName);
        String uploadPath="F:/other projects/Java-Image-and-Cart/Eleczone/images/"+imageFileName;
        System.out.println(uploadPath);
        //request.getRequestDispatcher("second.jsp").forward(request, response);
        
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
        
    }

  

}
