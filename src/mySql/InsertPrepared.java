package mySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertPrepared {
	public static void main(String[] args) {
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded");
			  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Kalyanidb","root","kalyani");  
			  
			PreparedStatement stmt=con.prepareStatement("insert into Persons values(?,?)");  
			stmt.setInt(1,5);//1 specifies the first parameter in the query  
			stmt.setString(2,"patil");  
			  
			int i=stmt.executeUpdate();  
			System.out.println(i+" records inserted");  
			  
			con.close();  
			  
			}catch(Exception e)
		{ System.out.println(e);}  
			  
			}  
			 
	}


