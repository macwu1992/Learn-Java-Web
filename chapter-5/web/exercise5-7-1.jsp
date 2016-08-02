<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: Tong
  Date: 16/7/30
  Time: 下午8:23
  To change this template use File | Settings | File Templates.
--%>

<%--exercise5-7-1 输出当前时间--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>exercise5-7-1</title>
</head>
<body>
    <%
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String nowTime = simpleDateFormat.format(date);
    %>
现在时间: <%=nowTime%>
</body>
</html>
