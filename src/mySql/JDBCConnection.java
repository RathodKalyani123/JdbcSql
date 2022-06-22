package mySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCConnection {
	public static void main(String[] args)  {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded");
		String url="jdbc:mysql://localhost:3306/Student";
		String username="root";
		String password="kalyani";
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "kalyani");
		System.out.println("DB connection is done");
		
		Statement statement=connection.createStatement();
		String Query="select * from CUSTOMER2";
		
		ResultSet resultSet=statement.executeQuery(Query);
		
		while(resultSet.next())
		{
			System.out.println("id is "+resultSet.getInt(1));
			System.out.println("fname "+resultSet.getString("Kalyni"));
			System.out.println("lname is "+resultSet.getString("Rathod"));
			System.out.println("address is "+resultSet.getString("Amway"));
			
		}			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
