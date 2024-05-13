package com.excel.hotelmanagement.services;

import com.excel.hotelmanagement.entity.Guests;
import com.excel.hotelmanagement.entity.Reservation;
import com.excel.hotelmanagement.entity.Rooms;
import com.excel.hotelmanagement.entity.Users;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.transaction.Transaction;

public class MainRunner {
  
	private static EntityManagerFactory  emf;
	private static EntityManager em;
	private static EntityTransaction et;
	
	public static void main(String[] args) {
        
		 Persistence.createEntityManagerFactory("hotel");
		 emf.createEntityManager();
		 em.getTransaction();
		 
		 Rooms room = new Rooms();
		 Guests guest = new Guests();
		 Reservation reservation = new Reservation();
		 Users user = new Users();
		 
		 
		 em.persist(room);
		 em.persist(guest);
		 em.persist(reservation);
		 em.persist(user);
		 
		 et.begin();
		 et.commit();
		 em.close();
		
		 
	}

}
