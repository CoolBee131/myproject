<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/11
  Time: 22:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .box {
            border: 1px solid ;
            width: 100px;
            height: 80px;
            text-align: center;
            margin-right: 10px;
            float: left;
        }
        .box2{
            margin-top: 10px;
        }
    </style>
</head>
<body>
    <c:forEach items="${monthRents}" var="list" varStatus="status">
    <div class="box">
        <div>租金</div>
        <div class="box2">${monthRents.rent}</div>
    </div>
    <div class="box">
        <div>水抄表数</div>
        <div class="box2">${monthRents.wpn}</div>
    </div>
    <div class="box">
        <div>电抄表数</div>
        <div class="box2">${monthRents.epn}</div>
    </div>
    <div class="box">
        <div>抄表日期</div>
        <div class="box2">${monthRents.date}</div>
    </div>
    </c:forEach>

</body>
</html>
