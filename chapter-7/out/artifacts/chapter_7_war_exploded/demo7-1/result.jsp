<%--
  Created by IntelliJ IDEA.
  User: Tong
  Date: 16/8/13
  Time: 上午10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>result</title>
</head>
<body>
    <div align="center">
        <%
            String emailAddr = request.getParameter("emailAddr");
            Email email = new Email("emailAddr");
            if (email.isEmail()){
                out.print(emailAddr + "<br>是一个标准的邮件地址<br>")
            }else {
                out.print(emailAddr + "<br>不是一个标准的邮件地址<br>")
            }
        %>
    </div>
</body>
</html>
