package com.inti.formation.dao;

import java.util.List;

import com.inti.formation.entities.Voiture;

public interface IVoitureDao {

	public void ajouter(Voiture v);
	public void update(Voiture v);
	public void delete(Voiture v);
	public Voiture getById(int id);
	public List<Voiture> getAll();
	
}
