package com.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Display {

	public static void custDisplay(DataSource ds,String name) throws SQLException, ClassNotFoundException
	{
		Connection con=DriverManager.getConnection(ds.getUrl(),ds.getUsername(),ds.getPassword());
		Class.forName(ds.getDriverclass());
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from customer where name='"+name+"'");

		while(rs.next())
		{
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("address"));

		}
	}
}
