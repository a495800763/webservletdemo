package com.liumqserv.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RequestTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("进入RequestTest请求了");
        //处理请求
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username + ":" + password);
        // 通过response 重定向
        //重定向的时候一定要注意路径的完整性，否则就404
        resp.sendRedirect("/response_war/success.jsp");


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
