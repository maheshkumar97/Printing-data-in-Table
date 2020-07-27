package com.mvc.get;

import com.mvc.get.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Connections {

	public int save(Products product) throws SQLException {

		int id=0;
		try {
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("TabletoShowData");
			EntityManager em = emf.createEntityManager();
			
			em.getTransaction().begin();
			
			em.persist(product);
			
			id = product.getId();
			
			em.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return id;

	}

	public List<Products> getAll() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TabletoShowData");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Query q = em.createNativeQuery("Select * from Product",Products.class);
		
		@SuppressWarnings("unchecked")
		List<Products> list = q.getResultList();
		return list;

	}
}
