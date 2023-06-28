<%--
  Created by IntelliJ IDEA.
  User: Whoami
  Date: 2021/1/9
  Time: 13:11
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<%@ page import="dao.CustomerDAO" %>
<%@ page import="servlet.* " %>
<%@ page import="domain.*" %>

<%
    Customer customer = (Customer) request.getAttribute("customer");

%>
<html>
<head>
    <title>查看顾客信息</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <link rel="stylesheet" href="css/view.css" type="text/css">
</head>
<body background="img/bg.png">

<h1>客户信息</h1>
<div>
    <center>
    <table class="table">
        <tr>
            <td>姓名：</td>
            <td><%=customer.getName() %></td>
        </tr>
        <tr>
            <td>性别</td>
            <td><%=customer.getGender() %></td>
        </tr>
        <tr>
            <td>手机号：</td>
            <td><%=customer.getPhone() %></td>
        </tr>
        <tr>
            <td>邮箱：</td>
            <td><%=customer.getEmail() %></td>
        </tr>
        <tr>
            <td>描述：</td>
            <td><%=customer.getDescription() %></td>
        </tr>
    </table>
    </center>
</div>

<div>
    <a href="doDelete.do?id=<%=customer.getId() %>" onclick="succ()">删除该用户</a>
    <a href="list.do">返回列表</a>
</div>
    <script type="text/javascript" src="js/delSuccessfule.js"></script>
</body>
</html>
