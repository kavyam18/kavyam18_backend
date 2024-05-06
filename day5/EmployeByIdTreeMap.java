package day5;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.Map.Entry;

public class EmployeByIdTreeMap {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			
		Comparator<Integer> cp = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer e1, Integer e2) {
				return (e1).compareTo(e2);
      }
   };
		//we cannot sort by value in TreeMap
       //we can only sort by key
		TreeMap<Integer, Employee> tm = new TreeMap<>(cp);
		   while(true) {
			   System.out.println(" ENTER the employee id:");
			   int id = scan.nextInt();
			   System.out.println(" ENTER the employee name:");
			   String name = scan.next();
			   System.out.println(" ENTER the employee department:");
			   String dept = scan.next();
			   System.out.println(" ENTER the employee designation:");
			   String desig = scan.next();
			   tm.put( id, new Employee(id, name, dept, desig));
			   System.out.println(" ENTER more:");   
			   String res = scan.next();
			   if(res.equalsIgnoreCase("no"))
					   {
				        break; 
					   }
			   
			   }
		   Set<Entry<Integer, Employee>> entrySet = tm.entrySet();
		   
		   for(Entry<Integer, Employee>entry : entrySet) {
			   System.out.println(entry.getKey()+"===>"+entry.getValue());
		   }
		   

	}

}
