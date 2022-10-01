<%@ page import="java.util.Map" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: daimenglaoshi
  Date: 2022/9/30
  Time: 13:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" width="400">
    <%
        //获取转发过来的list
        List<Map<String,Object>> list= (List<Map<String,Object>>) request.getAttribute("list");
        //循环的方式输出
        for(Map<String,Object> map:list) {
    %>
    <tr>
        <td><%=map.get("id").toString()%></td>
        <td><%=map.get("name").toString()%></td>
        <td><%=map.get("age").toString()%></td>
    </tr>
    <%
        }
    %>
</table>

</body>
</html>
