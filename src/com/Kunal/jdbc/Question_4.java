package com.Kunal.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn;	//making connection accessible outside try block for closing connection
		try{
			// getting reference of current class
			Class.forName("com.mysql.jdbc.Driver");
			//Establishing connection with database via JDBC 
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			
			Statement stmt = conn.createStatement();
			

		    String query=" insert into employee values(111,'deepak','sharma',99999,'2010-04-25','technical','tech250','deepak.sha@gmail.com')";
		    stmt.addBatch(query);
		    
			  	query="insert into employee values(222,'irshad','ali',999990,'2015-03-19','HR','hr13','irshad.ali@gmail.com')";
			  	stmt.addBatch(query);
			  	query= "insert into employee values(971,'abhinav','rastogi',50000,'2016-03-09','development','dev4','abhinav.rastogi@gmail.com')";
			  	stmt.addBatch(query);
			  	
			stmt.executeBatch(); 
			
			  
			  conn.close();
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
	}

}
