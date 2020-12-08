package com.src;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
		DataSource jf=(DataSource) ac.getBean("mysql");
		
		System.out.println("1. Add customer");
		System.out.println("2. Delete customer");
		System.out.println("3. Update customer");
		System.out.println("4. Display customer");
		System.out.println("Enter your Choice");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:
			{
				Customer c=new Customer();
				System.out.println("Enter customer name");
				c.setName(sc.next());
				System.out.println("Enter customer address");
				c.setAddress(sc.next());
				Append.custAdd(jf,c);
				break;
			}
			case 2:
			{
				System.out.println("Enter customer name to be deleted");
				String name=sc.next();
				Delete.custDelete(jf,name);
				break;
			}
			case 3:
			{
				System.out.println("Enter customer name");
				String name=sc.next();
				Update.custUpdate(jf,name);
				break;
			}
			case 4:
			{
				System.out.println("Enter customer name");
				String name=sc.next();
				Display.custDisplay(jf,name);
				break;
			}
			default:
				System.out.println("Invalid Choice!!");
				break;
		}
		
	}

}
