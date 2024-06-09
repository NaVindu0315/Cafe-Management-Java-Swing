<%-- 
    Document   : listings
    Created on : Jun 8, 2024, 10:06:07 PM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Items</title>
    </head>
    <body>
        <h1>Items</h1>
        <hr>
        <div align="center">
            <h1>
                <form action="Item1cart" method="post">
                    Iphone 15
                    <br>
                    <select name="itemname1">
                    <option value="">Select your item</option>
                   
                    <option value="Iphone15">Iphone 15</option>
                    </select>
                    <br>
                    <input type="number" name="itemcount1">
                    <br>
                    <input type="submit" value="Add to cart">
                    
                    
                    
                </form>
            </h1>
            </div>
         <hr>
         <div align="center">
            <h1>
                <form action="Item2cart" method="post">
                    Iphone 14
                   <br>
                    <select name="itemname2">
                    <option value="">Select your item</option>
                   
                    <option value="Iphone14">Iphone 14</option>
                    </select>
                    <br>
                    <input type="number" name="itemcount2">
                    <br>
                    <input type="submit" value="Add to cart">
                    
                    
                    
                </form>
            </h1>
            </div>
          <hr>
         <div align="center">
            <h1>
                <form action="Item3cart" method="post">
                    MacBook Air M3
                   <br>
                    <select name="itemname3">
                    <option value="">Select your item</option>
                   
                    <option value="MacBook_Air_M3">MacBook Air M3</option>
                    </select>
                    <br>
                    <input type="number" name="itemcount3">
                    <br>
                    <input type="submit" value="Add to cart">
                    
                    
                    
                </form>
            </h1>
            </div>
          <div align="center">
              <form action="clearcart" method="post">
                  <input type="submit" value="clear cart">
              </form>
          </div>
          <div align="center">
              <form action="displaycart" method="post">
                  <input type="submit" value="check cookies">
              </form>
          </div>
        
    </body>
</html>
