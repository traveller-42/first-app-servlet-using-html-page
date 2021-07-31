package com.siam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException  {
		int number = (int)req.getAttribute("k");
		number=number*number;
		PrintWriter out= resp.getWriter();
		out.println("Square is ="+number);
	}
}