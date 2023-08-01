package com.velocity.Demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {
   static Connection connection = null;
	
	public static Connection getConnectionDetails() {
	  try {
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","root");
	  } catch ( Exception e){
		 e.printStackTrace(); 
	  }
		return connection ;
		
	}
}

	
	
	
