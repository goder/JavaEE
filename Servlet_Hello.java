/*
 * Servletʵ��֮��һ�ַ�ʽʵ��Servlet
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
     *���ڴ���ҵ���߼�����ҵ���߼�����д��������û�����ÿһ�ζ�����ø÷���
     * @param parm1
     * @param parm2
     *parm1���ڻ�ȡ�ͻ�����Ϣ,param2������ͻ��˷�����Ϣ
     @throws ServletException
     @throws IOException
     *
     */
    public void service(ServletRequest parm1, ServletResponse parm2) throws ServletException, IOException {
        // TODO: Add your code here
        
            System.out.println("service it");
           //param1�еõ�PrintWriter

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
     *1���ر�tomcat��2��reload tomcat������3���ػ�
     *
     */
    public void destroy() {
        // TODO: Add your code here

        System.out.println("destroy!");
        

            
    } 

}

