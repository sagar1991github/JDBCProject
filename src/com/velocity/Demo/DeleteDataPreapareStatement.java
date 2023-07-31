package com.velocity.Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDataPreapareStatement {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root","root");
			String query = "delete from employee whrer id=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1,3);
			ps.executeUpdate();
			System.out.println("Data is deleted....");
			ps.close();
			con.close();
			
		} catch (Exception e ) {
			
		}

	}

}
