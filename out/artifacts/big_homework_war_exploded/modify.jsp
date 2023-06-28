<%--
  Created by IntelliJ IDEA.
  User: Whoami
  Date: 2021/1/9
  Time: 12:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page import="domain.*" %>
<%@ page import="dao.CustomerDAO" %>
<%
    int id = Integer.parseInt(request.getParameter("id"));
    CustomerDAO customerDAO = new CustomerDAO();
    Customer customer = customerDAO.getCustomerById(id);
%>
<html>
<head>
    <title>修改顾客信息</title>
    <link href="css/add.css" rel="stylesheet" type="text/css">
</head>
<body background="img/bg.png">
<center>
    <h1>修改顾客信息</h1>
    <form action="doModify.do" method="POST">

        <div>
            <label for="name">名称</label>
            <input type="text" id="name" name="cname" value="<%=customer.getName() %>"/>
        </div>

        <div>
            <label for="gender">性别</label>
            <input type="text" id="gender" name="gender" value="<%=customer.getGender() %>"/>
        </div>

        <div>
            <label for="phone">手机</label>
            <input type="text" id="phone" name="phone" value="<%=customer.getPhone() %>"/>
        </div>
        <div>
            <label for="email">邮箱</label>
            <input type="text" id="email" name="email" value="<%=customer.getEmail() %>"/>
        </div>

        <div>
            <label >描述</label>
            <input type="text" name="description" value="<%=customer.getDescription() %>"/>
            <input type="hidden" name="cId" value="<%=customer.getId() %>"/>
            <input type="submit" id="submit" value="提交"/>

        </div>
    </form>

</center>
</body>
</html>
