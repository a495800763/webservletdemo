<%--
  Created by IntelliJ IDEA.
  User: liumq
  Date: 2021/6/11
  Time: 下午 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<h1>登录</h1>
<div style="text-align: center">
    <form action="${pageContext.request.contextPath}/login" method="post">
        用户名：<input type="text" name="username">  <br>
        密码： <input type="password" name="password"> <br>
        爱好：
        <input type="checkbox" name="hobby" value="电影"> 电影
        <input type="checkbox" name="hobby" value="唱歌"> 唱歌
        <input type="checkbox" name="hobby" value="读书"> 读书
        <br>
        <input type="submit">
    </form>
</div>
</body>
</html>
