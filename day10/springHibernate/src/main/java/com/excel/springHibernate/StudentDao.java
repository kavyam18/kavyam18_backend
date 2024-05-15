package com.excel.springHibernate;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

public interface StudentDao {

	int insertStudent(Student student);

	Student updateStudent(Student student);

	Student deleteStudent(Student student);

	Student getById(int id);

	List<Student> getStudents();

	
	
}
