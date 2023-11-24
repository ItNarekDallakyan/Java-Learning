package collections.list.arraylist.ArrayListJDBC_Crud;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServiceClassUsingArrayLists {
	static	ArrayList<Student> studArrList=new ArrayList<>();
	Scanner scanOptionArraylist=new Scanner(System.in);
	void menuOfArraylist()
	{
		int optionArraylist=0;
		
		do{
			
			System.out.println("1 : insert Student.");
			System.out.println("2 : Show all Students.");
			System.out.println("3 : delete Student By RollNo.");
			System.out.println("4 : update Student By RollNo.");
			System.out.println("5 : Search Student By RollNo.");
			System.out.println("6 : Exit The Program.");
			
			
			System.out.println("ArrayList : Enter The Index Number : ");
			
			optionArraylist=scanOptionArraylist.nextInt();
			getOptionForArraylist(optionArraylist);
		}while(optionArraylist!=6);
		
	}
	
		 void getOptionForArraylist(int optionArraylist) {
		// TODO Auto-generated method stub
			 switch(optionArraylist)
				{

				case 1 : insertInToarrayList();//
							break;
				case 2 : showAllStudentArraylist();//
							break;
				case 3: deleteStudentArrayList();//
						break;
				case 4 : updateStudentArrayList();
						break;
				case 5 : searchInToArrayListByRollNo();//
						break;		
				case 6 : System.out.println("Thank You!!!");
							//scanOptionArraylist.close();
							System.exit(0);
				
				default : System.out.println("please Enter The Correct Number/n");
							
				}
			 
	}

		private void updateStudentArrayList() {
			// TODO Auto-generated method stub
			System.out.println("Enter the roll no to Update : ");
			Scanner scann=new Scanner(System.in);
			int searchRollNo=scann.nextInt();
			
			for(Student student:studArrList)
			{
				if(student.getRollNo()==searchRollNo)
				{
					System.out.println("Enter New Set Of values:");
					System.out.println("Enter Name Of Student");
					student.setName(scann.next());
					System.out.println("Enter City :");
					student.setCity(scann.next());
					System.out.println("Enter DateOOfPassing : ");
					student.setDateOfPassing(scann.next());
					System.out.println("Enter technologies :");
					student.setTechnologies(scann.next());
					
					System.out.println("Record updated successfully");
				
				}
				
			}
			
			
			
			//scanner object
		}

		private void deleteStudentArrayList() {
			// TODO Auto-generated method stub
			System.out.println("Enter the roll no : ");
			Scanner scann=new Scanner(System.in);
			int searchRollNo=scann.nextInt();
			
/*
			
	//java.util.ConcurrentModificationException
	//code not work bcz collection wont allow for each to update or remove the element
	// we have to use iterator here
		for(Student stud:studArrList)
			{
				if(stud.getRollNo()==(searchRollNo))
					{
						
					studArrList.remove(stud);
					//System.out.println(stud);
					}
				
			}
				
			
*/
			Iterator<Student> itr=studArrList.iterator();
			while(itr.hasNext()){
				//Student str=itr.next();
				if(itr.next().getRollNo()==searchRollNo)
				{
				//System.out.println("Record"+itr);
					//	System.out.println("The Record of Roll No :"+itr.next().getRollNo()+" And Name : "+itr.next().getName()+" is Removed");

					itr.remove();
				}
				
				//System.out.println(itr.next());
			}
			
			
			
			
			//scanner object
			//scann.close();
		}

		private void showAllStudentArraylist() {
			// TODO Auto-generated method stub
			System.out.println(studArrList);
			
		}

		

		void insertInToarrayList()
			{
		// insert in to ArrayList
			Scanner scanStudent=new Scanner(System.in);
			System.out.println("enter The roll NO of Student : ");	
			int insertRollNo=scanStudent.nextInt();
			System.out.println("Enter Name : ");	
			String InsertName=scanStudent.next();
			System.out.println("Enter City : ");	
			String InsertCity=scanStudent.next();
			System.out.println("Enter Date Of Passing : ");	
			String insertDate=scanStudent.next();
			System.out.println("Enter technologies : ");	
			String insertTechnologies=scanStudent.next();

		studArrList.add(new Student(insertRollNo,InsertName,InsertCity,insertDate,insertTechnologies));
	
		
		System.out.println("Record Added To ArrayList");
		//	System.out.println("Student"+studArrList);
		
			//scanner object	
	//	scanStudent.close();	
	}
	
	
		
		void searchInToArrayListByRollNo()
		{

			//search by roll name
				
			System.out.println("Enter RollNo Of Student to search : ");
			Scanner scannName=new Scanner(System.in);
			int searchName=scannName.nextInt();
		
			
				for(Student stud:studArrList)
				{
					try {
						
//						if(stud.getName().equals(searchName))
						if(stud.getRollNo()==searchName)
						{
							System.out.println(stud);
						}
						
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				}
			
		}
	
}
