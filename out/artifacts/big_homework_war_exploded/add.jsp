<%--
  Created by IntelliJ IDEA.
  User: Whoami
  Date: 2021/1/9
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<%@ page import="dao.CustomerDAO" %>
<%@ page import="servlet.* " %>
<%@ page import="domain.*" %>
<html>
<head>
    <title>添加顾客</title>
    <link href="css/add.css" rel="stylesheet" type="text/css">
</head>
<body background="img/bg.png">

<h1 align="center">添加顾客</h1>
<form action="doAdd.do" method="get">
    <input type="hidden" name="method" value="add">

        <div>
            <label for="name">名称</label>
            <input type="text" id="name" name="cname"/>
        </div>

        <div>
            <label for="gender">性别</label>
            <input type="text" id="gender" name="gender"/>
        </div>

        <div>
            <label for="phone">手机</label>
            <input type="text" id="phone" name="phone"/>
        </div>
        <div>
            <label for="email">邮箱</label>
            <input type="email" id="email" name="email"/>
        </div>

        <div>
            <label >描述</label>
            <input type="text" name="description">
            <input type="submit" id="submit" value="提交" onclick="succ()"/>
            <input type="reset" name="reset"/>
        </div>


</form>
    <script src="js/addSuccessful.js" type="text/javascript"></script>
</body>
</html>
