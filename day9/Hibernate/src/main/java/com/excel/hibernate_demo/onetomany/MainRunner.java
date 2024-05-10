package com.excel.hibernate_demo.onetomany;

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
	       
	       List<Laptop> laptops = new ArrayList<>();
	       Laptop laptop1 = new Laptop();
	       Laptop laptop2 = new Laptop();
	       Laptop laptop3 = new Laptop();
	       Student student = new Student();
	       
	       laptop1.setBrand("dell");
	       laptop1.setSerialNo("ASDFAS324332A");
	       laptop1.setStudent(student);
	       
	       laptop2.setBrand("lenovo");
	       laptop2.setSerialNo("ASDIBF324332A");
	       laptop2.setStudent(student);
	       
	       laptop3.setBrand("hp");
	       laptop3.setSerialNo("UTSFAS324332A");
	       laptop3.setStudent(student);
	       
	       laptops.add(laptop1);
	       laptops.add(laptop2);
	       laptops.add(laptop3);
	       
	       student.setName("gokul");
	       student.setAge(24);
	       student.setLaptops(laptops);
	       
	       transaction.begin();
	       manager.persist(laptop1);
	       manager.persist(laptop2);
	       manager.persist(laptop3);	       
	       transaction.commit();
	       System.out.println(manager.find(Student.class, 1));
	       

	}

}
