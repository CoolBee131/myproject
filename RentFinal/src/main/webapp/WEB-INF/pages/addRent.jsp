<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/9
  Time: 12:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>添加房租信息</title>
</head>
<body>
    <form action="addRent1" method="post">
        房间名：<select name="rid">
                    <option value="">--请选择--</option>
                    <c:forEach items="${rooms}" var="list" varStatus="status">
                            <option value="${list.id}">${list.rname}</option>
                    </c:forEach>
                </select><br>
        月份：<input type="text" name="month" placeholder="请按xxxx-xx格式输入"/><br>
        租金：<input type="text" name="rent" placeholder="请输入"/><br>
        水抄表数：<input type="text" name="wpn" placeholder="请输入"/><br>
        电抄表数：<input type="text" name="epn" placeholder="请输入"/><br>
        <input type="submit" value="提交"/>
        <input type="reset" value="重置"/>
    </form>
</body>

</html>
