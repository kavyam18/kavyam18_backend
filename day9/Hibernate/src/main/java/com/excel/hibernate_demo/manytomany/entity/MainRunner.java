package com.excel.hibernate_demo.manytomany.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunner {

	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	public static void main(String[] args) {
		
		factory = Persistence.createEntityManagerFactory("student");
	      manager = factory.createEntityManager();
	       transaction = manager.getTransaction();
  
	       List<Book> books = new ArrayList<Book>();
	       List<Student> students = new ArrayList<Student>();
	       
	       Book b1 = new Book();
	       Book b2 = new Book();
	       Book b3 = new Book();
	       
	        Student student1 = new Student();
	        Student student2 = new Student();
	        Student student3 = new Student();
	        
	        student1.setName("John");
	        student1.setBooks(books);
	        student2.setName("Oliver");
	        student1.setBooks(books);
	        student3.setName("Rohan");
	        student1.setBooks(books);
	        
	        b1.setTitle("Rich Dad Poor Dad");
	        b2.setTitle("cosmos");
	        b3.setTitle("othello");
	        
	        books.add(b1);
	        books.add(b2);
	        books.add(b3);
	        
	        students.add(student1);
	        students.add(student2);
	        students.add(student3);
	        
	        b1.setStudent(students);
	        b2.setStudent(students);
	        b3.setStudent(students);
	        
	        transaction.begin();
	        manager.persist(student1);
	        transaction.commit();
	        
	}

}
