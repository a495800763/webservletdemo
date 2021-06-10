package com.liumqserv.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

public class ResponseDemo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         * 1 获取要下载的文件的路径
         * 2 下载的文件名称
         * 3 设置浏览器支持我们下载所需要的东西
         * 4 获取下载文件的输入流
         * 5 创建缓冲区
         * 6 获取OutputStream 对象
         * 7 将FileOutoutStream 流写入到buffer缓冲区
         * 8 使用OutputStream将缓冲区的数据输出到客户端
         */
        //1 获取要下载的文件的路径
        String realPath = this.getServletContext().getRealPath("/1.png");
        System.out.println("下载文件的路径：" + realPath);
        //2 下载的文件名称
        String fileName = realPath.substring(realPath.lastIndexOf("\\") + 1);
        //设置浏览器支持我们下载所需要的东西(Content-Disposition)
        resp.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8"));
        //获取下载文件的输入流
        FileInputStream in = new FileInputStream(realPath);
        //5 创建缓冲区
        int len = 0;
        byte[] buffer = new byte[1024];
        //获取OutputStream 对象
        ServletOutputStream out = resp.getOutputStream();
        //将FileOutoutStream 流写入到buffer缓冲区,使用OutputStream将缓冲区的数据输出到客户端
        while ((len = in.read(buffer)) > 0) {
            out.write(buffer, 0, len);
        }

        in.close();
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
