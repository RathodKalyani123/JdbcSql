package mySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlCon {
	public static void main(String[] args) throws ClassNotFoundException   {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student1","root","kalyani");
			System.out.println("connected with the database successfully");
			
		}catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
		
		
}
		
			/*String url="jdbc:mysql://localhost:3306/";
			StringBuilder builder=new StringBuilder();
			System.out.println(url);
			final String username="root";
			final String password="kalyani";
			
			Connection con1=DriverManager.getConnection(url,username,password);
			System.out.println("db connection is done");
			
			
		}catch (SQLException e){
			e.printStackTrace();
		}*/
	


	
	
			/*//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from Student1");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+" "+rs.getInt(4));  
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
			}*/

