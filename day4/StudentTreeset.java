package day4;

import java.util.Scanner;
import java.util.TreeSet;

public class StudentTreeset {
 private int id;
 private String name;
 private int age;
 private Double marks;
 
 public StudentTreeset(int id, String name, int age, Double marks) {
	 this.id=id;
	 this.name=name;
	 this.age=age;
	 this.marks=marks;
 }
 
 @Override
	public String toString() {
		return id+" "+name+" "+marks;
	}
	@Override
	public int hashCode() {
		return id;

	}
	@Override
	public boolean equals(Object e) {
		Student std=(Student) e;
		return this.hashCode()==std.hashCode();

	}
	public static void main(String[] args) {
			TreeSet<Student> Students=new TreeSet<Student>((s1,s2) ->s1.getId()-s2.getId());
			while(true) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Student Id:");
				int id=sc.nextInt();
				System.out.println("Enter Student Name:");
				String name=sc.next();
				System.out.println("Enter Student Age:");
				int age=sc.nextInt();
				System.out.println("Enter Student Marks:");
				Double marks=sc.nextDouble();
				Students.add(new Student(id, name, age, marks));
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
