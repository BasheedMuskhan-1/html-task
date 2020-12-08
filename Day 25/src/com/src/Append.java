package com.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Append {
	public static void custAdd(DataSource ds,Customer c) throws SQLException, ClassNotFoundException
	{		
		Connection con=DriverManager.getConnection(ds.getUrl(),ds.getUsername(),ds.getPassword());
		Class.forName(ds.getDriverclass());
		Statement st=con.createStatement();
		int i=st.executeUpdate("insert into customer values('"+c.getName()+"','"+c.getAddress()+"')");
        System.out.println(i+" rows Added Successfully");
	}
}
