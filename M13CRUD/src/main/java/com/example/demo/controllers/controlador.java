package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Empleat;
import com.example.demo.model.Ofici;
import com.example.demo.service.CrudService;

@Controller
public class controlador {

	@Autowired
	CrudService empleatService;
	
	@RequestMapping
	public String getEmpleats(Model model) {
		
		List<Empleat> llistaEmpleats = empleatService.getEmpleats();
		
		model.addAttribute("empleats", llistaEmpleats);
		
		return "index";
	}

	@GetMapping("/buscar/{id}")
	public String buscarEmpleatId(Model model, Integer id) {
		
		model.addAttribute("Empleats", empleatService.getEmpleat(id));
		
		return "index";
	}
	
	@GetMapping("/buscar/{nomOfici}")
	public String buscarEmpleatOfici(Model model, String nomOfici) {
		
		model.addAttribute("Empleats", empleatService.getEmpleatOfici(nomOfici));
		
		return "index";
	}
	
	@RequestMapping({"/editar", "/editar/{id}"})
	public @ResponseBody String editarEmpleat(Model model, @PathVariable("id") Optional<Integer> id) {
		
		System.out.println("RequestMapping: 'editarEmpleatPorId");
		
		if(id.isPresent()) {
			Empleat empleat = empleatService.getEmpleat(id.get());
			System.err.println("Modificando Empleat" + empleat.toString());
			model.addAttribute("Empleat", empleat);
		}else {
			model.addAttribute("Empleat", new Empleat());
		}
		
		return "redirect:/";
	}
	
	@RequestMapping("/eliminar/{id}")
	public String eliminarEmpleat(Model model, @PathVariable("id") Integer id) {
		System.out.println("RequestMapping: 'eliminarEmpleatPorId' " + id);
		
		empleatService.borrar(id);
		
		return "redirect:/";
	}
	
	@RequestMapping("/crear")
	public String crearEmpleat(Model model) {
		
		System.out.println("RequestMapping: 'crearEmpleat'");
		model.addAttribute("empleat", new Empleat());
		
		return "crear";
	}
	
	@RequestMapping(path = "/modificarEmpleat", method = RequestMethod.POST)
	public String modificarEmpleat(String nom, String ofici) {
		
		System.out.println("RequestMapping: 'modificarEmpleat'");
		System.err.println(nom);
		System.err.println(ofici);
		
		Empleat empleat = new Empleat(1,nom,Ofici.valueOf(ofici));
		System.out.println(empleat);
		empleatService.inserta(empleat);
		
		return "redirect:/";
	}
	
}
