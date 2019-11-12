<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/20
  Time: 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加账户</title>
</head>
<body>
<form action="../add" method="post">
    <input type="text" placeholder="请输入姓名" name="name">
    <input type="text" placeholder="请输入账户余额" name="money">
    <input type="submit" value="添加账户">
</form>
</body>
</html>
