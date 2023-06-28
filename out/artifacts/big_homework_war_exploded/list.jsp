<%--
  Created by IntelliJ IDEA.
  User: Whoami
  Date: 2021/1/9
  Time: 12:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<%@ page import="dao.CustomerDAO" %>
<%@ page import="servlet.* " %>
<%@ page import="domain.*" %>

<%
    List<Customer> customers = (List<Customer>) request.getAttribute("customers");
%>
<html>
<head>
    <title>顾客信息管理</title>
    <link rel="stylesheet" type="text/css" href="css/list.css">
</head>
<body background="img/bg.png">

<center>
    <h1>顾客信息列表</h1>
    <div style="text-align: center">
        <a href="add.jsp" id="add">新增顾客信息</a>
        <a href="ajax.jsp">筛选</a>
        <span>
            <form action="doSearch.do" method="post">
                <input id="text" type="text" name="search" placeholder="搜索人名" height="30px">
                <input id="search" type="submit" value="搜索" style="background-color: rgb(32, 142, 218)">
            </form>

        </span>
    </div>
    <table width="900px" style="margin-bottom: 20px">
        <tr>
            <th>id</th>
            <th>姓名</th>
            <th>性别</th>
            <th>电话</th>
            <th>邮箱</th>
            <th>描述</th>
            <th>查看</th>
            <th>编辑</th>
        </tr>
        <%
            for (Customer cus : customers) {
        %>
        <tr>
            <td style="width: 30px"><%=cus.getId() %></td>
            <td><%=cus.getName() %></td>
            <td style="padding-left: 20px "><%=cus.getGender()%></td>
            <td><%=cus.getPhone()%></td>
            <td><%=cus.getEmail()%></td>
            <td><%=cus.getDescription()%></td>
            <td><a href="view.do?id=<%=cus.getId() %>"><img src="img/see.png" width="45" height="35"></a></td>
            <td><a href="modify.jsp?id=<%=cus.getId() %>"><img src="img/edit.png" width="35" height="35"></a></td>
        </tr>
        <%
            }
        %>
    </table>


</center>
</body>
</html>
