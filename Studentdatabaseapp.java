package studentdatabaseapp;

import java.util.Scanner;

public class Studentdatabaseapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ask how many students will be added to data base
	 Student  stu1 = new Student();
	 stu1.enroll();
	 stu1.payTuition();
	 System.out.println(stu1.toString());
   
	 
	 //ask how many students we want to add
	 System.out.println("enter number of students to enroll");
	 Scanner in = new Scanner (System.in);
	 int noOfStudents = in.nextInt();
	 Student [] students = new Student[noOfStudents];
	 
	//create n number of new students
	 for(int n = 0;n< noOfStudents;n++) {
		 students [n] = new Student();
		 students[n].enroll();
		 students[n].payTuition();
		 System.out.println(students[n].toString());
	   
		 
	 }
	}

}
