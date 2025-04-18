package practice2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentQuery 
{
	public static void main(String[] args) 
	{
		String driverClassName="com.mysql.cj.jdbc.Driver";
		Connection dbConnection=null;
		Statement stmt = null;
		ResultSet rs=null;
		
		try {
			
			Class.forName(driverClassName);
			System.out.println("Driver Loaded");
		
			
            String connectionUrl="jdbc:mysql://localhost:3306/cdac";
            String userName="root";
            String password="password";
            dbConnection = DriverManager.getConnection(connectionUrl,userName,password);
			System.out.println("Connection established");
			
			stmt=dbConnection.createStatement();
			
			
			String sqlQuery = "select rollno,name,city from student";
			rs=stmt.executeQuery(sqlQuery);
			
			
			while(rs.next())
			{
				int rollno=rs.getInt(1);
				String name=rs.getString(2);
				String city=rs.getString(3);
				System.out.println(rollno+" "+name+" "+city);
			}
	     } catch (Exception e) {
	    	// TODO Auto-generated catch block
		 e.printStackTrace();
        }
		finally
		{
			try {
				rs.close();
				stmt.close();
				dbConnection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
