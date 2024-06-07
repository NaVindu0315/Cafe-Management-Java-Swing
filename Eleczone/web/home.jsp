<%-- 
    Document   : home
    Created on : Jun 8, 2024, 3:18:01 AM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Image Update</title>
    </head>
    <body>
        <h1 align="center">Item 1</h1>
        <div align="center">
            <form action="item1" method="post" enctype="multipart/form-data">
            select image :
            <input type="file" name="image"> 
            <input type="submit" value="Add image">
        </form>
        </div>
        
         <h1 align="center">Item 2</h1>
        <div align="center">
            <form action="item2" method="post" enctype="multipart/form-data">
            select image :
            <input type="file" name="image"> 
            <input type="submit" value="Add image">
        </form>
        </div>
         
          <h1 align="center">Item 3</h1>
        <div align="center">
            <form action="item3" method="post" enctype="multipart/form-data">
            select image :
            <input type="file" name="image"> 
            <input type="submit" value="Add image">
        </form>
        </div>
          <h1 align="center"><a href="newdisplay.jsp">view Items</a></h1>
    </body>
</html>
