package day5;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


public class Employee {

	private int id;
	private String name;
	private String dept;
	private String desig; 
	
	public Employee(int id, String name, String dept, String desig) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.desig = desig;
	}

   
   @Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", desig=" + desig + "]";
	}


@Override
   public int hashCode() {
		 return this.id;
	 }
	

}
		
		

	


