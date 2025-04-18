package practice2;

import java.util.Collection;
import java.util.Scanner;

import example.jdbc.Department;
import example.jdbc.DepartmentDao;
import example.jdbc.JdbcDao;

public class StudentMain
{
	private static void showAllStudents()
	{
       StudentDao<Student ,Integer> dao = new StudDao();
	    Collection<Student>studList=dao.getAll();
	
	    for(Student stud : studList)
	     System.out.println(stud);
	}
	private static void showOneStudent()
	{
		  StudentDao<Student ,Integer> dao = new StudDao();
		  Student stud=dao.getOne(10);
		  if(stud != null)
				System.out.println(stud);
			else
				System.out.println("Student with given Rollno does not exists.");
	}
	private static void addNewStudent()
	{
		 StudentDao<Student ,Integer> dao = new StudDao();
		 Student stud = new Student(40,"Vikas","Nashik");
			dao.add(stud);
	}
	
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("⬇️⬇️============= Menu ===============⬇️⬇️");
	    System.out.println("\n1.View All Student"
	    		+ "\n2.Search One Student"
	    		+ "\n3.Add Student"
	    		+ "\n4.Update Student"
	    		+ "\n5.Exit");
		boolean exit = true;
		while(exit)
		{
			System.out.println("Enter Your choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			  case 1:
				  System.out.println("⬇️----------View All Student-----------⬇️");
				  showAllStudents();
				  break;
			  case 2:
				  System.out.println("!!------------One Student Information Display-----------!!");
				  showOneStudent();
				  break;
			  case 3:
				  System.out.println("!!----------Add Student---------!!");
				  addNewStudent();
				  break;
			  case 4:
				  System.out.println("!!---------Update Student--------!!");
				  break;
			  case 5:
				  System.out.println("Thank You....!!");
				  break;
				default:
					System.out.println("Invalid Choice, Try Again.....!!");
			 
			}
		}
		
		
		
		
	}

}
