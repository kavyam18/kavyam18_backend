package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentJdbc {

	public static void main(String[] args) {
            try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Scanner scan = new Scanner(System.in);
				String url = "jdbc:mysql://localhost:3306/jdbc";
				String user = "root";
				String pass = "Sa123";
				
				Connection connection = DriverManager.getConnection(url,user, pass);
				String query = "insert into student(name, percentage, address) values(?,?,?)";
				
				Statement statement = connection.createStatement();
				PreparedStatement preparedStatement = connection.prepareStatement(query);
				
				System.out.println("please enter the name:");
				preparedStatement.setString(1, scan.next());
				
				System.out.println("please enter the percentage:");
				preparedStatement.setDouble(2, scan.nextDouble());
				
				System.out.println("please enter the address:");
				preparedStatement .setString(3, scan.next());
				
				
				boolean execute = preparedStatement.execute();
				System.out.println(execute);
			} 
            catch (ClassNotFoundException |SQLException e) {
				
				e.printStackTrace();
			}

	}

}
