package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.BookingDTO;

public class BookingDAO {
EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("dev");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction= entityManager.getTransaction();

public void insert( BookingDTO bookingDTO)
   { 
	entityTransaction.begin();
	entityManager.persist(bookingDTO);
	entityTransaction.commit();
   }
}