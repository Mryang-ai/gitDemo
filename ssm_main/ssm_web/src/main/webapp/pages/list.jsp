<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/20
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>账户详情</title>
</head>
<body>
<table border="1px" width="40%" align="center">
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>余额</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${list}" var="account">
        <tr>
            <td>${account.id}</td>
            <td>${account.name}</td>
            <td>${account.money}</td>
            <td>
                <input type="submit" onclick="location.href='${pageContext.request.contextPath}/findById?id=${account.id}'" value="修改" />
                <input type="submit" onclick="location.href='${pageContext.request.contextPath}/delete?id=${account.id}'" value="删除" />
            </td>
        </tr>
    </c:forEach>
</table>
<input type="submit" onclick="location.href='${pageContext.request.contextPath}/pages/add.jsp'" value="增加" />
</body>
</html>
