<%-- 
    Document   : displayimage
    Created on : Jun 8, 2024, 1:23:04 AM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display Image</title>
    </head>
    <body>
        <h1 align="center">Display Image Details</h1>
        <div>
            <a href="index.jsp">Add Image Page</a>
        </div>
        <div align="center">
            <form action="Displayimg" method="post">
                Enter Image ID: 
                <input type="number" name="imageId">
                <input type="submit" value="Display Image">
                
            </form>
        </div>
        <hr>
        <%
            String imgFilename =(String)request.getAttribute("img");
            String imgId =(String)request.getAttribute("id");
            //System.out.println(imgId);
            System.out.println("name" + imgFilename);
            

            %>
        <div align="center">
            
            <table border="5px" style="width: 600px">
                <tr>
                    <th>Image ID </th>
                    <th>Image </th>
                    
                </tr>>
                <%
                    if(imgFilename!=""&& imgId!="")
                    {
                    
                    %>
                
                <tr>
                    <td><%=imgId %> </td>
                    <td> <img src="images/<%=imgFilename%>"> </td>
                    
                </tr>
                <%
                    }
                    %>
            </table>
            
        </div>
    </body>
</html>
