<%-- 
    Document   : cookiepage
    Created on : Jun 8, 2024, 12:27:18 PM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get Cookies</title>
    </head>
    <body>
        <h1>Cookies</h1>
        <h2>
        <div align="center">
            <form action="getcookies" method="post">
                User name
                <input type="text" name="username">
                Item name
                <input type="text" name="itemname">
                <input type="submit" value="save">
            </form>
        </div>
            </h2>
    </body>
</html>
