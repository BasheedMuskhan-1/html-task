package com.src;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
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
		String choice=request.getParameter("choice");
		int c=Integer.parseInt(choice);
		ServletContext sc=getServletContext();
		Connection con=(Connection) sc.getAttribute("myConnection");
		switch(c)
		{
		case 1:
		{
			out.print("<form action=\"./servlet2\">\r\n"
					+ "Enter your roll : <input type=\"text\" name=\"roll\"/><br>\r\n"
					+ "Enter your Name : <input type=\"text\" name=\"name\"/><br>\r\n"
					+ "Enter your Address: <input type=\"text\" name=\"address\"/><br>\r\n"
					+ "<input type=\"submit\" value=\"submit\"/>"
					+ "</form>");
			break;
		}
		case 2:
		{
			out.print("enter id of student to delete");
			out.print("<form action=\"./servlet3\">\r\n"
					+ "Enter your roll : <input type=\"text\" name=\"roll\"/><br>\r\n"
					+ "<input type=\"submit\" value=\"submit\"/>"
					+ "</form>");
			break;
		}
		case 3:
		{
			out.print("enter id of student to update");
			out.print("<form action=\"./UpdateServlet\">\r\n"
					+ "Enter your roll : <input type=\"text\" name=\"roll\"/><br>\r\n"
					+ "Enter your Name : <input type=\"text\" name=\"name\"/><br>\r\n"
					+ "<input type=\"submit\" value=\"submit\"/>"
					+ "</form>");
			break;
		}
		case 4:
		{
		try {
			PreparedStatement ps=con.prepareStatement("select * from stud");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				out.print(" | "+rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3)+" <br> ");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		break;
		}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
