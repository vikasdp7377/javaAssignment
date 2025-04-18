package practice2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import example.jdbc.Department;
import example.jdbc.JdbcDao;
import example.jdbc.JdbcUtils;

public class StudDao implements StudentDao<Student,Integer>
{

	@Override
	public Collection<Student> getAll() {
		Collection<Student> allStudents = new ArrayList<>();
		 try(
				  Connection dbConnection = JdbcUtils.buildConnection();
				  Statement stmt = dbConnection.createStatement();
				  ResultSet rs=stmt.executeQuery("select * from student");
				  ){
			 while(rs.next())
			 {
			 int rollno = rs.getInt(1);
			 String name=rs.getString(2);
			 String city=rs.getString(3);
			 Student stud=new Student(rollno,name,city);
			 allStudents.add(stud);
			 }
		 }
		 catch(Exception ex)
		 {
			 ex.printStackTrace();
		 }
		return allStudents;
	}

	@Override
	public Student getOne(Integer rollno)
	{
		Student foundStudent = null;
		String sqlQuery = "select * from student where rollno = ?";
		try(
				 Connection dbConnection = JdbcUtils.buildConnection();
				PreparedStatement pstmt = dbConnection.prepareStatement(sqlQuery);
				){
			
			pstmt.setInt(1, rollno);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
			{
				  int rollno1 = rs.getInt(1);
				  String name = rs.getString(2);
				  String city = rs.getString(3);
				  foundStudent = new Student(rollno,name,city);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return foundStudent;
	
		
		
	}

	@Override
	public void add(Student stud) 
	{
		String sqlQuery = "insert into student values(?,?,?)";
		try(
				 Connection dbConnection = JdbcUtils.buildConnection();
				PreparedStatement pstmt = dbConnection.prepareStatement(sqlQuery);
				){
			int rollno=stud.getRollno();
			String name = stud.getName();
			String city = stud.getCity();
			
			pstmt.setInt(1, rollno);
			pstmt.setString(2,name);
			pstmt.setString(3,city);
			int updateCount = pstmt.executeUpdate();
			System.out.println(updateCount + "record inserted");
			
		
		
		}
		 catch(Exception ex)
		  {
			  ex.printStackTrace();
		  }
			
		
	}

	@Override
	public void update(Student t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer key) {
		// TODO Auto-generated method stub
		
	}

}
