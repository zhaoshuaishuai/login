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
        System.out.println("�������ˡ���");
        String user=servletRequest.getParameter("user");
        String password=servletRequest.getParameter("password");
        System.out.println(user + password);
        //ʹ��ServletResponse  getWriter():����һ��PrintWriter���󣬵��øö����print()��������Print()�еĲ���ֱ�Ӵ�ӡ��htmlҳ��
//        PrintWriter out =servletResponse.getWriter();
//        out.println("helloword");
        //������Ӧ����
//        servletResponse.setContentType("Application/msword");
        //��ȡ������������ļ���ѩ
        //setLocale���ù����أ����ڹ��ʻ�
        //ServletResponse void SendRedirect(String location)������ض��򡣴˷���ΪhttpServletResponse�ж����
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
