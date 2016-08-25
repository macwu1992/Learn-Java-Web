<%--
  Created by IntelliJ IDEA.
  User: Tong
  Date: 2016/8/18
  Time: 下午2:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
<div align="center">
    <form method="post" action="/Servlet/RegisterServlet">
        <table border="1px">
            <tr>
                <td>用户名:</td>
                <td><input name="username" type="text"/></td>
            </tr>
            <tr>
                <td>密码:</td>
                <td><input name="password" type="password"/></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="提交"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
