package com.src;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hiddenform
 */
public class Hiddenform extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hiddenform() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<form action=\"./servlet1\" >\r\n"
				+ "Enter movie name:"+request.getParameter("movie")+"<input type=\"hidden\" name=\"movie\" value="+request.getParameter("movie")+"/><br>\r\n"
				+ "Enter theatre name:"+request.getParameter("theatre")+"<input type=\"hidden\" name=\"theatre\" value="+request.getParameter("theatre")+"/><br>\r\n"
				+ "Enter date:"+request.getParameter("date")+"<input type=\"hidden\" name=\"date\" value="+request.getParameter("date")+"><br>\r\n"
				+ "Enter screen number:"+request.getParameter("show")+"<input type=\"hidden\" name=\"show\" value="+request.getParameter("show")+"><br>\r\n"
				+ "<input type=\"submit\" value=\"submit\">\r\n"
				+ "</form>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
