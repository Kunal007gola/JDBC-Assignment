package com.Kunal.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Question_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn;	//making connection accessible outside try block for closing connection
		try{
			// getting reference of current class
			Class.forName("com.mysql.jdbc.Driver");
			//Establishing connection with database via JDBC 
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			
			Statement stmt = conn.createStatement();
			 String query ="Delete from employee where salary < 20000 ";
			
			int row =stmt.executeUpdate(query);
			
			System.out.println(" "+row+" no. of rows deleted.");
			  
			  conn.close();
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
	}

}
