<%--
  Created by IntelliJ IDEA.
  User: Tong
  Date: 16/8/8
  Time: 下午9:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>留言板</title>
    <script language="JavaScript">
        function reset() {
            document.getElementById("username").value = "";
            document.getElementById("editarea").value = "";
        }

        function submit() {
            var new_row = document.getElementById("noteboard").insertRow(noteboard.rows.length);

            var username_cell = new_row.insertCell(new_row.cells.length);
            var editarea_cell = new_row.insertCell(new_row.cells.length);

            username_cell.innerText = document.getElementById("username").value;
            editarea_cell.innerText = document.getElementById("editarea").value;

            reset();
        }
    </script>
</head>
<body>
<div align="center">
    <table id="noteboard" border="1" width="500px">
        <tr>
            <td width="30%">用户名</td>
            <td width="70%">留言内容</td>
        </tr>
    </table>

    <br>

    <%--<form method="post">--%>
    <table width="500px">
        <tr>
            <td>
                请输入用户名:
            </td>
            <td>
                <input id="username"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <textarea id="editarea" style="width: 500px; height: 50px; resize: none">
                </textarea>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input id="submit" type="button" value="提交" onclick="submit()"/>
                <input id="reset" type="button" value="清空" onclick="reset()"/>
            </td>
        </tr>
    </table>
    <%--</form>--%>
</div>
</body>
</html>
