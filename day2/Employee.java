package day2;

public class Employee {

		private Integer id;
		private String name;
		private Double salary;
		
		public Integer getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name=name;
		}
		public Double getSalary() {
			return salary;
		}
		public void setSalary(Double salary) {
			this.salary=salary;
		}
		
		public static void main(String[] args) {
			Employee emp = new Employee();
			emp.setId(1);
			emp.setName("kavya");
			System.out.println(emp.getId());
			System.out.println(emp.getName());
	}

}
