package com.imfe.ejemploserviceimplementado.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.imfe.ejemploserviceimplementado.services.ComidaService;

@Controller
@RequestMapping("/pedir")
public class ComidaController {
	
	@Autowired
	private ComidaService cocina; // Para no crear una objeto cada vez k lo necesite, con esto ya me lo crea automaticamente
	
	//Controller pasándole un parámetro y con parámetro por defecto 1
	@RequestMapping(value="/hamburguesa")
	public String hamburguesa(Model model, @RequestParam(name="cantidad",defaultValue="1") Integer cantidad) {
		String mensaje="Te doy "+cantidad+ " burger";
		model.addAttribute("rdo",mensaje);
		return "index";
	}
	
	//Controller sin pasarle ningún parámetro, sin pasarle ningún parámetro devuelvo 1
	@RequestMapping(value="/hotdog")
	public String hotdog(Model model) {
		
		String mensaje="Te doy 1 hotdog";
		model.addAttribute("rdo",mensaje);
		
		return "index";
	}
	
	//Controller pasándole un parámetro con formato ->hotdog/10
	@RequestMapping(value="/hotdog/{numero}")
	public String hotdog(Model model, @PathVariable("numero") Integer numero) { //PathVariable convierte en una variable el parámetro pasado de forma ->hotdog/10 
		System.out.println(numero);
		String mensaje="Te doy "+numero+ " hotdog";
		model.addAttribute("rdo",mensaje);
		
		return "index";
	}
	
		

}
