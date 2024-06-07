<%-- 
    Document   : newdisplay
    Created on : Jun 8, 2024, 3:21:46 AM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display Items </title>
        
    </head>
    <body>
        
        <%
            
            
            String pic1 = (String)request.getAttribute("pic1");
            String pic2 = (String)request.getAttribute("pic2");
            String pic3 = (String)request.getAttribute("pic3");
            
            System.out.println(pic1);
            
            

            %>
        
        <h1 align="center">View Items!</h1>
        <h1 align="center"><a href="home.jsp">Home</a></h1>
        <form action="Display" method="post">
            
            <input type="submit" value="Get Images">
        <h1>< </h1>
        </form>
        
        
        <h1 align="center"> Item 1</h1>
        <div align="center">><img src="elecimages/<%=pic1%>" height="300" width="300" ></div>
        <hr>
        <h1 align="center"> Item 2</h1>
        <div align="center">><img src="elecimages/<%=pic2%>" height="300" width="300" ></div>
        <hr>
        <h1 align="center"> Item 1</h1>
        <div align="center">><img src="elecimages/<%=pic3%>" height="300" width="300" ></div>
    </body>
</html>
