package com.velocity.Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpadateDataPreaparedStatement {

	public static void main(String[] args) {
		try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root","root");
		String query = "update employee set firstname =?,lastname=?,salary=?";
		
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1,"Vishal");
		ps.setString(2,"Deshmukh");
		ps.setInt(3,10000);
		ps.setInt(4,3);// there is problem in this statement
		
		ps.executeUpdate();
		System.out.println("Update is done");
		ps.close();
		con.close();
		} catch (Exception e) {
			
		}
   
	    
		
	}

}
