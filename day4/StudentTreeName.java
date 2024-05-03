package day4;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class StudentTreeName {
	
	
	public static void main(String[] args) {
		
		Comparator<Student> cp=new Comparator<Student>() {
			
			@Override
			public int compare(Student s1, Student s2) {
				
				return s1.getName().compareTo(s2.getName());
			}
		};
				TreeSet<Student> Students=new TreeSet<Student>(cp);
				while(true) {
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter Student Id:");
					int id=sc.nextInt();
					System.out.println("Enter Student Name:");
					String name=sc.next();
					System.out.println("Enter Student age:");
					int age=sc.nextInt();
					System.out.println("Enter Student marks:");
					Double marks=sc.nextDouble();
					Students.add(new Student(id, name, age,marks));
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

