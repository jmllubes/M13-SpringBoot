package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.demo.interfaces.ICrud;
import com.example.demo.model.Empleat;

@Service
public class CrudService implements ICrud {
	
	
	@Override
	public void inserta(Empleat empleat) {
		
	}
	public void borrar(int id ) {
	}
	public void modifica(Empleat empleat) {
	}
	public Empleat getEmpleat(int id) {
		return null;
	}
	public ArrayList<Empleat> getEmpleats() {
		return null;
	}


}
