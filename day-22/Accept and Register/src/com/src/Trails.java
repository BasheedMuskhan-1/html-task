package com.src;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Trails
 */
public class Trails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Trails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("user");
		String id=request.getParameter("id");
//		boolean result=name1.equals(name2);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String url="jdbc:mysql://localhost:3306/hcldb";
		String user="root";
		String password="root";
		try(Connection con=DriverManager.getConnection(url, user, password);) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Statement st=con.createStatement();
			int rowsInserted = st.executeUpdate("insert into udetails values('"+name+"','"+id+"')");
			if(rowsInserted>0)
			{
				out.print("You are registered "+name);
			}
			else
			{
				out.print("invalid");
			}
			ResultSet rs=st.executeQuery("select * from udetails");
			while(rs.next()){
	            //Retrieve by column name
	            String Name = rs.getString("sname");
	            String roll = rs.getString("sid");

	            //Display values
	            out.println("roll: " + roll );
	            out.println(", Name: " + Name + "<br>");
	         }
	         out.println("</body></html>");
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
