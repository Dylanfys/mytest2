<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2018/7/25
  Time: 20:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" rel="stylesheet" href="/js/user.css"/>
</head>
<body>




<!-- Table goes in the document BODY -->
<table class="altrowstable" id="alternatecolor">
    <tr>
        <th>用户编号</th>
        <th>用户名</th>
        <th>真实姓名</th>
        <th>年龄</th>
        <th>性别</th>
        <th>出生日期</th>
        <th>创建日期</th>
        <th>更新日期</th>
        <th>删除操作</th>
    </tr>
    <c:forEach items="${users}" var="user">
    <tr>
        <td>${user.id}</td>
        <td>${user.userName}</td>
        <td>${user.name}</td>
        <td>${user.age}</td>
        <td>${user.sex}</td>
        <td>${user.birthday}</td>
        <td>${user.created}</td>
        <td>${user.updated}</td>
        <td><a href="/user/deleteUserById?id=${user.id}">删除</a></td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
