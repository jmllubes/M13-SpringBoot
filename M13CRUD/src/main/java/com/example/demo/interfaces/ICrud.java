package com.example.demo.interfaces;

import java.util.ArrayList;

import com.example.demo.model.Empleat;

public interface ICrud {
	public void inserta(Empleat empleat);
	public void borrar(int id );
	public void modifica(Empleat empleat);
	public Empleat getEmpleat(int id);
	public ArrayList<Empleat> getEmpleats();
}
