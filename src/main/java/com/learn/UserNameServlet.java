package com.learn;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/**
 * this servet is used to read the url parameters
 */
public class UserNameServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3001379211309979124L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter writer=resp.getWriter();
		String userName=req.getParameter("userName");
		String userId=req.getParameter("userId");
		writer.println("hello : "+"user : "+userName+"is your id : "+userId);
	}

}
