 package studentdatabaseapp;

import java.util.Scanner;

public class Student<n> {
	
	private static final int Q = 0;
	private String firstName;
	private String lastName;
	private int  gradeYear;
	private String courses;
	private String studentID;
	private int tuitionBalance=0;
	private static int costOfCourse = 600;
	private  static int id = 1000;
	
	  
	//cpnstructor for prompt user to enter their names and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the student first name:");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student last name:");
		this.lastName = in.nextLine();
		
		System.out.println("1-Freshmen\n2 - for sophmore\n3 - Junior\n4 - Senior \nEnter student class level name:");
	    this.gradeYear = in.nextInt();
	    
	   setStudentID(); 
	    //System.out.println(firstName + lastName + gradeYear + "" + studentID);
	    
	    
	    id++;
	    
	}
	  
	//generate id 
	
	private void setStudentID()
	{
		//grade level + id
	this.studentID = gradeYear + "   " + id;
	
		
	}
	
	//enroll in courses
	public void enroll() {
		//get inside a loop,user hits
		do {
		System.out.print("enter the course to enroll(Q to quit):");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
	    if(!course.equals ( "Q")) {
	    	courses = courses +"\n"+ course;
	    	tuitionBalance = tuitionBalance + costOfCourse;
	    	
	    }
		
	    else {
	    	System.out.println("BREAK!");
	    	
	    	
	    	break;
		}
		}
		while (1!= 0);
	    //System.out.println("ENROLLED IN :" + courses );
	    System.out.println("TUITION BALANCE:" + tuitionBalance);
		}
	//view balance
	public void viewBalance() {
		System.out.println("your balance is:"+ tuitionBalance);
		
	}
	//pay tuition
	public void payTuition( ) {
		System.out.println("enter your payment:");
		Scanner in  = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("thankyou for your paymen "+ payment);
		viewBalance();
	}
	//show info
	public String toString() {
		return "Name:" + firstName + lastName +"\nGrade level:"+ gradeYear +
				"\n Courses  Enrolled:" + courses + "\nBalance:" + tuitionBalance ;
	}
		  
	

}