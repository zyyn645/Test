<%--
  Created by IntelliJ IDEA.
  User: daimenglaoshi
  Date: 2022/9/30
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<a href="">
<%
  String uname= request.getAttribute("msg").toString();
  out.print(uname);
%>
</a>
</body>
</html>
