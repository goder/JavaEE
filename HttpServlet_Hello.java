/*
 * Servlet实现之第二种方式实现HttpServlet
 */
package com.bj.servlet;

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpServlet_Hello extends HttpServlet {
	 //处理get请求
    //req:用于获得客户端（浏览器）的信息
    //res:用于向客户段（浏览器）的信息返回
    public void doGet(HttpServletRequest req,HttpServletResponse res){
           

        //业务处理
        try{
            PrintWriter pw=res.getWriter();
            pw.println("Hello ,HttpServlet!");

           }catch(Exception ex){
                ex.printStackTrace();
            }


    }



    //处理post请求
    //req:用于获得客户端（浏览器）的信息
    //res:用于向客户段（浏览器）的信息返回
    public void doPost(HttpServletRequest req,HttpServletResponse res){
    

        this.doGet(req,res);

    }
}
