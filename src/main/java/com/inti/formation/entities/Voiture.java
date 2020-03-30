package com.inti.formation.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Voiture {

	private int id;
	private String marque;
	private String modele;
	private String couleur;
	private int puissance;
	
	public Voiture() {
		super();
	}

	public Voiture(int id, String marque, String modele, String couleur, int puissance) {
		super();
		this.id = id;
		this.marque = marque;
		this.modele = modele;
		this.couleur = couleur;
		this.puissance = puissance;
	}

	@Id 
	public int getId() {
		return id;
	}

	public String getMarque() {
		return marque;
	}

	public String getModele() {
		return modele;
	}

	public String getCouleur() {
		return couleur;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	@Override
	public String toString() {
		return "Voiture [id=" + id + ", marque=" + marque + ", modele=" + modele + ", couleur=" + couleur
				+ ", puissance=" + puissance + "]";
	}
	
	
	
}
