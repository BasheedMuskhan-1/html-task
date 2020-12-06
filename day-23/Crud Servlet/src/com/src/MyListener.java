package com.src;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class MyListener
 *
 */
public class MyListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public MyListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	//PrintWriter out=response.getWriter();
		String url="jdbc:mysql://localhost:3306/hcldb";
		String user="root";
		String password="root";
    	try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, user, password);
			//Statement st=con.createStatement();
			ServletContext ctx=sce.getServletContext();
			ctx.setAttribute("myConnection", con);
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
	
}
}