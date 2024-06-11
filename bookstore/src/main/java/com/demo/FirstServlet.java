package com.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {	
    private static final long serialVersionUID = 1L;
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	//中文编码
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
    	
        //获取表单
    	String name = request.getParameter("name");
        String sno = request.getParameter("sno");

        //暂存
        Student student = new Student(sno,name);
        
        //跳转
		request.setAttribute("student", student);
		request.getRequestDispatcher("SecondServlet").forward(request, response);;
          
    }
}





