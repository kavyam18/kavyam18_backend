package com.excel.springjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component("employeeDao")
public class EmployeeDaoImp implements EmployeeDao{
	
	 @Autowired
	 private JdbcTemplate jdbcTemplate;
	 
     @Override
     public int insertEmployee(Employee employee) {
    	 String query = "insert into employee(id,name,place) values(?,?,?)";
    	 return jdbcTemplate.update(query,employee.getId(),employee.getName(),employee.getPlace());
     }
     @Override
     public int updateEmployee(Employee employee) {
    	 String query1 = "update employee set name = ?,place=? where id = ?";
    	 return  jdbcTemplate.update(query1,employee.getName(),employee.getPlace(),employee.getId() );
}
     @Override
     public int deleteEmployee(Employee employee) {
    	 String query2 = "delete from employee where id = ?";
    	 return jdbcTemplate.update(query2,employee.getId());
     }

	@Override
	public List<Employee> getAllEmployee(){
		String sql = "select * from employee";
		return jdbcTemplate.query(sql, new RowMapper<Employee>() {

		
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee employee = new Employee();
				employee.setId(rs.getInt(1));
				employee.setName(rs.getString(2));
				employee.setPlace(rs.getString(3));
				return employee;
			}
			
		});
		
	}
}