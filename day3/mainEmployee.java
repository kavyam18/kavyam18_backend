package day3;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class mainEmployee {


	public static void main(String[] args) {
      List<Employee> emp = new LinkedList<Employee>();
       emp.add(new Employee(5, "Dhanush", 100.50));
       emp.add(new Employee(2, "Gokul", 101.20));
       emp.add(new Employee(7, "Divya", 121.45 ));
       emp.add(new Employee(4, "Haritha", 132.89));
//       Collections.sort(emp,(e1, e2)->e1.getId()-e2.getId());
//       Collections.sort(emp,(e1,e2)-> e1.getName().compareTo(e2.getName()));
         Collections.sort(emp,(e2,e1)-> e1.getSalary().compareTo(e2.getSalary()));
       for(Employee e: emp) {
    	   System.out.println(e);
       }
        

	}

	public int compare(Employee o1, Employee o2) {
	
		return o1.getId()-o2.getId();
	}

 

}
