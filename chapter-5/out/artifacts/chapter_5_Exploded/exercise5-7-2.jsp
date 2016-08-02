<%--
  Created by IntelliJ IDEA.
  User: Tong
  Date: 16/7/30
  Time: 下午8:26
  To change this template use File | Settings | File Templates.
--%>

<%--exercise5-7-2 输出5的阶乘--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>exercise5-7-2</title>
</head>
<body>
    <%
        int fiveMulti = 1;
        for(int i=1;i<=5;i++){
            fiveMulti *= i;
        }
    %>
5的阶乘: <%=fiveMulti%>
</body>
</html>
