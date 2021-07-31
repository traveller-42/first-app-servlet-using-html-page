package com.siam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException  {
		HttpSession session=req.getSession();
		int number = (int)session.getAttribute("k");
		number=number*number;
		PrintWriter out= resp.getWriter();
		out.println("Square is ="+number);
	}
}
