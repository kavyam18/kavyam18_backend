package day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;



public class EmployeeByIdHashMap {

	 @Override
	 public boolean equals(Object e) {
		 EmployeeByIdHashMap emp = (EmployeeByIdHashMap)e;
		 return this.hashCode() == emp.hashCode();	 
	 }
	 
	 
	public static void main(String[] args) {
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		Scanner scan = new Scanner(System.in);
		   while(true) {
			   System.out.println(" ENTER the employee id:");
			   int id = scan.nextInt();
			   System.out.println(" ENTER the employee name:");
			   String name = scan.next();
			   System.out.println(" ENTER the employee department:");
			   String dept = scan.next();
			   System.out.println(" ENTER the employee designation:");
			   String desig = scan.next();
			   emp.put( id, new Employee(id, name, dept, desig));
			   System.out.println(" ENTER more:");   
			   String res = scan.next();
			   if(res.equalsIgnoreCase("no"))
					   {
				        break; 
					   }
			   
			   }
		   Set<Entry<Integer, Employee>> entrySet = emp.entrySet();
		   
		   for(Entry<Integer, Employee>entry : entrySet) {
			   System.out.println(entry.getKey()+"===>"+entry.getValue());
		   }
//		   Set<Integer> keys=emp.keySet();
//			
//			Collections.sort(sorted);
//			for(Integer emps:sorted) {
//				System.out.println(emps+"==>"+emp.get(emps));
//			}
		   
}		  

	}


