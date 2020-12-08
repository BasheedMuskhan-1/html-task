package com.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Update {

	public static void custUpdate(DataSource ds,String name) throws SQLException, ClassNotFoundException
	{
		Connection con=DriverManager.getConnection(ds.getUrl(),ds.getUsername(),ds.getPassword());
		Class.forName(ds.getDriverclass());
		Statement st=con.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customer address");
		String address=sc.next();
		int k=st.executeUpdate("update customer set address='"+address+"' where name='"+name+"'");
		System.out.println(k+" rows updated Successfully");
	}
}
