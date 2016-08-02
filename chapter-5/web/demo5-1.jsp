<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: Tong
  Date: 16/7/27
  Time: 下午4:30
  To change this template use File | Settings | File Templates.
--%>

<%--demo 5.1 编写jsp页面,显示当前系统的时间--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>System Time</title>
  </head>
  <body>
      <%
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String nowTime = simpleDateFormat.format(date);
      %>
  当前时间: <%=nowTime%>
  </body>
</html>
