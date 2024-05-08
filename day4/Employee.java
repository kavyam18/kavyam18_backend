package day4;

public class Employee {
	private int id;
	private String name;
	private Double salary;
	
	public Employee(int id, String name, Double salary) {
		 this.id= id;
		 this.name = name;
		 this.salary = salary;
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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
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
	 Employee emp = (Employee)e;
	 return this.hashCode() == emp.hashCode();	 
 }

	public static void main(String[] args) {


	}
	

}
