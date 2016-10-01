<%--
  Created by IntelliJ IDEA.
  User: Tong
  Date: 2016/8/29
  Time: 下午3:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>BookStore</title>
    <style>
      body{
        padding: 0px;
        margin: 0 auto;
        left:50%;
        margin-left: -475px;
        text-align: center;
        max-width: 1000px;
        min-width: 950px;
        background: #f6ebb1;
        position: absolute;
      }
      
      #container {
        position: relative;
        width: 100%;
      }

      #container #content {
        position: relative;
        width: 80%;
        height: 100%;
      }

      #content #recommendBooks {
        position: relative;
        float: left;
        width: 100%;
        height: 0px;
        margin: 0;
      }

      #recommendBooks td{
        width: 20%;
        height: 200px;
        background: #003ff6;
      }

      #container #advertise {
        position: relative;
        right: 0px;
        width: 20%;
        height: 100%;
        float: left;
        background: #f65d5a;
      }

      #container #others {
        float: right;
        width: 80%;
        height: 40%;
      }

    </style>
  </head>
  <body>
    <%--这是banner--%>
    <%@ include file="banner.jsp"%>

    <%--这是内容--%>
    <%@ include file="common.jsp"%>

    <div id="container">

      <div id="content" style="">

        <table id="recommendBooks">
          <tr>
            <td>1</td>
            <td>2</td>
            <td>3</td>
            <td>4</td>
            <td>5</td>
          </tr>
          <tr>
            <td>6</td>
            <td>7</td>
            <td>8</td>
            <td>9</td>
            <td>10</td>
          </tr>
        </table>
      </div>
      <div id="advertise">
        <p>广告</p>
      </div>
      <div style="clear:both"></div>
      <div id="others">
        <p>
          others
        </p>
      </div>
      
    </div>

    <%--这是footer--%>
    <%@ include file="footer.jsp"%>

  </body>
</html>
