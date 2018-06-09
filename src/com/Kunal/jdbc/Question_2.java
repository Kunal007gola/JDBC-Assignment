package com.Kunal.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn;	//making connection accessible outside try block for closing connection
		try{
			// getting reference of current class
			Class.forName("com.mysql.jdbc.Driver");
			//Establishing connection with database via JDBC 
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			
			String query=" select distinct * from employee e,department d where salary = (select distinct salary from employee order by salary desc limit 2,1) and e.dept_no=d.dept_no order by salary desc;";
		 	
			Statement stmt=conn.createStatement();
		 	ResultSet rs = stmt.executeQuery(query);
		 	
		 	while(rs.next()) {
				  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getInt(7)+" "+rs.getString(8));
			  }
		
		 	conn.close();
		 	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
