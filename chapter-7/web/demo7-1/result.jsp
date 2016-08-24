<%--
  Created by IntelliJ IDEA.
  User: Tong
  Date: 16/8/13
  Time: 上午10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ page import="com.macwu.Bean.Email" %>--%>
<html>
<head>
    <title>result</title>
</head>
<body>
    <div align="center">
        <jsp:useBean id="email" class="com.macwu.Bean.Email"></jsp:useBean>
        <%
            String emailAddr = request.getParameter("emailAddr");
            email.setEmail(emailAddr);
            if (email.isEmail()){
                out.print(emailAddr + "<br>是一个标准的邮件地址<br>");
            }else {
                out.print(emailAddr + "<br>不是一个标准的邮件地址<br>");
            }
        %>
    </div>
</body>
</html>
