
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/4
  Time: 11:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>查找</title>
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
    <form action="find" method="get" >
        房间名字：<input type="text" name="rname" placeholder="请输入"  value=""/>
        月份：<input type="text" name="month" placeholder="请输入" value=""/> <br/>
        <input type="submit" value="提交"/>
        <input type="reset" value="重置">
    </form>
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
