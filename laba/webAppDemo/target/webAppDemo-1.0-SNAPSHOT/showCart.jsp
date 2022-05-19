<%@ page import="com.example.webappdemo.Cart" %><%--
  Created by IntelliJ IDEA.
  User: dronel
  Date: 5/19/22
  Time: 3:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>show cart</title>
</head>
<body>
    <% Cart cart = (Cart) session.getAttribute("cart"); %>

    <p> Наименование: <%= cart.getName() %> </p>
    <p> Количество: <%= cart.getQuantity() %> </p>
</body>
</html>
