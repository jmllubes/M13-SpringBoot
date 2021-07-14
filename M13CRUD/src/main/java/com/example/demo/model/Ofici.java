package com.example.demo.model;

public enum Ofici {

	D("director", 50000), T("tecnic", 40000), A("administratiu", 40000);

	private String nomOfici;
	private double salari;

	private Ofici(String nomOfici, double salari) {
		this.nomOfici = nomOfici;
		this.salari = salari;
	}

	public String getNomOfici() {
		return nomOfici;
	}

	public void setNomOfici(String nomOfici) {
		this.nomOfici = nomOfici;
	}

	public double getSalari() {
		return salari;
	}

	public void setSalari(double salari) {
		this.salari = salari;
	}
	
	

}
