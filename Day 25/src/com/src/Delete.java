package com.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

	public static void custDelete(DataSource ds,String name) throws SQLException, ClassNotFoundException
	{
		Connection con=DriverManager.getConnection(ds.getUrl(),ds.getUsername(),ds.getPassword());
		Class.forName(ds.getDriverclass());
		Statement st=con.createStatement();
		int i=st.executeUpdate("delete from customer where name='"+name+"'");
        System.out.println(i+" rows Added Successfully");
	}
}
