<%-- 
    Document   : addimage
    Created on : Jun 7, 2024, 10:50:53 PM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Image</title>
        
    </head>
    <body>
        <h1 style="color: red" align="center">Add image Details </h1>
        <div align="center">
            <form action="addimage" method="post" enctype="multipart/form-data">
            select image :
            <input type="file"> 
            <input type="submit" value="Add image">
        </form>
        </div>
    </body>
</html>
