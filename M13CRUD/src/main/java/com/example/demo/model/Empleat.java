package com.example.demo.model;

import java.util.Enumeration;

public class Empleat {

	private int id;
	private String nom;
	private Ofici ofici;

	
	public Empleat() {}
	
	public Empleat(int id, String nom, Ofici ofici) {
		super();
		this.id = id;
		this.nom = nom;
		this.ofici = ofici;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Ofici getOfici() {
		return ofici;
	}

	public void setOfici(Ofici ofici) {
		this.ofici = ofici;
	}

	@Override
	public String toString() {
		return "Empleat [id=" + id + ", nom=" + nom + ", ofici=" + ofici.getNomOfici() + ", salari=" + ofici.getSalari() + "]";
	}
	
	

}
