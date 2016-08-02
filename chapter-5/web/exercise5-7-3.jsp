<%@ page import="com.sun.xml.internal.xsom.impl.scd.Iterators" %><%--
  Created by IntelliJ IDEA.
  User: Tong
  Date: 16/7/30
  Time: 下午8:26
  To change this template use File | Settings | File Templates.
--%>

<%--exercise5-7-3 输出*组成的金字塔--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>exercise5-7-2</title>
</head>
<body>
<%! String str = "";%>
<%
    for(int i=1;i<6;i++){
        for(int j=0;j<5-i;j++){
            str +=" ";
        }
        for(int j=0;j<2*i-1;j++){
            str +="*";
        }
        str += "<br>";
    }
    for(int i=1;i<5;i++){
        for(int j=1;j<i+1;j++){
            str +="&";
        }
        for(int k=0;k<2*(4-i)+1;k++){
            str +="*";
        }
        str += "<br>";
    }
%>
<%=str%>
</body>
</html>
