<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/20
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改账户</title>
</head>
<body>
<form action="../update" method="post">
    <input type="hidden" name="id" value="${account.id}"/>
    <input type="text" name="name" value="${account.name}"/>
    <input type="text" name="money" value="${account.money}"/>
    <input type="submit" value="修改"/>
</form>
</body>
</html>
