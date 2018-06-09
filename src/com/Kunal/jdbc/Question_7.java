package com.Kunal.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Question_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn;	//making connection accessible outside try block for closing connection
		try{
			// getting reference of current class
			Class.forName("com.mysql.jdbc.Driver");
			//Establishing connection with database via JDBC 
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			
			Statement stmt = conn.createStatement();
			
			 String fk ="ALTER TABLE employee DROP foreign key fk_1";
			 String drop="DROP TABLE department";
			
			stmt.executeUpdate(fk);
			stmt.executeUpdate(drop);
			  
			  conn.close();
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
	}

}
