<%--
  Created by IntelliJ IDEA.
  User: Tong
  Date: 16/8/6
  Time: 下午5:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>处理页面</title>
</head>
<body>
<%
        session.setAttribute("username", request.getParameter("username"));
        session.setAttribute("password", request.getParameter("password"));

        try {
            String username = (String)session.getAttribute("username");
            String password = (String)session.getAttribute("password");

            if (!username.equals(application.getInitParameter("username")) || !password.equals("admin")){
                %>
                <p id="wait"></p>
                <p>
                    若无响应,请点击:<br>
                    <a href="login.jsp">登录页面</a>
                </p>
            <%
            }
            else{%>
            <p>欢迎回来,<%=username%></p>
            <%}
        }catch (Exception e){
            response.sendRedirect("login.jsp");
            response.setHeader("refresh", "10");
            response.setHeader("refresh", "5; URL=login");
            %>
            <jsp:forward page="login.jsp"></jsp:forward>
            <%
        }
    %>

<script language="JavaScript">
    var timer = setInterval("countDown()", 1000);
    var ETA = 30;
    function countDown() {
        ETA -= 1;
        if (ETA < 0){
            self.clearInterval();
            self.location.href="login.jsp";
        }else {
            document.getElementById("wait").innerText = "用户名或密码错误,请等待" + ETA +"秒...";
        }
    }
</script>
</body>
</html>
