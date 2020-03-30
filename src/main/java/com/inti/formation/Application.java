package com.inti.formation;

import com.inti.formation.dao.IVoitureDao;
import com.inti.formation.dao.impl.VoitureDao;
import com.inti.formation.entities.Voiture;

public class Application {

	public static void main(String[] args) {
		IVoitureDao dao = new VoitureDao();
		Voiture v = new Voiture(3, "Ferrari", "Bolide", "Rouge", 500);
		dao.update(v);
	}
	
}
