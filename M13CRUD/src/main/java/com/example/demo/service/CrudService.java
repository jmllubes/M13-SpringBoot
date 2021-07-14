package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.interfaces.ICrud;
import com.example.demo.model.Empleat;

@Service
public class CrudService implements ICrud {

	private List<Empleat> llistaEmp = new ArrayList<>();

	public void inserta(Empleat empleat) {
		llistaEmp.add(empleat);
		System.out.println("Empleat registrat correctament: " + empleat.toString());

	}

	public void borrar(int id) {

		for (Empleat empleat : llistaEmp) {
			if (empleat.getId() == id) {
				llistaEmp.remove(empleat);
				System.out.println("Empleat borrat correctament " + empleat.toString());
			}
		}

	}

	public void modificar(Empleat empleat) {

		for (Empleat empleat2 : llistaEmp) {
			if (empleat2.getId() == empleat.getId()) {
				llistaEmp.remove(empleat2);
				llistaEmp.add(empleat);
				System.out.println("Empleat actualitzat correctament " + empleat.toString());
			}
		}

	}

	public Empleat getEmpleat(int id) {
		Empleat e = null;

		for (Empleat empleat : llistaEmp) {
			if (empleat.getId() == id) {
				e = empleat;
				System.out.println("Empleat trobat!");
				break;
			}

		}
		if (e == null) {

			System.out.println("No s'ha trobat l'empleat.");

		}
		return e;
	}
	
	public Empleat getEmpleatOfici(String nomOfici) {
		Empleat e = null;

		for (Empleat empleat : llistaEmp) {
			if (empleat.getOfici().getNomOfici().equals(nomOfici)) {
				e = empleat;
				System.out.println("Empleat trobat!");
				break;
			}

		}
		if (e == null) {

			System.out.println("No s'ha trobat l'empleat.");

		}
		return e;
	}

	public List<Empleat> getEmpleats() {
		return llistaEmp;
	}



}
