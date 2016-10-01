<%--
  Created by IntelliJ IDEA.
  User: Tong
  Date: 2016/8/29
  Time: 下午3:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="head" style="background:url(img/header_logo_background.gif) repeat top; height: 120px;position: relative">
    <a href="BookStore.jsp" style="float: left">
        <img src="img/header_logo_left.gif" height="120" border="0">
    </a>

    <form method="get" action="" style="position: absolute; bottom: 0px; right: 0px;width: 20%;">
        <table style="float: right;padding-bottom: 10px;">
            <tr>
                <td style="height: 30px"><input id="searchWord" type="text"/></td>
                <td style="height: 30px"><input type="submit" value="搜索"/></td>
            </tr>
        </table>
    </form>
</div>