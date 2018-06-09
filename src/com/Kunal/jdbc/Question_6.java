package com.Kunal.jdbc;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Question_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn;	//making connection accessible outside try block for closing connection
		try{
			// getting reference of current class
			Class.forName("com.mysql.jdbc.Driver");
			//Establishing connection with database via JDBC 
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			
			PreparedStatement ps = conn.prepareStatement("insert into employee values(?,?,?,?,?,?,?,?);");
			  
			  BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
			  String ch;
			  
			  do {
				  System.out.println("enter emp id:");  
				  int id=Integer.parseInt(br.readLine());  
				  
				  System.out.println("enter emp first name:");  
				  String fname=br.readLine();  
				  
				  System.out.println("enter emp last name:");  
				  String lname=br.readLine(); 
				  
				  System.out.println("enter salary:");  
				  int  salary=Integer.parseInt(br.readLine());
				  
				  System.out.println("Enter emp joining day FORMAT(year-month-date):");
				  String  j_date=br.readLine();
					
				  System.out.println("Enter emp department :");
				  String	dept=br.readLine();
				  
				  System.out.println("Enter emp department number :");
					String dep_no=br.readLine();
					
					System.out.println("Enter emp email :");
					 String email=br.readLine();
				  
					 ps.setInt(1,id);
					 ps.setString(2,fname);
					 ps.setString(3,lname);
					 ps.setInt(4,salary);
					 ps.setString(5,j_date);
					 ps.setString(6,dept);
					 ps.setString(7,dep_no);
					 ps.setString(8,email);
					 
					 int c=ps.executeUpdate();  
					 System.out.println(c+" record added");	 
					 
				  System.out.println("Enter y to continue or n to break :");
				  ch = br.readLine();
				  
			  }while(ch.startsWith("n"));		
			  
			  conn.close();
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
	}

}
