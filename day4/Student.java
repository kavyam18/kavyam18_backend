package day4;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Student {
      private int id;
      private String name;
      private int age;
      private Double marks;
	
	public Student(int id, String name, int age, Double marks) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.marks=marks;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

    public Double getMarks() {
		return marks;
	}
	public void setMarks(Double marks) {
		this.marks = marks;
	}
    @Override
    public String toString() {
    	return "Student [id=" + id + ", name=" + name + ", age=" + age + ", marks="+marks+"]";
    }
    @Override
	 public int hashCode() {
		 return this.age;
	 }
    @Override
    public boolean equals(Object e) {
   	 Student std = (Student)e;
   	 return this.hashCode() == std.hashCode();	 
    }
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		  Set<Student> hs = new LinkedHashSet<>();
		   while(true) {
			   System.out.println(" ENTER the Student id:");
			   int id = scan.nextInt();
			   System.out.println(" ENTER the Student name:");
			   String name = scan.next();
			   System.out.println(" ENTER the Student age:");
			   int age = scan.nextInt();
			   System.out.println(" ENTER the Student marks:");
			   Double marks = scan.nextDouble();
			   hs.add(new Student(id, name, age, marks));
			   System.out.println(" ENTER more:");
			   String res = scan.next();
			   if(res.equalsIgnoreCase("no"))
					   {
				        break; 
					   }
			   
			   }
		   for(Student std:hs) {
			   System.out.println(std);
}		  

	}

}
