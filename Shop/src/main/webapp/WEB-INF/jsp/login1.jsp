<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/23
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎登录</title>
    <script>
        $(function () {
            //1.给登录按钮绑定单击事件
            $("#btn-default").click(function () {
                //2.发送ajax请求，提交表单数据
                $.post("${pageContext.request.contextPath}/loginController/login",$("#loginForm").serialize(),function (data) {
                    if(data.flag){
                        location.href="http://localhost:63342/Shop/src/main/webapp/WEB-INF/html/111.html";
                    }else{
                        $("#msg").html("用户名或密码不正确");
                    }
                });
            });
        });
    </script>
    <style>
        .box{
            font-size: 20px;
            width: 400px;
            height: 300px;
            float: left;
            margin-left: 30px;
            margin-top: 100px;
            border: 3px solid #46b8da;
            border-radius: 10px;
        }
        .box1{
            color: #46b8da;
            width: 40px;
            height: 160px;
            font-size: 40px;
            float: left;
            margin-left: 100px;
            margin-top: 100px;
        }
        .form-group,.registration{
            padding-top: 10px;
            padding-left: 10px;
        }

        button[type="submit"]{
            margin-left: 150px;
            font-size: 12px;
        }
        a[id="forget"]{
            float: right;
            margin-right: 15px;
            text-align: center;
            font-size: 12px;
        }
        div[id="msg"]{
            color: #d58512;
        }

    </style>
</head>

<body>
    <div class="box1">欢迎登录</div>
    <div class="box">
        <form id="loginForm" >
            <div class="form-group">
                <label for="exampleInputUsername">用户名</label>
                <input type="text" class="form-control" id="exampleInputUsername" name="Username" placeholder="请输入用户名">
            </div>
            <div class="form-group">
                <label for="exampleInputPassword1">密码</label>
                <input type="password" class="form-control" id="exampleInputPassword1" name="Password"  placeholder="请输入密码">
            </div>
            <div class="form-group">
                <div id="msg"></div>
                <button type="submit" id="btn-default" class="btn btn-default">Submit</button>
                <%--<div id="btn-default" class="btn btn-default">Submit</div>--%>
                <a id="forget">忘记密码</a>
            </div>
        </form>
        <div class="registration">没有账户？<a>注册</a></div>
    </div>
</body>
</html>
