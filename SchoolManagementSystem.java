package com.sree.core;

import java.util.ArrayList;
import java.util.Scanner;

//class school
//{
//	String courses;
//	String Electives;
	
//}

 //class students
//{
	//String name;
	//int percent;
	
	
//}

 //class teacher{
	// String name;
	 //String subject;
	 
 //}

public class SchoolManagementSystem {

	public static void main(String[] args) {
		
	System.out.println("ADMISSION FOR 12TH CLASS IN ABC SCHOOL");
		
		
	 SchoolManagementSystem schoolmanagemnt= new SchoolManagementSystem();
	 
	 schoolmanagemnt.course();
	 schoolmanagemnt.Elective();
	 schoolmanagemnt.Teacher();
	 
System.out.println("enter name of 1st student");
Scanner scn=new Scanner(System.in);
String name=scn.nextLine();

System.out.println("enter name of 2nd student");
Scanner scn1=new Scanner(System.in);
String name1=scn1.nextLine();


			
	System.out.println("Name of students" + name);
	System.out.println("Name of students" + name1);


		
		ArrayList<Integer> percent=new ArrayList();
		percent.add(90);
		percent.add(78);
		percent.add(80);
	//	System.out.println(percent);
		Object [] arr1=percent.toArray();
		for (Object Percent:arr1)
		{
			System.out.println("Percentage of students" + Percent);
	
		}
		
			}
			
			
				public void course()
				{
			System.out.println("COURSES OFFRERD");
			System.out.println("ENGLISH");
			System.out.println("PHYSISCS");
			System.out.println("CHEMISTRY");
			System.out.println("HINDI");
			System.out.println("MATHEMATICS");
				}
	
				public void Elective()
				{
					System.out.println("Electives OFFRERD");
					System.out.println("HINDI");
					System.out.println("MALAYALAM");
					System.out.println("SANSKRIT");
					
					
				}

				public void Teacher()
				
				
				{
					System.out.println("name of teacher  " +  " " + "Manju"+ " " + "subject taking is" + " " + "English");
					System.out.println("name of teacher  " +  " " + "Amritha"+ " " + "subject taking is" + " " + "PHYSICS");
					System.out.println("name of teacher  " +  " " + "SUJA"+ " " + "subject taking is" + " " + "MATHEMATICS");
				}
				

	

}
