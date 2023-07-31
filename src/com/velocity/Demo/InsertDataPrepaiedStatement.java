package com.velocity.Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDataPrepaiedStatement {

	public static void main(String[] args) {
	    try {
		// step-1 :load the driver class
		//Class.forName("com.mysql.cj.jdbc.Driver");
		 // step-2 : Establish the connection
	    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root","root");
		// step-3 : create prepared statement
	   String query ="insert into employee(firstname,lastname,adrress,city,salary)" 
		 + "values(?,?,?,?,?)";
	    PreparedStatement ps = con.prepareStatement(query);
	    ps.setString(1,"Sakshi");
	    ps.setString(2, "Dakhite");
	    ps.setString(3, "Amaravati");
	    ps.setString(4, "Dhule");
	    ps.setInt(5, 10000);
	    // step 4-submit sql statement to the database
	    int i =ps.executeUpdate();
	    System.out.println("Data is added "+i);
	    // step 5- close the resources
	    ps.close();
	    con.close();
	    
	    } catch (Exception e) {
	    	
	    	e.printStackTrace();
	    }
	}
	    

}
