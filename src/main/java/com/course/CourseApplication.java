package com.course;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.course.dominio.Pessoa;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApplication {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquin@gmail.com");
		Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		em.persist(p1);
		em.persist(p2);
		em.persist(p3);

		Pessoa pA = em.find(Pessoa.class, 2);
		Pessoa pB = new Pessoa(null, "Joaquim Torres", "joaquin@gmail.com");

		em.remove(pB); // Detached entity - Do not remove

		em.getTransaction().begin(); // When a operation different from a query needs to start transaction
		em.remove(pA); // Monitored entity - remove
		em.getTransaction().commit();

		em.getTransaction().commit();
		System.out.println("Pronto!");

		em.close();
		emf.close();
	}

}
