package com.liumq.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        //ServletConfig servletConfig = this.getServletConfig();     //servlet配置
        //String initParameter = this.getInitParameter();           //初始化参数


        //上下文:web容器启动的时候，会为每个web 程序都创建一个对应的context对象
        //代表当前的web应用
        //共享数据
        ServletContext context = this.getServletContext();


        String userName ="liumq";//数据

        //讲一个key value 保存在servletContext 中
        context.setAttribute("username",userName);


        System.out.println("hello");




    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
