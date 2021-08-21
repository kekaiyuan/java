<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 2020/3/15
  Time: 21:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    pageContext.setAttribute("ctp", request.getContextPath());
%>
<body>
<%--<form action="${ctp}/validation" method="post">--%>
<%--id：<input type="text" name="id">${errors.id}<br>--%>
<%--name：<input type="text" name="name">${errors.name}<br>--%>
<%--age：<input type="text" name="age">${errors.age}<br>--%>
<%--gender：<input type="text" name="gender">${errors.gender}<br>--%>
<%--birth：<input type="text" name="birth">${errors.birth}<br>--%>
<%--email：<input type="text" name="email">${errors.email}<br>--%>
<%--<input type="submit" value="login"><br>--%>
<%--</form>--%>
<form:form action="${ctp}/validation" modelAttribute="person" method="post">

    编号:<form:input path="id"></form:input><form:errors path="id"></form:errors>--->${errorInfo.id} <br/>
    姓名:<form:input path="name"></form:input><form:errors path="name"></form:errors>--->${errorInfo.name}<br/>
    年龄:<form:input path="age"></form:input><form:errors path="age"></form:errors>--->${errorInfo.age}<br/>
    性别:<form:input path="gender"></form:input><form:errors path="gender"></form:errors>--->${errorInfo.gender}<br/>
    生日:<form:input path="birth"></form:input><form:errors path="birth"></form:errors>--->${errorInfo.birth}<br/>
    邮箱:<form:input path="email"></form:input><form:errors path="email"></form:errors>--->${errorInfo.email}<br/>
    <input type="submit" value="submit">

</form:form>
</body>
</html>
