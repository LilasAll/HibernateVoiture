package com.inti.formation.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.inti.formation.dao.IVoitureDao;
import com.inti.formation.entities.Voiture;
import com.inti.formation.util.HibernateUtil;

public class VoitureDao implements IVoitureDao {

	@Override
	public void ajouter(Voiture v) {
		SessionFactory sf = HibernateUtil.getSessionFatory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.save(v);
		tx.commit();
		s.close();
	}

	@Override
	public void update(Voiture v) {
		SessionFactory sf = HibernateUtil.getSessionFatory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.update(v);
		tx.commit();
		s.close();
		
	}

	@Override
	public void delete(Voiture v) {
		SessionFactory sf = HibernateUtil.getSessionFatory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.delete(v);
		tx.commit();
		s.close();
	}

	@Override
	public Voiture getById(int id) {
		SessionFactory sf = HibernateUtil.getSessionFatory();
		Session s = sf.openSession();
		
		Voiture v = s.get(Voiture.class, id);
		s.close();
		return v;
	}

	@Override
	public List<Voiture> getAll() {
		SessionFactory sf = HibernateUtil.getSessionFatory();
		Session s = sf.openSession();
		
		Query query = s.createQuery("From Voiture");
		
		List<Voiture> voitures = query.getResultList();
		s.close();
		return voitures;
	}

}
