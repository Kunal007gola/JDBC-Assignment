package com.Kunal.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Question_1 {

public static void main(String[] args){
		
		Connection conn;	//making connection accessible outside try block for closing connection
		try{
			// getting reference of current class
			Class.forName("com.mysql.jdbc.Driver");
			//Establishing connection with database via JDBC 
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			
			String department="INSERT INTO department VALUES ('hr13','HR','Delhi');"+
					"INSERT INTO department VALUES ('tech250','technical','hyderabad');"+
					"INSERT INTO department VALUES ('dev4','Development','Mumbai');"+
					"INSERT INTO department VALUES ('mk251','Marketing','Delhi');"+
					"INSERT INTO department VALUES ('mk252','Marketing','Hyderabad');"+
					"INSERT INTO department VALUES ('mk253','Marketing','Mumbai');"+
					"INSERT INTO department VALUES ('tech249','Technical','Mumbai');"+
					"INSERT INTO department VALUES ('rd54','Research-and-development','Delhi');"+
					"INSERT INTO department VALUES ('test720','Testing','Chennai');"+
					"INSERT INTO department VALUES ('Prod370','Production','Punjab');";
			
			
			String query="INSERT INTO employee VALUES ('1111', 'Kunal', 'Gola', '250000', '2016-06-15', 'HR', 'hr13', 'kunal077@gmail.com');"+
			"INSERT INTO employee VALUES ('1112', 'Varun', 'Pahuja', '25000', '2018-06-15', 'Technical', 'tech249', 'varun.pahuja@hotmail.com');"+
			"INSERT INTO employee VALUES ('1113', 'Abhishek', 'Parkash', '50000', '2017-06-05', 'Marketing', 'mk252', 'abhishek@gmail.com');"+
			"INSERT INTO employee VALUES ('1114', 'Rajat', 'Chawla', '20000', '2017-08-01', 'Production', 'prod370', 'chawla.rajat@gmail.com');"+
			"INSERT INTO employee VALUES ('1115', 'Herbert', 'Herrington', '5000', '2017-08-01', 'development', 'dev4', 'hunnyherbert@me.com');"+
			"INSERT INTO employee VALUES ('1116', 'Paras', 'Verman', '50000', '2016-06-24', 'Research-and-development', 'rd54', 'parasverman321@gmail.com');"+
			"INSERT INTO employee VALUES ('1117', 'Manish', 'Sharma', '10000', '2016-09-18', 'Marketing', 'mk251', 'manish_sharma18@gmail.com');"+
			"INSERT INTO employee VALUES ('1118', 'Jatin', 'Choudhary', '15000', '2017-03-25', 'Testing', 'test720', 'choudahry.jatin@gmail.com');"+
			"INSERT INTO employee VALUES ('1119', 'Irshad, 'ali', '25000', '2017-03-25', 'HR', 'hr13', 'irshad.ali9873@gmail.com');"+
			"INSERT INTO employee VALUES ('1120', 'Abhinav', 'Rastogi', '70000', '2017-03-25', 'HR', 'hr13', 'abhinav.24aug@gmail.com');";
			
			Statement stmt=conn.createStatement();
			stmt.executeUpdate(department);
			stmt.executeUpdate(query);
			conn.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
