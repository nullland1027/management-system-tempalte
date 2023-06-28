<%--
  Created by IntelliJ IDEA.
  User: Whoami
  Date: 2021/1/9
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">

</head>
<body background="img/bg.png">
    <h1 style="text-align: center">欢迎光临顾客信息管理系统</h1>

    <form action="list.do" method="post" id="form" onsubmit="return checkIfValid()">
        <div>
            <label for="name">用户名</label>
            <input type="text" id="name" name="user_name"/>
            <p id="name_p">必填，长度为4~16个字符</p>
        </div>
        <div>
            <label for="password">密码</label>
            <input type="password" id="password" name="pwd"/>
            <p id='password_p'>请输入密码</p>
        </div>

        <div>
            <input type="submit" id="submit" value="提交" onclick="check()"/>
        </div>
    </form>

    <script src="js/form.js" type="text/javascript"></script>

</body>
</html>
