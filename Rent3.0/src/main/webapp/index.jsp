<%@ page contentType="text/html;charset=UTF-8"   isELIgnored="false" %>
<html>
<head>
    <title>Hello</title>
    <script src="js/jquery.min.js"></script>
    <script>
        $(function () {
            $("#btn").click(function () {
                //alert("hello");
                $.ajax({
                    url:"Room/testAjax",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"id":"1","rname":"101","tenant":"nn","phonenum":131525}',
                    dataType:"json",
                    type:"post",
                    success:function (data) {
                        console.log(data);
                        var id = document.getElementById('id');
                        var rname = document.getElementById('rname');
                        var tenant = document.getElementById('tenant');
                        var phonenum = document.getElementById('phonenum');
                        id.innerHTML = data.id;
                        rname.innerHTML = data.rname ;
                        tenant.innerHTML = data.tenant ;
                        phonenum.innerHTML = data.phonenum ;
                    }
               })
            })
        })

    </script>

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
    <h2>Hello World!</h2>
    <br>
    <button id="btn">发送ajax</button>

    <div class="box">
      <div>id</div>
      <div id="id" class="box2"></div>
    </div>
    <div class="box">
      <div>rname</div>
      <div id="rname" class="box2"></div>
    </div>
    <div class="box">
      <div>tenant</div>
      <div id="tenant" class="box2"></div>
    </div>
    <div class="box">
      <div>phonenum</div>
      <div id="phonenum" class="box2"></div>
    </div>





</body>
</html>

