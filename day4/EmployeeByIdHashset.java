package day4;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class EmployeeByIdHashset {
	private int id;
	private String name;
	private Double salary;
	
	public EmployeeByIdHashset(int id, String name, Double salary) {
		 this.id= id;
		 this.name = name;
		 this.salary = salary;
		 }
	 public String toString() {
		 return this.id+" "+this.name+" "+this.salary;
	 }
	 @Override
	 public int hashCode() {
		 return this.id;
	 }
	 
	 @Override
 public boolean equals(Object e) {
	 EmployeeByIdHashset emp = (EmployeeByIdHashset)e;
	 return this.hashCode() == emp.hashCode();	 
 }


	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
    		  Set<EmployeeByIdHashset> hs = new LinkedHashSet<>();
    		   while(true) {
    			   System.out.println(" ENTER the employee id:");
    			   int id = scan.nextInt();
    			   System.out.println(" ENTER the employee name:");
    			   String name = scan.next();
    			   System.out.println(" ENTER the employee salary:");
    			   Double salary = scan.nextDouble();
    			   hs.add(new EmployeeByIdHashset(id, name, salary));
    			   System.out.println(" ENTER more:");
    			   String res = scan.next();
    			   if(res.equalsIgnoreCase("no"))
    					   {
    				        break; 
    					   }
    			   
    			   }
    		   for(EmployeeByIdHashset emp:hs) {
				   System.out.println(emp);
     }		  
	}

}
