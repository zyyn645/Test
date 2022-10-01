<%--
  Created by IntelliJ IDEA.
  User: daimenglaoshi
  Date: 2022/9/30
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="regServlet" method="post">
    <pre>
    用户名:<input type="text" name="uname" />
    密码:<input type="password" name="pwd" />
    性别:<input type="radio" name="sex" value="m" />男
    <input type="radio" name="sex" value="f" />女
    爱好:<input type="checkbox" name="hobby" value="0" />吃饭
    <input type="checkbox" name="hobby" value="1" />睡觉
    <input type="checkbox" name="hobby" value="2" />打豆豆
    城市:<select name="city">
             <option value="0">北京</option>
             <option value="1">上海</option>
             <option value="2">武汉</option>
          </select>
    <input type="submit" name="sub" value="注册" />
  </pre>
</form>


</body>
</html>
