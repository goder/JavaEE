/*
 * Servlet实现之第一种方式实现Servlet
 */
package com.bj.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet_Hello  implements Servlet{

	 /**
     * Method init
     *
     *
     * @param parm1
     *
     @throws ServletException
     *
     */
    public void init(ServletConfig parm1) throws ServletException {
        // TODO: Add your code here
        

        System.out.println("init it");


    }

    /**
     * Method getServletConfig
     *
     *
     * @return
     *
     */
    public ServletConfig getServletConfig() {
        // TODO: Add your code here
              
        return null;
    }

    /**
     * Method service
     *
     *用于处理业务逻辑，把业务逻辑代码写在这里，当用户访问每一次都会调用该方法
     * @param parm1
     * @param parm2
     *parm1用于获取客户端信息,param2用于向客户端返回信息
     @throws ServletException
     @throws IOException
     *
     */
    public void service(ServletRequest parm1, ServletResponse parm2) throws ServletException, IOException {
        // TODO: Add your code here
        
            System.out.println("service it");
           //param1中得到PrintWriter

            PrintWriter pw=parm2.getWriter();
            pw.println("hello world");


    }

    /**
     * Method getServletInfo
     *
     *
     * @return
     *
     */
    public String getServletInfo() {
        // TODO: Add your code here
        return "";



    }

    /**
     * Method destroy
     *1、关闭tomcat；2、reload tomcat服务器3、关机
     *
     */
    public void destroy() {
        // TODO: Add your code here

        System.out.println("destroy!");
        

            
    } 

}

