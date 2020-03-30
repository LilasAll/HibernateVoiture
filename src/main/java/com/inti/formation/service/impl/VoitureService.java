package com.inti.formation.service.impl;

import java.util.List;

import com.inti.formation.dao.IVoitureDao;
import com.inti.formation.dao.impl.VoitureDao;
import com.inti.formation.entities.Voiture;
import com.inti.formation.service.IVoitureService;

public class VoitureService implements IVoitureService {

	IVoitureDao dao = new VoitureDao();
	
	@Override
	public void ajouter(Voiture v) {
		dao.ajouter(v);
	}

	@Override
	public void update(Voiture v) {
		dao.update(v);
	}

	@Override
	public void delete(Voiture v) {
		dao.update(v);
	}

	@Override
	public Voiture getById(int id) {
		return dao.getById(id);
	}

	@Override
	public List<Voiture> getAll() {
		return dao.getAll();
	}

}
