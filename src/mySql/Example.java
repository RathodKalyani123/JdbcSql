package mySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;

public class Example {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
		
		final String url="jdbc:mysql://localhost:3306/Student";
		final String username="root";
		final String password="kalyani";
		 final String dbname="Student";
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","kalyani");
		System.out.println("database is done");
		
		Statement statement=connection.createStatement();
		String Query="select * from CUSTOMER1";
ResultSet resultSet=statement.executeQuery(Query);
		
		while(resultSet.next())
		{
			System.out.println("id is "+resultSet.getInt(1));
			System.out.println("fname "+resultSet.getString("kalyani"));
			System.out.println("lname is "+resultSet.getString("Rathod"));
			System.out.println("product is "+resultSet.getString("Amway"));
			
		}			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}


}
}