package com.example.demo.interfaces;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Empleat;

public interface ICrud {
	public void inserta(Empleat empleat);
	public void borrar(int id );
	public void modificar(Empleat empleat);
	public Empleat getEmpleat(int id);
	public List<Empleat> getEmpleats();
}
