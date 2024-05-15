package com.excel.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        EmployeeDao dao = context.getBean("employeeDao", EmployeeDao.class);
        Employee employee = new Employee();
//        employee.setId(116);
//        employee.setName("Dhanush");
//       employee.setPlace("Mysore");
//      
//        int res = dao.insertEmployee(employee);
//        System.out.println(res);
//       
//       int res1 = dao.updateEmployee(new Employee(114,"Divya","Mysore"));
//        System.out.println(res1);
//       
//        
//        employee.setId(114);
//        int res2 = dao.deleteEmployee(employee);
//        System.out.println(res2);
      
        List<Employee> list =(List<Employee>) dao.getAllEmployee();
        
        for(Employee index : list) {
            System.out.println(index);
        }
    }
}
