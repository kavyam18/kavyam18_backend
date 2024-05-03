package day4;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class StudentByMarks {

	public static void main(String[] args) {
      Comparator<Student> com=new Comparator<Student>() {
			
			@Override
			public int compare(Student e1, Student e2) {
				
				return e2.getMarks().compareTo(e1.getMarks());
			}
		};
		
		
		TreeSet<Student> Students=new TreeSet<Student>(com);
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Student Id:");
			int id=sc.nextInt();
			System.out.println("Enter Student Name:");
			String name=sc.next();
			System.out.println("Enter Student Age:");
			int age=sc.nextInt();
			System.out.println("Enter Student marks:");
			Double marks=sc.nextDouble();
			Students.add(new Student(id, name,age, marks));
			System.out.println("want to add more Students:");

			String value=sc.next();
			if(value.equalsIgnoreCase("no"))
				break;
		}
		for(Student std:Students) {
			System.out.println(std);
		}
	}
}
