/*
 * Servletʵ��֮�ڶ��ַ�ʽʵ��HttpServlet
 */
package com.bj.servlet;

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpServlet_Hello extends HttpServlet {
	 //����get����
    //req:���ڻ�ÿͻ��ˣ������������Ϣ
    //res:������ͻ��Σ������������Ϣ����
    public void doGet(HttpServletRequest req,HttpServletResponse res){
           

        //ҵ����
        try{
            PrintWriter pw=res.getWriter();
            pw.println("Hello ,HttpServlet!");

           }catch(Exception ex){
                ex.printStackTrace();
            }


    }



    //����post����
    //req:���ڻ�ÿͻ��ˣ������������Ϣ
    //res:������ͻ��Σ������������Ϣ����
    public void doPost(HttpServletRequest req,HttpServletResponse res){
    

        this.doGet(req,res);

    }
}
