package com.velocity.Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectPreparedStatement {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root","root");
			String query = "select * from employee";
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("ID:"+rs.getInt(1));
				System.out.println("First Name:"+rs.getString(2));
				System.out.println("Last Name:"+rs.getString(3));
				System.out.println("Adress:"+rs.getString(4));
				System.out.println("City:"+rs.getString(5));
				System.out.println("Salary"+rs.getInt(6));
	    	rs.close();
			ps.close();
			con.close();
			}		
		} catch (Exception e ) {
			
		}
		}
}

	


	


