/*
 * Servletʵ��֮�ڶ��ַ�ʽʵ��GenericServlet�ӿ�
 */
package com.bj.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericServlet_Hello extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		   System.out.println("service it");
	        //����Hello��World�� generic
	        try{
	            //param1�еõ�PrintWriter

	            PrintWriter pw=response.getWriter();
	            pw.println("Hello,World! genericServlet");

	            }catch(Exception ex){
	                ex.printStackTrace();
	                
	            }
	}

}
