<%--
  Created by IntelliJ IDEA.
  User: 刘佳磊
  Date: 2021/8/5
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<%--$END$--%>
<%
    pageContext.setAttribute("baseUrl", request.getContextPath());
%>
<form action="${baseUrl}/user" method="post">
    <input type="submit" value="post">
</form>
<form action="${baseUrl}/user/1" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="delete">
</form>
<form action="${baseUrl}/user/1" method="post">
    <input type="hidden" name="_method" value="put">
    <input type="submit" value="put">
</form>
<form action="${baseUrl}/user/1" method="post">
    <input type="submit" value="get1111">
</form>
qqqq
</body>
</html>
