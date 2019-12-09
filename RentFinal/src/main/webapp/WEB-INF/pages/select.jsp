<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/4
  Time: 11:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"  %>
<html>
<head>
    <title>查找</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/Room/find" method="post" >
        房间名字：<input type="text" name="rname" placeholder="请输入"  /> <br/>
        月份：<input type="text" name="month" placeholder="请输入" /> <br/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
