package com.siam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
    public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
    	int i = Integer.parseInt(req.getParameter("num1"));
    	int j = Integer.parseInt(req.getParameter("num2"));
    	int k =i+j;
    	//System.out.println("Result is ="+k);
    	
    	
//    	req.setAttribute("k",k);
//    	RequestDispatcher rd=req.getRequestDispatcher("ano");
//    	rd.forward(req, resp);
    	resp.sendRedirect("ano?k="+k);
    }
}
