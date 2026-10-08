package controller;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Student s1=new Student();
		s1.setStd_id(1);
		s1.setStd_name("Mithun");
		s1.setStd_sec('A');
		
		Student s2=new Student();
		s2.setStd_id(2);
		s2.setStd_name("Dinkar");
		s2.setStd_sec('A');
		
		
		et.begin();
		em.persist(s1);
		em.persist(s2);
		et.commit();
		System.out.println("Value inserted");
		
		
		
		
	}

}
