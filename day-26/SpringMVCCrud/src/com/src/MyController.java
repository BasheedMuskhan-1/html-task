package com.src;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	String message=null;
@RequestMapping("/validate")
public String validate(@RequestParam("choice")String choice,Model m)
{
	int c=Integer.parseInt(choice);
	String a=null;
	switch(c)
	{
	case 1:
	{
		a="insert";
		return a;
	}
	case 2:
	{
		a="delete";
		return a;
	}
	case 3:
	{
		a="Update";
		return a;
	}
	case 4:
	{
		a="display";
		return a;
	}
	default:
	{
		a="invalid";
		return a;
	}
	}
}
@RequestMapping("/validate1")
public String validate1(@RequestParam("name")String name,@RequestParam("roll")String roll,Model m)
{
	//String message=null;
	String url="jdbc:mysql://localhost:3306/muskandb";
	String user="root";
	String password="root";
	try(Connection con=DriverManager.getConnection(url, user, password);) {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Statement st=con.createStatement();
		int rowsInserted = st.executeUpdate("insert into stud values("+roll+",'"+name+"')");
		if(rowsInserted>0)
		{
			message="You are registered "+name;
			
			
		}
		else
		{
			message="invalid";
		}
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if(message=="invalid")
	{
		m.addAttribute("message",message);
		return "invalid";
	}
	else
	{
		m.addAttribute("message", message);
		return "success";
	}
	//return null;
}
@RequestMapping("/validate2")
public String validate2(@RequestParam("roll")String roll,Model m)
{
	String url="jdbc:mysql://localhost:3306/muskandb";
	String user="root";
	String password="root";
	try(Connection con=DriverManager.getConnection(url, user, password);) {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Statement st=con.createStatement();
		int rowsDeleted = st.executeUpdate("DELETE FROM stud WHERE roll="+roll+"");
		if (rowsDeleted > 0) {
			message="deleted successfully";
		}
		else
		{
			message="invalid";
		}
		st.close();
		con.close();
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if(message=="invalid")
	{
		m.addAttribute("message",message);
		return "invalid";
	}
	else
	{
		m.addAttribute("message", message);
		return "success";
	}
}
@RequestMapping("/validate3")
public String validate3(@RequestParam("name")String name,@RequestParam("roll")String roll,Model m)
{
	//String message2;
	String url="jdbc:mysql://localhost:3306/muskandb";
	String user="root";
	String password="root";
	try(Connection con=DriverManager.getConnection(url, user, password);) {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Statement st=con.createStatement();
		int rowsUpdated = st.executeUpdate("UPDATE stud SET sname='"+name+"' where roll="+roll+"");
		if (rowsUpdated > 0) {
			message="you are updated"+name;
		}
		else
		{
			message="invalid";
		}
		st.close();
		con.close();
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if(message=="invalid")
	{
		m.addAttribute("message",message);
		return "invalid";
	}
	else
	{
		m.addAttribute("message", message);
		return "success";
	}

}
}






