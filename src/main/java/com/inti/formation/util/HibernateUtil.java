package com.inti.formation.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	public static SessionFactory factory;
	
	public HibernateUtil() {
		factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}
	
	public static SessionFactory getSessionFatory() {
		if(factory == null ) {
			System.out.println("Nouvelle connexion etabli a la base de donnes");
			new HibernateUtil();
		} else {
			System.out.println("Connexion deja existante");
		}
		return factory;		
	}
	
}
