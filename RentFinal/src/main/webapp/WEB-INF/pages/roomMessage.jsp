<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/9
  Time: 12:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>房间信息</title>
</head>
<body>

    <c:forEach items="${rooms}" var="list" varStatus="status">
        <tr target="sid_room" rel="${list.id}">
            <td>${list.rname}</td>
            <td>${list.tenant}</td>
            <td>${list.phonenum}</td>
            <td>
                <s:date name="${list.date}" format="yyyy-MM-dd"/>
            </td>
        </tr>
        <br>
    </c:forEach>
</body>
</html>
