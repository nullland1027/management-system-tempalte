<%--
  Created by IntelliJ IDEA.
  User: Whoami
  Date: 2021/1/12
  Time: 13:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajax</title>
</head>
<body>
<div>
    <span onclick="getData('male.do')">男顾客</span>
    <span onclick="getData('female.do')">女顾客</span>
    <a href="list.do">返回</a>
</div>
<hr/>
<div id="content">

</div>
<script src="js/ajax.js" type="text/javascript"></script>
</body>
</html>
