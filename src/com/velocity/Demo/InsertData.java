package com.velocity.Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) {
		try {
           // generating insert query
			
		String insertQuery ="insert into employee (firstname,lastname,adrress,city,salary) "
				+ "values('Sagar','patil','Delhi-6','Mumabai',30000)";
		  //Step-1 : Load the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Step-2 : Establish the connection.
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root");
		//step-3 : create the sql statement
		Statement statement = con.createStatement();
		// step-4 : submit the sql staement to the database
		statement.execute(insertQuery);
		System.out.println("Insertion Done!!!!");
		//step-5:close the resource
		statement.close();
		con.close();
	}catch(Exception e) {
   e.printStackTrace();
}
}
}