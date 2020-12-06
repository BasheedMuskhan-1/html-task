package com.src;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateServlet
 */
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		int roll=Integer.parseInt(request.getParameter("roll"));
//		boolean result=name1.equals(name2);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String url="jdbc:mysql://localhost:3306/hcldb";
		String user="root";
		String password="root";
		try(Connection con=DriverManager.getConnection(url, user, password);) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Statement st=con.createStatement();
			int rowsUpdated = st.executeUpdate("UPDATE stud SET sname='"+name+"' where roll="+roll+"");
			if (rowsUpdated > 0) {
				out.print("An existing student was updated successfully!");
			}
			else
			{
				out.print("invalid");
			}
			st.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
