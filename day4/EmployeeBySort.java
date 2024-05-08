package day4;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class EmployeeBySort {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number");
    int choice = scan.nextInt();
    List<Employee> emp = new LinkedList<>();
    emp.add(new Employee(2,"dhanush",76.4));
    emp.add(new Employee(1,"gokul",96.6));
    emp.add(new Employee(5,"divya",72.8));

    switch(choice) {
    case 1:
    	System.out.println("Sorting by employee Id:");
    	Collections.sort(emp,(e1,e2)->e1.getId()-e2.getId());
    	for(Employee s :emp) {
    		System.out.println(s);
    	}
    	break;
    case 2:
    	System.out.println("Sorting by employee Name:");
    	Collections.sort(emp,(e1, e2)->e1.getName().compareTo(e2.getName()));
    	for(Employee s :emp) {
    		System.out.println(s);
    	}
    	break;
    case 3:
    	System.out.println("Sorting by employee Salary:");
    	Collections.sort(emp,(e1, e2)->e1.getSalary().compareTo(e2.getSalary()));
    	for(Employee s :emp) {
    		System.out.println(s);
    	}
    	break;
    	default:
    		System.out.println("no");
    		break;
    }
    
	}

}
