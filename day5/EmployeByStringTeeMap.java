package day5;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class EmployeByStringTeeMap {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		Comparator<String> cp = new Comparator<String>() {
//			
//			@Override
//			public int compare(String e1, String e2) {
//				return (e1).compareTo(e2);
//      }
//   };
		
		//we cannot sort by value in TreeMap
       //we can only sort by key
		
   //Using lamda method
//	TreeMap<String, Employee> tm = new TreeMap<>((e1, e2)->e1.compareTo(e2));
		//Short way of using lamda 
		Comparator<String> cp = Comparable::compareTo;
		//method reference
//		TreeMap<String, Employee> tm = new TreeMap<String, Employee>(Comparable::compareTo);

	  TreeMap<String, Employee> tm = new TreeMap<String, Employee>();

		   while(true) {
			   System.out.println(" ENTER the employee id:");
			   int id = scan.nextInt();
			   System.out.println(" ENTER the employee name:");
			   String name = scan.next();
			   System.out.println(" ENTER the employee department:");
			   String dept = scan.next();
			   System.out.println(" ENTER the employee designation:");
			   String desig = scan.next();
			   tm.put( name, new Employee(id, name, dept, desig));
			   System.out.println(" ENTER more:");   
			   String res = scan.next();
			   if(res.equalsIgnoreCase("no"))
					   {
				        break; 
					   }
			   
			   }
		   Set<Entry<String, Employee>> entrySet = tm.entrySet();
		   
		   for(Entry<String, Employee>entry : entrySet) {
			   System.out.println(entry.getKey()+"===>"+entry.getValue());
		   }

	}

}
