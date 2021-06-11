package com.liumq.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String[] hobbies = req.getParameterValues("hobby");
        System.out.println("======================================");
        System.out.println(username + ":" + password);
        System.out.println(Arrays.toString(hobbies));
        System.out.println("======================================");

        //通过请求转发。转发时path只需要写相对路径，而重定向的路径必须写项目路径
        //即是否/r/ 的区别
        //转发时一个web应用的内部操作，因此不需要写项目路径
        req.getRequestDispatcher("/success.jsp").forward(req, resp);

    }
}
