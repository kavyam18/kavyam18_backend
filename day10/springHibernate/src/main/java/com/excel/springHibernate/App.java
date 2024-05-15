package com.excel.springHibernate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
         StudentDao dao = context.getBean("studentDao", StudentDao.class);
         Student student = new Student();
//    	 student.setId(1);
//    	 student.setName("Dee");
//    	 student.setCity("Bellur");
    	 
//  	     int res = dao.insertStudent(student);
//         System.out.println(res);
         
//         Student update= dao.updateStudent(new Student(3,"Divya","Manglore"));
//         System.out.println(update);
//         
//         student.setId(4);
//         Student delete = dao.deleteStudent(student);
//         System.out.println(delete);
//         
         
//         Student id = dao.getById(5);
//         System.out.println(id);
         
         List<Student> list = dao.getStudents();
         for(Student index:list) {
        	 System.out.println(index);
         } 
         
    }
    
}
