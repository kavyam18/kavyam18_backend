package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.x.protobuf.MysqlxCrud.Update;

public class EmployeeDatabase {

	private static Connection connection;
	private static Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		EmployeeDatabase employeeDatabase = new EmployeeDatabase();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String user = "root";
			String pass = "Sa123";
			
			connection = DriverManager.getConnection(url, user, pass);
			
			

			System.out.println("Enter your choice:");
			System.out.println("press 1 for insert Employee Details:"+"press 2 for Select Employee by Id:"+
			                   "press 3 for Select all Employees"+"press 4 for Update the Employee Details:"+
					           "press 5 for Delete Employee Record:");
			
			
			int choice= scan.nextInt();
			switch(choice) {
			
			case 1:
				employeeDatabase.insertEmployee();
			break;
			
			case 2:
				employeeDatabase.selectEmployeeById();
			break;
			
			case 3:
				employeeDatabase.selectAllEmployee();
			break;
			
			case 4:
				employeeDatabase.UpdateEmployeeRecord();
			break;
			case 5:
				employeeDatabase.deleteEmployeerecord();
				
		    default:
    		    System.out.println("no");
    		break;
			}
			
		} 
		catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	private void insertEmployee() throws SQLException{
		String query = "insert into employee(name, salary, dept) values(?,?,?)";	
		
		Statement statement = connection.createStatement();
		PreparedStatement prepareStatement = connection.prepareStatement(query);
		
		System.out.println("Enter Employee Name:");
		prepareStatement.setString(1, scan.next());
		
		System.out.println("Enter Employee Salary:");
		prepareStatement.setDouble(2, Double.parseDouble(scan.next()));
		
		System.out.println("Enter the Employee Department:");
		prepareStatement.setString(3, scan.next());
		
		int rows = prepareStatement.executeUpdate();
		
		if(rows!=0) {
			System.out.println("record inserted successfully!");
		}
			
	}
	
	private void selectEmployeeById() throws SQLException {
		System.out.println("Enter the Employee Id:");
		int id = Integer.parseInt(scan.next());
		
		String query = "select * from employee where id="+id;
		Statement statement = connection.createStatement();
		
		ResultSet rs = statement.executeQuery(query);
		if(rs.next()) {
			int empid = rs.getInt("id");
			System.out.println("ID:"+id);
			String name = rs.getString("name");
			System.out.println("Name:"+name);
			double salary = rs.getDouble("salary");
			System.out.println("Percentage:"+salary);
			String dept = rs.getString("dept");
			System.out.println("Department:"+dept);
		}else {
			System.out.println("No Record Found!");	
		}
	}
	
 private void selectAllEmployee() throws SQLException {
	 String query = "select * from employee";
	 Statement statement = connection.createStatement();
	 
	 ResultSet rs = statement.executeQuery(query);
	 while(rs.next()) {
		    int empid = rs.getInt("id");
			System.out.println("ID:"+empid);
			String name = rs.getString("name");
			System.out.println("Name:"+name);
			double salary = rs.getDouble("salary");
			System.out.println("Percentage:"+salary);
			String dept = rs.getString("dept");
			System.out.println("Department:"+dept); 
	 }
	 connection.close();
 }

 private void UpdateEmployeeRecord() throws SQLException {
	 System.out.println("Enter the Employee Id:");
		int id = Integer.parseInt(scan.next());
		
	 String query = "select * from employee where id="+id;
	 Statement statement = connection.createStatement();
		
	 ResultSet rs = statement.executeQuery(query);	
     if(rs.next()) {
    	    int empid = rs.getInt("id");
			System.out.println("ID:"+empid);
			String name = rs.getString("name");
			System.out.println("Name:"+name);
			double salary = rs.getDouble("salary");
			System.out.println("Percentage:"+salary);
			String dept = rs.getString("dept");
			System.out.println("Department:"+dept); 
			
			String updateQuery = "Update Employee Set";
			System.out.println("1.Update Employee Name \n"+"2.Update Employee Salary \n"+"3.Update Employee Department");
			int choice = Integer.parseInt(scan.next());
			switch(choice) {
			case 1:
				System.out.println("Enter new name:");
				String newName =scan.next();
				
				updateQuery = updateQuery + " name = ? where id = " + id; 
				PreparedStatement preparestatement = connection.prepareStatement(updateQuery);
				preparestatement.setString(1, newName);
				int result =preparestatement.executeUpdate();
				if(result!=0) {
				System.out.println("record update succesfully!");
				}else {
					System.out.println(" no record update succesfully!");
				}
			break;
			case 2:
				System.out.println("Enter new Salary:");
				String newSalary =scan.next();
				
				updateQuery = updateQuery + " salary = ? where id = "+ id;
				PreparedStatement preparestatement1 = connection.prepareStatement(updateQuery);
				preparestatement1.setString(1, newSalary);
				int row1 =preparestatement1.executeUpdate();
				if(row1!=0) {
				System.out.println("record update succesfully!");
				}else {
					System.out.println(" no record update succesfully!");
				}
			break;
			case 3:
			System.out.println("Enter new Department:");
			String newDept =scan.next();
			
			updateQuery = updateQuery + " dept = ? where id = "+id;
			PreparedStatement preparestatement2 = connection.prepareStatement(updateQuery);
			preparestatement2.setString(1, newDept);
			int row2 =preparestatement2.executeUpdate();
			if(row2!=0) {
			System.out.println("record update succesfully!");
			}else {
				System.out.println(" no record update succesfully!");
			}
			break;
			 
			default:
				System.out.println("No Other Update");
	    		break;
				}
			}
            connection.close();
           }
 
   private void deleteEmployeerecord() throws SQLException {
	 
	 System.out.println("Enter id number to delete:");
	 int id = Integer.parseInt(scan.next());
	 String sql = "delete from employee where id = "+id;
	 Statement statement = connection.createStatement();
	 int result = statement.executeUpdate(sql);
	 if(result!=0) {
		 System.out.println("Employee Record Delete Successfully!");
	 }
	 connection.close();
 }
 
 }

