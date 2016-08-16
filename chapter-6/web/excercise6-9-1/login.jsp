<%--
  Created by IntelliJ IDEA.
  User: Tong
  Date: 16/8/6
  Time: 下午4:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
    <%--<script language="javascript">--%>
        <%--var username = document.getElementById(username);--%>
        <%--var password = document.getElementById(password);--%>
        <%----%>
        <%--function checkUsername() {--%>
            <%--if(username.length > 15 || )--%>
        <%--}--%>
    <%--</script>--%>
</head>
<body>
    <form action="deal.jsp" method="post">
        <table id="login-form" align="center">
            <tr>
                <td>姓名:</td>    <td><input name="username" type="text"/></td>
            </tr>

            <tr>
                <td>密码:</td>    <td><input name="password" type="password"></td>
            </tr>

            <tr>
                <td colspan="2" align="center">
                    <input type="submit" id="comfirm-button" value="确认"/>
                    <input type="button" name="reset" id="reset" value="重置" onclick=""/>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
