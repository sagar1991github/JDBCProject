package com.velocity.Demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserData {

	Connection con = null;
	PreparedStatement ps = null;
	public void insertemployeeData(String fname,String lname,String add,String city,int salary) {
		try {
			con=JDBCConnection.getConnectionDetails();
			String query = "insert into employee(firstname,lastname,adrress,city,salary)" + "values(?,?,?,?,?)";
			    ps = con.prepareStatement(query);
			    ps.setString(1,fname);
			    ps.setString(2,lname);
			    ps.setString(3, add);
			    ps.setString(4,city);
			    ps.setInt(5, salary);
                  
			    int i = ps.executeUpdate();
			    
			  System.out.println("Data insertion done successful!!!!!!!");
			  
	} catch (Exception e) {
		
	} finally {
		try {
		con.close();
	} catch (SQLException e) {
		// to auto generated catch block
		e.printStackTrace();
	}
}
}
	public void execute(int input) {
		Scanner sc = new Scanner(System.in);
	
		
		for(int i=0;i<input;i++) {
			System.out.println("Enter First Name >>");
			String fname=sc.next();
			System.out.println("Enter last Name >>");
			String lname=sc.next();
			System.out.println("Enter Adress Name >>");
			String add=sc.next();
			System.out.println("Enter City Name >>");
			String city =sc.next();
			System.out.println("Enter Salary >>");
		        int salary=sc.nextInt();
			this.insertemployeeData(fname, lname, add, city, salary);
		}
	}
	public static void main(String[] args) {
   
		UserData data =new UserData();
		data.execute(2);

	}

}
