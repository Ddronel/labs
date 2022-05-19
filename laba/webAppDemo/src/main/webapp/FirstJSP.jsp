<%--
  Created by IntelliJ IDEA.
  User: dronel
  Date: 5/14/22
  Time: 8:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Testing JSP</title>
</head>
<body>
  <h1>Test</h1>
  <%

    java.util.Date now = new java.util.Date();
    String some = "Текущая дата  :   : " + now;
    out.println(some);
  %>
</body>
</html>
