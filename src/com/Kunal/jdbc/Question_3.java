package com.Kunal.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn;	//making connection accessible outside try block for closing connection
		try{
			// getting reference of current class
			Class.forName("com.mysql.jdbc.Driver");
			//Establishing connection with database via JDBC 
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			
			  Statement stmt = conn.createStatement();
			  		String query=" select  * from employee e,department d where  e.dep_no=d.dep_no and lower(d.dep_name)='hr';";
			
			 ResultSet rs = stmt.executeQuery(query);
			 String mail="",next_query="";
			  Scanner sc= new Scanner(System.in);
			  while(rs.next()) {
				  
				  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getInt(7)+" "+rs.getString(8));
				 
				  System.out.println("Enter the New email : ");
				  
				  mail = sc.nextLine();
				  next_query = "update employee set emp_mail = '"+mail+"' where emp_id= '"+rs.getInt(1)+"'";
				 
				  Statement stmt2 = conn.createStatement();
				  System.out.println(stmt2.executeUpdate(next_query)+"row updated");
			  }
			  sc.close();
			  conn.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
