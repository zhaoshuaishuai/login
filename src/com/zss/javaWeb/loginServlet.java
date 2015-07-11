package com.zss.javaWeb;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by zss on 2015/7/11.
 */
public class loginServlet implements Servlet {
    private ServletConfig servletConfig=null;
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig=servletConfig;

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
}

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("请求来了。。");
        String user=servletRequest.getParameter("user");
        String password=servletRequest.getParameter("password");
        System.out.println(user + password);
        //使用ServletResponse  getWriter():返回一个PrintWriter对象，调用该对象的print()方法，将Print()中的参数直接打印在html页面
//        PrintWriter out =servletResponse.getWriter();
//        out.println("helloword");
        //设置响应类型
//        servletResponse.setContentType("Application/msword");
        //获取输出刘，用于文件下雪
        //setLocale设置归属地，用于国际化
        //ServletResponse void SendRedirect(String location)请求的重定向。此方法为httpServletResponse中定义的
        String ServletUser=servletConfig.getInitParameter("user");
        String Servletpassword=servletConfig.getInitParameter("password");
        System.out.print("Servlet"+ServletUser+ Servletpassword);
        PrintWriter out=servletResponse.getWriter();
        if(ServletUser==user && Servletpassword==password){
            out.print("hello");

        }else{
            out.print("sorry...");
        }




    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
