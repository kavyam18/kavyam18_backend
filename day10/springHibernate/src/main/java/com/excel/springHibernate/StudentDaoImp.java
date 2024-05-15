package com.excel.springHibernate;



import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;



@Component("studentDao")

public class StudentDaoImp  implements StudentDao{
	
	@Autowired
	private	HibernateTemplate hibernatetemplate;  
	 
	@Transactional
	@Override
	public int insertStudent(Student student) {
//		String query = "insert into Student(id,name,city) Values(?,?,?)";
		int i =(int)hibernatetemplate.save(student);
		return i;
	}
	@Transactional
	@Override
	public Student updateStudent(Student student) {
		  hibernatetemplate.update(student);
		return student;
		
	}
	@Transactional
	@Override
	public Student deleteStudent(Student student) {
		hibernatetemplate.delete(student);
		return student;
	}
	@Transactional
	@Override
	public Student getById(int id){  
		Student student=(Student)hibernatetemplate.get(Student.class,id);  
	    return student;  
	}  
		
	@Transactional
	@Override
	public List<Student> getStudents(){  
	    List<Student> list=new ArrayList<Student>();  
	    list=hibernatetemplate.loadAll(Student.class);  
	    return list;  
	}   
}  
   

