package collections.list.arraylist.ArrayListJDBC_Crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ServiceClassUsingJDBC {
	public void menuOfJdbc() {
		// TODO Auto-generated method stub
		
		int optionJdbc=0;
		Scanner scann=new Scanner(System.in);
		do
		{

			System.out.println("1 : insert Student.");
			System.out.println("2 : display all students.");
			System.out.println("3 : delete Student By RollNo.");
			System.out.println("4 : update Student By RollNo.");
			System.out.println("5 : Search Student By RollNo.");
			System.out.println("6 : Exit The Program.");
			
			
			System.out.println("JDBC : Enter The Index Number : ");
			
			optionJdbc= scann.nextInt();
			getOptionForJdbc(optionJdbc);
		}while(optionJdbc!=6);
		
	}

	
	private void getOptionForJdbc(int optionJdbc) {
		// TODO Auto-generated method stub
		switch(optionJdbc)
		{

		case 1 : insertStudent();
					break;
		case 2 : displayAllStudents();
					break;
		case 3: deleteStudent();
				break;
		case 4 : updateStudent();
				break;
		case 5 : searchStudent();
				break;		
		case 6 : System.out.println("Thank You!!!");
				System.exit(0);
		
		default : System.out.println("please Enter The Correct Number/n");
					
		}
	}


	public static void updateStudent() {
		// TODO Auto-generated method stub
		Scanner scannStudet=new Scanner(System.in);
		System.out.println("Enter Roll No of Student");
		int insertiRollNo=scannStudet.nextInt();
		System.out.println("Enter Name to updated: ");	
		String inputName=scannStudet.next();
		System.out.println("Enter city : ");	
		String inputCity=scannStudet.next();
		System.out.println("Enter dateOFPassing : ");	
		String inputDateOfPassing=scannStudet.next();
		System.out.println("Enter Technologies : ");	
		String inputTechnologies=scannStudet.next();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","root");
			PreparedStatement ps=con.prepareStatement("update stud set name=?, city=?, dateOfPassing=?, technologies=? where rollno=?");
			
			ps.setString(1,inputName);
			ps.setString(2,inputCity);
			ps.setString(3,inputDateOfPassing);
			ps.setString(4,inputTechnologies);
			ps.setInt(5,insertiRollNo);
			
			ps.executeUpdate();
			System.out.println("Record Updated Successsfully......");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//menuIndexMethod();
	}
	public static void deleteStudent() {
		// TODO Auto-generated method stub
		Scanner scannStudet=new Scanner(System.in);
		System.out.println("Enter Roll No of Student");
		int insertiRollNo=scannStudet.nextInt();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","root");
			PreparedStatement ps=con.prepareStatement("delete from stud where rollno=?");
			
			ps.setInt(1,insertiRollNo);
			
			ps.executeUpdate();
			System.out.println("Record Updated Successsfully......");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//menuIndexMethod();
	}
	
	public static void insertStudent() {
		// TODO Auto-generated method stub
		Scanner scannStudet=new Scanner(System.in);
		System.out.println("Enter Roll No of Student");
		int insertiRollNo=scannStudet.nextInt();
		System.out.println("Enter Name : ");	
		String inputName=scannStudet.next();
		System.out.println("Enter city : ");	
		String inputCity=scannStudet.next();
		System.out.println("Enter dateOFPassing : ");	
		String inputDateOfPassing=scannStudet.next();
		System.out.println("Enter Technologies : ");	
		String inputTechnologies=scannStudet.next();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","root");
			PreparedStatement ps=con.prepareStatement("insert into stud values(?,?,?,?,?)");
			ps.setInt(1,insertiRollNo);
			ps.setString(2, inputName);
			ps.setString(3, inputCity);
			ps.setString(4, inputDateOfPassing);
			ps.setString(5, inputTechnologies);
			
			ps.executeUpdate();
			System.out.println("Record Added Successsfully......");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//menuIndexMethod();
	}
	
	public static void searchStudent()
	{
		
		
		System.out.println("Enter the roll Number of Student : ");
		Scanner scannn=new Scanner(System.in);
		int searchRollNo= scannn.nextInt();
		
//searchRollNo=11;
		System.out.println(searchRollNo);
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "root");
			PreparedStatement ps=con.prepareStatement("select * from stud where rollno=?");
			ps.setInt(1,searchRollNo);
			
			
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
			System.out.println("Roll No : "+rs.getInt(1)+", Name : "+rs.getString(2)+", City : "+rs.getString(3)+", DateOfPassing : "+rs.getString(4)+", Technologies : "+rs.getString(5));	
			
			}
			con.close();

			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//menuIndexMethod();
	}
	private static void displayAllStudents() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "root");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from stud");
			while(rs.next())
			{
			System.out.println("Roll No : "+rs.getInt(1)+", Name : "+rs.getString(2)+", City : "+rs.getString(3)+", DateOfPassing : "+rs.getString(4)+", Technologies : "+rs.getString(5));	
			
			}
			con.close();

			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}
