<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/8/2021
  Time: 2:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
  <h1>Product Discount Calculator</h1>
  <form action="/Discount" method="post">
    <h3>Product Description</h3>
    <input type="text" name="Description" placeholder="Product Description"><br>
    <h3> List Price</h3>
    <input type="text" name="Price" placeholder=" List Price"><br>
    <h3>Discount Percent</h3>
    <input type="text" name="submit" value="Discount Percent" ><br>
    <input type="submit" name="" placeholder="Search">

  </form>
  </body>
</html>
