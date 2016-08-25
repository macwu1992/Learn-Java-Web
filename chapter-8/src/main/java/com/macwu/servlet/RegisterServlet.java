package com.macwu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Created by Tong on 2016/8/18.
 */
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        response.setContentType("TEXT/HTML");
        response.setCharacterEncoding("utf-8");

        PrintWriter printWriter = response.getWriter();

        printWriter.print("<HTML>");
        printWriter.print("<HEAD><TITLE>注册成功</TITLE></HEAD>");
        printWriter.print("<BODY>注册成功!!!</BODY>");
        printWriter.print("</HTML>");

        printWriter.flush();
        printWriter.close();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
