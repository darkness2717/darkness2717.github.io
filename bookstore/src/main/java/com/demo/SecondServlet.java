package com.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {	
    private static final long serialVersionUID = 1L;
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	//中文编码
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
    	
        //获取表单
        Student student= (Student)request.getAttribute("student");

        //输出
        response.getWriter().println("姓名: " + student.getName() + "<br>");
        response.getWriter().println("学号: " + student.getSno() + "<br>");
        response.getWriter().println("<a href='input.html'>返回输入页面</a>");
          
    }
}








