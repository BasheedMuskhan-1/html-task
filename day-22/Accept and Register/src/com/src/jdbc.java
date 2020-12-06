package com.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url="jdbc:mysql://localhost:3306/hcldb";
		String user="root";
		String password="root";
		try(Connection con=DriverManager.getConnection(url, user, password);) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from employee");
			while(rs.next())
			{
				System.out.println(rs.getInt("eid")+" "+rs.getString("ename")+" "+rs.getString("eaddress")+" "+rs.getFloat("salary"));;
			}
			System.out.println("end of program");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
