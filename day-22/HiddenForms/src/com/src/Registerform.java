package com.src;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registerform
 */
public class Registerform extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registerform() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		String name=request.getParameter("name");
//		String theatre=request.getParameter("theatre");
//		try {
//			Date dt= new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("date"));
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		String snum=request.getParameter("show");
		String movie=request.getParameter("movie");
		String theatre=request.getParameter("theatre");
		
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print(movie+"  "+theatre);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
